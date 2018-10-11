/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author eldis
 */
public class SQLUtil {
    
    static Connection conexao;
    
    public static String INSERIR_VAQUEIRO = "insert into vaqueiro (nome,esteira,representacao,tipo,observacao)"
            + " values (?,?,?,?,?)";
    public static String SELECT_ALL_VAQUEIRO = "select * from vaqueiro order by nome";
    public static String SELECT_BY_ID_VAQUEIRO = "select * from ndk where id=?";
    
    public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/ndk";
    public static String USUARIO_POSTGRES = "postgres";
    public static String SENHA_POSTGRES = "123";
    
    private SQLUtil() {

    }
    
    public static PreparedStatement prepareStatement(String SQL) throws Exception {
        conexao =  ConnectionFactory.getConexao(ConnectionFactory.BD__POSTGRESS);
        return conexao.prepareStatement(SQL);
    }
    
    public static int getLastIdTabela(String nomeTabela){
        int id = 0;
        try {
            conexao = ConnectionFactory.getConexao(ConnectionFactory.BD__POSTGRESS);
            //PreparedStatement statement = conexao.prepareStatement("select * from " + nomeTabela + " order by id desc limit 1");
            PreparedStatement statement = conexao.prepareStatement("select * from " + nomeTabela + " order by id desc limit 1");
            ResultSet result = statement.executeQuery();
            result.next();
            id = result.getInt(1);
            
        } catch (SQLException e) {
           
        }
        return id;
    }
}
