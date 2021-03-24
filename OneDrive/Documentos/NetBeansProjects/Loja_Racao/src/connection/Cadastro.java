/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author endot
 */
public class Cadastro {
    
    
    
    public Cadastro (String cliente, String rua, String valor, String telefone, String cpf, String numero, String cidade, String bairro, String uf, String distancia, String frete, String date){
        
        Connection con = Conexao.getConexao();
        
        try {
            
               
            String sql = "INSERT INTO ENTREGAS (cliente, rua, valor, telefone, cpf, rua_numero, cidade, bairro, uf, data) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cliente);
            stmt.setString(2, rua);
            stmt.setString(3, valor);
            stmt.setString(4, telefone);
            stmt.setString(5, cpf);
            stmt.setString(6, numero);
            stmt.setString(7, cidade);
            stmt.setString(8, bairro);
            stmt.setString(9, uf);
            stmt.setString(10, date);
            
            System.out.println(cliente);
            //execução dos comandos SQL
            stmt.execute();
            con.close();
            
        }catch(SQLException e){
            System.err.println("Erro: "+e);
        }
        
    }
}
