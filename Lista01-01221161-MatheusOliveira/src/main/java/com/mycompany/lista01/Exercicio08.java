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
public class Exercicio08 {
    
    //CalculoMédia
    public static void main(String[] args) {
        
        Scanner scannerNumerico = new Scanner(System.in);
        Scanner scannerTexto = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nomeDigitado = scannerTexto.nextLine();
        
        System.out.println("Digite a sua primeira nota:");
        Double primeiraNota = scannerNumerico.nextDouble();
        
        System.out.println("Digite a sua segunda nota:");
        Double segundaNota = scannerNumerico.nextDouble();
        
        Double mediaNota = (primeiraNota + segundaNota) / 2;
        
        String frase = String.format("Olá, %s. Sua média foi de %.1f", nomeDigitado,mediaNota);
        System.out.println(frase);
    }
}
