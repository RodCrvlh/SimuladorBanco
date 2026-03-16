    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.Controller;

import com.mycompany.simuladorbanco.Model.Autenticador;
import com.mycompany.simuladorbanco.View.JanelaLogin;

/**
 *
 * @author digao
 */
public class ControleLogin {
    
    JanelaLogin janelaLogin;
    Autenticador autenticador;
    
    
    public ControleLogin(){
        
        janelaLogin = new JanelaLogin();
        autenticador = new Autenticador();
        configurarEventos();
   
    }
    
    private void configurarEventos(){
        janelaLogin.getContaField().addActionListener(e -> validarAcesso());
        janelaLogin.getSenhaField().addActionListener(e -> validarAcesso());
   
    }
    
    private void validarAcesso(){
    
        String usuario = janelaLogin.getContaField().getText(); 
        String senha = janelaLogin.getSenhaField().getText();
        
        autenticador.autenticar(usuario, senha);
                
        if (autenticador.autenticar(usuario, senha)){
            janelaLogin.FecharJanela();
        }
        else{
            janelaLogin.setErroLabel("Usuário ou Senha incorretos");
            janelaLogin.setContaText("");
            janelaLogin.setSenhaText("");
        }
    }
}
