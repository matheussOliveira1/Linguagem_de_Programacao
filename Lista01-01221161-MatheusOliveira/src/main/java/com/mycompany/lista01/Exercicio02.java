/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner filhos = new Scanner(System.in);
        
        
        System.out.println("Digite quantos filhos de 0 a 3 anos você tem?");
        Integer filhosAteTresAnos = filhos.nextInt();
        
        System.out.println("Digite quantos filhos de 4 a 16 anos você tem?");
        Integer filhosAteDezesseiAnos = filhos.nextInt();
        
        System.out.println("Digite quantos filhos de 17 a 18 anos você tem?");
        Integer filhosAteDezoitoAnos = filhos.nextInt();
        
        Integer totalFilhos = filhosAteTresAnos + filhosAteDezesseiAnos + filhosAteDezoitoAnos;
        
        
        Double bolsaTreAnos = filhosAteTresAnos * 25.12;
        Double bolsaDezesseisAnos = filhosAteDezesseiAnos * 15.88;
        Double bolsaDezoitoAnos = filhosAteDezoitoAnos * 12.44;        

        Double totalBolsa = bolsaTreAnos + bolsaDezesseisAnos + bolsaDezoitoAnos;
        
        String frase = String.format("Você tem um total %d de filhos e vai receber R$%.2f de bolsa", totalFilhos, totalBolsa);
        System.out.println(frase);
    }
}
