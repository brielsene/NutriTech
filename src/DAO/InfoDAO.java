/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UsuarioDTO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sene
 */
public class InfoDAO {
      Connection conn;
    PreparedStatement pstm;

    //***** MUDAR TUDO AQUI
    public void inserirInfos(UsuarioDTO objUsuarioDTO) {

        String sql = "insert into usuario (nome, senha) values (?, ?)";

        conn = (Connection) new ConexaoDAO().conectaBD();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha());
           

            pstm.execute();
            pstm.close();

            
            

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "CadastroDAO" + erro);
            
        }

    }
    
}
