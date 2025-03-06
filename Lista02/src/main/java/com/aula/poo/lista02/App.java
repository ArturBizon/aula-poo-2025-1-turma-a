/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula.poo.lista02;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Artur
 */
public class App {
    public static void main(String[] args) {
        
        ContaBancaria c1, c2;
        
        c1 = new ContaBancaria();
        c1.setNumero("    ");
        c1.setTitular("Agostinho Carrara");
        
        c2 = new ContaBancaria();
        c2.setNumero("3344-8");
        c2.setTitular("Beissola");
        
        c1.depositar(1000);
        c1.depositar(700);
        
        c2.depositar(5000);
        c2.sacar(3000);
        
        c2.transferir(c1, 1800);
        
        System.out.println("Conta 1 titular " 
                + c1.getTitular() 
                + " saldo " + c1.getSaldo());
        
        System.out.println("Conta 2 titular " 
                + c2.getTitular() 
                + " saldo " + c2.getSaldo());
                
    }
   
}
