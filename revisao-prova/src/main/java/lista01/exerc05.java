/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class exerc05 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Calculadora");
        System.out.println("-".repeat(30));
        
        System.out.println("Digite um número:");
        Double primeiroNumero = in.nextDouble();
        
        System.out.println("Digite outro número:");
        Double segundoNumero = in.nextDouble();
        
        //Calculos:
        Double soma = primeiroNumero + segundoNumero;
        Double subtracao = primeiroNumero - segundoNumero;
        Double multiplicacao = primeiroNumero * segundoNumero;
        Double divisao = primeiroNumero / segundoNumero;
        
        String frase = String.format("Resultados:\nSoma: %.0f\nSubtração: %.1f"
                + "\nMultiplicação: %.1f\nDivisão: %.1f", soma, subtracao,
                multiplicacao, divisao);
        
        System.out.println(frase);
        
        
    }
}
