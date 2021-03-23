/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author endot
 */
public class conexao {
    public static Connection getconexao(){
        
        //sempre começar com conexão == null
        Connection conn = null;
        
        // tente conectar ou apresente mensage de erro
        try
        {
        //parâmetros para URL
        String server_name = "localhost:3307/";
        String database = "sistema_entregas";
        String user_name= "root";
        String password = "usbw";
        String url = "jdbc:mysql://" + server_name + database;
        
        
        
        conn = DriverManager.getConnection(url, user_name, password);
            System.out.println("Conectado com Sucesso");
        
        }
        catch(SQLException e){
            System.out.println("Erro de conexão SQL");
        }
                return conn;
        }
    
    
    
}
