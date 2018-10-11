/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Connection.SQLUtil;
import fachada.Fachada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Vaqueiros;
//import sql.SQLUtil;
import view.Mensagem;
/**
 *
 * @author eldis
 */
public class VaqueiroDao {
    private PreparedStatement statement;
    
    
    public Vaqueiros cadastrar(Vaqueiros vaqueiro){
        //Precisa cadastrar primeiro o endereço
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_VAQUEIRO);
            
//            insert into aluno (nome,cpf,data_nascimento,sexo,vencimento_mens,endereco_id)email,celular
            statement.setString(1, vaqueiro.getNome());
            statement.setString(2, vaqueiro.getEsteira());
            statement.setString(3, vaqueiro.getRepresentacao());
            statement.setString(4, vaqueiro.getTipo());
            statement.setString(5, vaqueiro.getObservacao());
            
            statement.execute();
            vaqueiro.setId(SQLUtil.getLastIdTabela("vaqueiro"));
            
            return vaqueiro;
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar vaqueiro!\n"+ex.getMessage());
        }
        return null;
    }
    
    public Vaqueiros getVaqueirosById(int id){
        ResultSet result;
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_VAQUEIRO);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(VaqueiroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Vaqueiros getVaqueiroByNome(String nome){return null;}
    
    public ArrayList<Vaqueiros> getAll(){
        ArrayList<Vaqueiros> vaqueiro = new ArrayList<>();
        ResultSet result;
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_ALL_VAQUEIRO);
            result = statement.executeQuery();
            while (result.next()) {                
                vaqueiro.add(get(result));
            }
                    
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao pegar todos os Vaqueiros!");
        }
        
        return vaqueiro;
    }

    private Vaqueiros get(ResultSet result){
        Vaqueiros a = new Vaqueiros();
        Fachada f = Fachada.getInstance();
        try {
            a.setId(result.getInt(1));
            a.setNome(result.getString(2));
            a.setEsteira(result.getString(3));
            a.setRepresentacao(result.getString(4));
            a.setTipo(result.getString(5));
            a.setObservacao(result.getString(6));
            
        } catch (SQLException ex) {
            Logger.getLogger(VaqueiroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    
}
