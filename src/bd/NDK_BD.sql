/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  eldis
 * Created: 10/10/2018
 */
CREATE TABLE vaqueiro(
	id serial PRIMARY KEY,
	nome Varchar(55), 
	esteira Varchar(100), 
	representacao Varchar(100), 
	observacao Varchar(255), 
	tipo Varchar(100), 
);

INSERT INTO vaqueiro (nome,esteira,representacao,observacao,tipo) VALUES
            ("Eldis","esteir","go","Foda","Casadinha")