/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto01.aula02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Leitura {
    
    public static void main(String[] args) {
    
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nomeDigitado = leitorTexto.nextLine();
        //String nomeDigitado = leitorTexto.next();
       
        System.out.println("Olá " + nomeDigitado);
        
        
        System.out.println("Digite sua idade:");
        Integer idadeDigitade = leitorNumerico.nextInt();
        
        System.out.println("Idade digitada: " + idadeDigitade);
        
        System.out.println("Digite sua altura:");
        Double alturaDigitada = leitorNumerico.nextDouble();
        
        System.out.println("Altura digitada: " + alturaDigitada);
    }
}
