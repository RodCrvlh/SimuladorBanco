/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.Controller;

import com.mycompany.simuladorbanco.View.JanelaMenu;

/**
 *
 * @author digao
 */
public class ControleMenu {
    
    private JanelaMenu janelaMenu;

    public ControleMenu(){
        
        janelaMenu = new JanelaMenu();
        configurarEventos();
    }
    
    private void configurarEventos(){
        
        janelaMenu.getPixButton().addActionListener(e -> abrirPixMenu());
        janelaMenu.getCartaoButton().addActionListener(e -> abrirCartaoMenu());
        janelaMenu.getExtratoButton().addActionListener(e -> abrirExtratoMenu());
                
    }
        
    private void abrirPixMenu(){
        
        janelaMenu.FecharJanela();
        new ControlePix();
    
    }
    
    private void abrirCartaoMenu(){
    
        janelaMenu.FecharJanela();
        new ControleCartao();
    }
    
    private void abrirExtratoMenu(){
        
        janelaMenu.FecharJanela();        
        new ControleExtrato();
    }
}
