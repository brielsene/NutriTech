/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoDAO {
    
        //public Connection conectaBD(){
        //Connection conn = null;
        
        //try {
           // String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=NinoCosta@321" ;
           // conn = DriverManager.getConnection(url);
            
        //} catch (SQLException erro) {
            //JOptionPane.showMessageDialog(null,"ConexaoDAO"+ erro.getMessage());
       // }
       // return conn;
    //}
    
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/banconutritech?user=root&password=NinoCosta@321";
            conn = DriverManager.getConnection(url);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"ConexaoDAO"+ erro.getMessage());
        }
        
        return conn;
    }
    
}
