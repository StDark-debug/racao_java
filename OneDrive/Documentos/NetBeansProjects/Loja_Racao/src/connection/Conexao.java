/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author endot
 */
public class Conexao {
    public static Connection getConexao(){
        Connection conn = null;
        
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistema_entregas", "root", "usbw");
            System.out.println("Conectado com sucesso! ");
        }catch(SQLException e){
            System.out.println("Erro ao se conectar");
        }
        return conn;
        }

    static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
