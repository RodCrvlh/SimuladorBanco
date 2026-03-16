/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author digao
 */
public class ConexaoBanco {
   
    public void conectar(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/banco", "usuario", "senha");
        }catch(ClassNotFoundException e){
            System.out.println("Driver de Banco de Dados não localizado");
        }catch(SQLException e){
            System.out.println("Ocorreu um erro ao acessar o Banco");
        }
    }C:\Users\digao\OneDrive\Documentos\NetBeansProjects\SimuladorBanco\src\main\java\com\mycompany\simuladorbanco\ConexaoBanco.java
}
