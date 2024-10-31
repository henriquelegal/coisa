/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UsuarioDTO;
import Tela.TelaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class UsuarioDAO {

    public static UsuarioDAO objUsuarioDAO;

Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void logar(UsuarioDTO objusuarioDTO) {
        String sql = "select * from usuarios where nome = ? and senha = ?";
        conexao = ConexaoDAO.conector();

        try {
            // preparar a consulta no banco, em função ao que foi inserido nas caixas de texto
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objusuarioDTO.getPerfil_usuario());
            pst.setString(2, objusuarioDTO.getSenha_usuario());

//            executa a query
            rs = pst.executeQuery();
//            verifica se existe usuario
            if (rs.next()) {
                // obtem o conteúdo do atributo perfil
                String perfil = rs.getString(5);
//                System.out.println(perfil);

                //tratamento de perfil
                if (perfil.equals("admin")) {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.Lab.setEnabled(true);
                    conexao.close();//Fechar a conexão                    
                } else {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    conexao.close();//Fechar a conexão   

                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha invalidos");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "* Metodo Logar **" + e);
        }
        
    }
}
