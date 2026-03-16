/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.Controller;

import com.mycompany.simuladorbanco.Model.Conta;
import com.mycompany.simuladorbanco.View.JanelaPix;

/**
 *
 * @author digao
 */
public class ControlePix {
    
    JanelaPix janelaPix;
    Conta remetente;
    Conta destinatario;
    
    public ControlePix() {
       
        janelaPix = new JanelaPix();
        configurarEventos();
    }
    
   private void configurarEventos(){
       
       janelaPix.getChaveField().addActionListener(e -> encontrarDestinatario());
       janelaPix.getValorField().addActionListener(e -> realizarPix());
       
   }
   
   private void encontrarDestinatario(){
       
       String chave = janelaPix.getChaveField().getText();
       
       
   }
   
   private void realizarPix(){
       
       float valor =  Float.parseFloat(janelaPix.getValorField().getText());
       
       remetente.sacarDinheiro(valor);
       destinatario.depositarDinheiro(valor);
   
   }
}
