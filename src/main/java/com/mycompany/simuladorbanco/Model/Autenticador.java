/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.Model;

import java.util.ArrayList;

/**
 *
 * @author digao
 */
public class Autenticador {
    
    private ArrayList<Login> logins;
    
    public Autenticador(){
        
        logins = new ArrayList<Login>();
        inicializarArray();
    }
    
    public void inicializarArray(){
        
        Login novoLogin = new Login();
        novoLogin.setUsuario("Rodrigo");
        novoLogin.setSenha("1234");
        logins.add(novoLogin);
        
        Login novoLogin2 = new Login();
        novoLogin2.setUsuario("Davi");
        novoLogin2.setSenha("4321");
        logins.add(novoLogin2);
        
    }
    
    public boolean autenticar(String usuario, String senha){
        
        
        for (Login login : logins){
        
            if(login.getUsuario().equals(usuario)){
                if(login.getSenha().equals(senha)){
                   
                    
                    return true;
                }
            }
        }
        
        return false;
        
    }
}
