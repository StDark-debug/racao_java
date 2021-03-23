/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectioon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author endot
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3307/sistema_entregas";
    private static final String USER = "root";
    private static final String PASS = "usbw";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException ("Erro na conexão", ex);
        } //fechamento do catch
    } // fechamento Connection
    
    public static void closeConnection (Connection con){
        if (con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro");
            }
        }
    }
    
    //O objeto "Statement" é o responsável por receber os comandos SQL e fazer 
    //o envio das informações, assim como o retorno.
    
    public static void closeConnection (Connection con, PreparedStatement stmt){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Erro");
            }
        }
        closeConnection(con);
    }
    
    public static void closeConnection (Connection con, PreparedStatement stmt, ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Erro");
            }
        }
        closeConnection(con, stmt);
    }
}
