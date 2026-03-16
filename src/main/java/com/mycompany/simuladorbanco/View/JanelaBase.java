/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.View;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author digao    
 */
public abstract class JanelaBase extends JFrame{
    
     protected JPanel panel;
    
     public JanelaBase(String nomeJanela){
         FlatDarkLaf.setup();
         panel = new JPanel();
         add(panel, BorderLayout.CENTER);
         setTitle("Sistema Bancário "+nomeJanela);
         pack();
         setSize(720,720);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
         panel.setLayout(null);
     }
        
     public abstract void inicializarComponentes();
    
    public void FecharJanela(){
        
        dispose();
   
    }
}

    