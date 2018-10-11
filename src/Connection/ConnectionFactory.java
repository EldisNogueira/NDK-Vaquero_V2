/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Mensagem;
/**
 *
 * @author eldis
 */
public class ConnectionFactory {
    
    public static String BD__POSTGRESS = "Vaqueiro";

    private static Connection conexao = null;

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ConnectionFactory() {

    }
    
    public static Connection getConexao(String bd) {
        try {
            if (conexao == null) {

                conexao = DriverManager.getConnection(
                        SQLUtil.URL_POSTGRES,
                        SQLUtil.USUARIO_POSTGRES,
                        SQLUtil.SENHA_POSTGRES
                );

            }
        } catch (SQLException ex) {

            if ("postgres".equals(SQLUtil.SENHA_POSTGRES)) {
                SQLUtil.SENHA_POSTGRES = "129040817";
                getConexao("POSTGRES");
            } else {
                Mensagem.exibirMensagem("Problema na Conexão com o BD\n" + ex.getMessage());
            }
        }
        return conexao;
    }
  /*  private final String DRIVE = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql:localhost//5432/dbncadastro";
    private final Strig USER = ;*/
}
