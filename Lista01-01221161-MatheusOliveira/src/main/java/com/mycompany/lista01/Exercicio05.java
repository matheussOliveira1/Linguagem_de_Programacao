/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner scannerNumerico = new Scanner(System.in);
        
        System.out.println("Digite um primeiro número");
        Double primeiroNumero = scannerNumerico.nextDouble();
        
        System.out.println("Digite um segundo número");
        Double segundoNumero = scannerNumerico.nextDouble();
        
        Double soma = primeiroNumero + segundoNumero;
        Double subtracao = primeiroNumero - segundoNumero;
        Double multiplicacao = primeiroNumero * segundoNumero;
        Double divisao = primeiroNumero / segundoNumero;
        
        String frase = String.format("Resultado da soma: %.1f "
                + "\nResultado da subtração: %.1f"
                + "\nResultado da multiplicação: %.1f"
                + "\nResultado da divisão: %.1f"
                , soma, subtracao, multiplicacao, divisao);
        
        System.out.println(frase);
    }
}
