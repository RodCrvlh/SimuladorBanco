/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.View;

/**
 *
 * @author digao
 */

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;




public class JanelaLogin extends JanelaBase{
    
    private JLabel erroLabel;
    private JLabel usuarioLabel;
    private JTextField contaField;
    private JLabel senhaLabel;
    private JPasswordField senhaField;
    
    
    public JanelaLogin(){
        
        super("Login");
        inicializarComponentes();        
        setVisible(true);
    }
    
    
    public void inicializarComponentes(){
        
        erroLabel = new JLabel("");
        erroLabel.setBounds(8,0,160,80);
        erroLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 13));
        
        usuarioLabel = new JLabel("Usuário");
        usuarioLabel.setBounds(8,20,80,80);
        usuarioLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 13));

        
        contaField = new JTextField();
        contaField.setBounds(8, 75, 250, 20);
        
        senhaLabel = new JLabel("Senha");
        senhaLabel.setBounds(8, 95, 200, 80);
        senhaLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 13));
        
        
        senhaField = new JPasswordField();
        senhaField.setBounds(8, 150, 250, 20);
        
        
        panel.add(erroLabel);
        panel.add(usuarioLabel);
        panel.add(contaField);
        panel.add(senhaLabel);
        panel.add(senhaField);
        
        setSize(280,220);
    }
    
    public JTextField getContaField(){
        return contaField;
    }
    
    public JPasswordField getSenhaField(){
        return senhaField;
    }
    
    public void setErroLabel(String texto){ 
        erroLabel.setText(texto);
    }
    
    public void setContaText(String texto){
        contaField.setText(texto);
    }
    
    public void setSenhaText(String texto){
        senhaField.setText(texto);
    }
}