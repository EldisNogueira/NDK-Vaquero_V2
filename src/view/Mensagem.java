/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author eldis
 */
public class Mensagem {
    public static void exibirMensagem(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static void exibirErro(){
        JOptionPane.showMessageDialog(null, "Você não tem permissão para efetuar essa ação!",
                "Acesso negado", JOptionPane.ERROR_MESSAGE);
    }
}
