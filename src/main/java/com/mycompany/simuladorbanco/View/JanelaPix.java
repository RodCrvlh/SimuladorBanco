/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.View;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author digao
 */
public class JanelaPix extends JanelaBase{
     
    private JLabel chaveLabel;
    private JTextField chaveField;
    private JLabel valorLabel;
    private JTextField valorField;
    private JLabel recenteLabel;
    private JLabel nenhumLabel;
    private ArrayList<JButton> contasRecentes;
     
    
    public JanelaPix(){
        super("Pix");
        inicializarComponentes();
        setVisible(true);
    }
    
    
    public void inicializarComponentes(){
        
        chaveLabel = new JLabel("Informe a chave Pix:");
        chaveLabel.setBounds(8, 25, 300, 30);
        chaveLabel.setFont(new java.awt.Font(("Arial"), java.awt.Font.PLAIN, 30));
        
        chaveField = new JTextField();
        chaveField.setBounds(8, 80, 690, 80);
        chaveField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 40));    
        
        valorLabel = new JLabel("Informe o valor do pix");
        valorLabel.setBounds(8, 180, 300, 30);
        valorLabel.setFont(new java.awt.Font(("Arial"), java.awt.Font.PLAIN, 30));
        
        valorField = new JTextField();
        valorField.setBounds(8, 220, 690, 80);
        valorField.setFont(new java.awt.Font(("Arial"), java.awt.Font.PLAIN, 40));
        
                
        recenteLabel = new JLabel("Recentes:");
        recenteLabel.setBounds(8, 320, 200, 30);
        recenteLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 30));    
        
        nenhumLabel = new JLabel("Nenhum pix foi enviado ainda!");
        nenhumLabel.setBounds(8, 360, 600, 30);
        nenhumLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 30));
        
        panel.add(chaveLabel);
        panel.add(chaveField);
        panel.add(valorLabel);
        panel.add(valorField);
        panel.add(recenteLabel);
        panel.add(nenhumLabel);
    }
    
    
    public JTextField getChaveField(){
        return chaveField;
    }
    
    public JTextField getValorField(){
        return valorField;
    }
}
