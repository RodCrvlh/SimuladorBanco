/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.View;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author digao
 */
public class JanelaMenu extends JanelaBase{
    private JLabel saldoLabel;
    private JLabel valorLabel;
    private JLabel pixLabel;
    private JButton pixButton;
    private JLabel extratoLabel;
    private JButton extratoButton;
    private JLabel cartaoLabel;
    private JButton cartaoButton;
    
    
    public JanelaMenu(){
        
        super("Menu");
        inicializarComponentes();
        setVisible(true);
        
    }
    
    
    public void inicializarComponentes(){
        
        saldoLabel = new JLabel("Saldo");
        saldoLabel.setBounds(8, 0, 100, 50);
        saldoLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 30));
                
        valorLabel = new JLabel("R$ 1920,00");
        valorLabel.setBounds(8, 8, 600, 200);
        valorLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 100));
        
        pixButton = new JButton("");
        pixButton.setBounds(108, 200, 50, 50);
        pixButton.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 100));
        
        pixLabel = new JLabel("Pix");
        pixLabel.setBounds(110, 250, 100, 50);
        pixLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 30));
        
        cartaoButton = new JButton("");
        cartaoButton.setBounds(308, 200, 50, 50);
        cartaoButton.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 30));
        
        cartaoLabel = new JLabel("Cartão");
        cartaoLabel.setBounds(290, 250, 100, 50);
        cartaoLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 30));
        
        extratoButton = new JButton("");
        extratoButton.setBounds(508, 200, 50, 50);
        extratoButton.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 30));
        
        extratoLabel = new JLabel("Extrato");
        extratoLabel.setBounds(490, 250, 100, 50);
        extratoLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 30));
        
        panel.add(saldoLabel);
        panel.add(valorLabel);
        panel.add(pixButton);
        panel.add(pixLabel);
        panel.add(cartaoButton);
        panel.add(cartaoLabel);
        panel.add(extratoButton);
        panel.add(extratoLabel);
    }
    
    public JButton getPixButton(){
        return pixButton;
    }
    
    public JButton getCartaoButton(){
        return cartaoButton;
    }
    
    public JButton getExtratoButton(){
        return extratoButton;
    }
}
