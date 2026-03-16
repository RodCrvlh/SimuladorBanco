/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.simuladorbanco.Model;

/**
 *
 * @author digao
 */

import com.mycompany.simuladorbanco.Controller.ControleLogin;
import com.mycompany.simuladorbanco.Controller.ControleMenu;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ControleLogin controleLogin = new ControleLogin();
        
        // WindowAdapter é abstrato, então precisamos usar Override para adaptar
        // para fechar a Janela
        controleLogin.janelaLogin.addWindowListener(new WindowAdapter(){
          @Override
          public void windowClosed(WindowEvent e){
              ControleMenu controleMenu = new ControleMenu();
              
          }
        });   
    }
    
}
