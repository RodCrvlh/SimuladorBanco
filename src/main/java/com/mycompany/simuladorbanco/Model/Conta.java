    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbanco.Model;

/**
 *
 * @author digao
 */
public abstract class Conta {
    
    private String nome;
    private float saldo;
    private float taxa;
    private Contato contato;
    private Endereco endereco;
    private Login login;
    
    public boolean sacarDinheiro(float valor){
        
        
        if (saldo >= valor){
            saldo -= valor;
            return true;
        }
        
        return false;
    }

    public void depositarDinheiro(float valor) {
      
        saldo += valor;
        
    }
}
