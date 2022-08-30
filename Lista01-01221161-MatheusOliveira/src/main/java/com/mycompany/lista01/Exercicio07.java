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
public class Exercicio07 {
    
    public static void main(String[] args) {
        
        Scanner scannerNumero = new Scanner(System.in);
        
        System.out.println("Digite o limite de peso do elevador:");
        Double pesoMaximo = scannerNumero.nextDouble();
        
        System.out.println("Digite o limite de pessoas no elevador:");
        Integer quantidadeMaxima = scannerNumero.nextInt();
        
        System.out.println("Digite o peso da primeira pessoa:");
        Double primeiroPeso = scannerNumero.nextDouble();
        
        System.out.println("Digite o peso da segunda pessoa:");
        Double segundoPeso = scannerNumero.nextDouble();
        
        System.out.println("Digite o peso da terceira pessoa:");
        Double terceiroPeso = scannerNumero.nextDouble();
        
        Double calculoPeso = primeiroPeso + segundoPeso + terceiroPeso;
        
        String frase = String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas. "
                + "\nO peso total no elevador é de %.2f, sendo que ele suporta %.2f.", quantidadeMaxima, calculoPeso, pesoMaximo);
        
        System.out.println(frase);
    }
}
