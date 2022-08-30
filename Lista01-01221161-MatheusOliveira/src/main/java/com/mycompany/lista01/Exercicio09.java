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
public class Exercicio09 {
    
    //Idade
    public static void main(String[] args) {
        
        Scanner scannerNumerico = new Scanner(System.in);
        Scanner scannerTextual = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nomeDigitado = scannerTextual.nextLine();
        
        String primeiraFrase = String.format("Olá, %s! Qual o ano de seu nascimento?", nomeDigitado);
        System.out.println(primeiraFrase);
        
        Integer anoNascimento = scannerNumerico.nextInt();
        
        Integer calculoIdade = 2030 - anoNascimento;
        
        String fraseFinal = String.format("Em 2030 você terá %d anos", calculoIdade);
        System.out.println(fraseFinal);
    }
}
