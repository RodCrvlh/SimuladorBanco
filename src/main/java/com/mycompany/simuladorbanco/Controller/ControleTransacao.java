/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.Controller;

/**
 *
 * @author digao
 */
public class ControleTransacao {
 
    public boolean verificarSaque(float saldo, float saque){
        
        if (saldo < saque){
            return false;
        }
        
        else{
            return true;
        }
    }
}
