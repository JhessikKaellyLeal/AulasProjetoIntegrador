/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
// classe para conectar com banco de dados
public class ConexaoComBancoDados {
    
   /* criação de um método para ligação 
     com banco de dados mysql */
    public static Connection conectar(){
        Connection conexao = null;
        
        // váriaveis do banco de dados
        String url ="jdbc:mysql://localhost:3306/academiaTreineMais";
        String usuario="root";
        String senha="";
        
        // auxilia no tratamento de erros
        try{
           conexao = DriverManager.getConnection
        (url,usuario,senha);
            System.out.println("Conexão bem sucedida!");
            
        }catch(SQLException e){
            System.out.println("Erro de conexão "+
                    e.getMessage());
        }// fim do trycatch
        
        return null;
        
    } // fim do metodo
       
}// fim da classe
