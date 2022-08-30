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
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner login = new Scanner(System.in);
        Scanner senha = new Scanner(System.in);
        Scanner tentativasPossiveis = new Scanner(System.in);
        
        System.out.println("Digite seu login:");
        String loginDigitado = login.nextLine();
        
        System.out.println("Digite sua senha:");
        String senhaDigitada = senha.nextLine();
        
        System.out.println("Digite quantas tentativas você tem:");
        Integer numeroDeTentativas = tentativasPossiveis.nextInt();
        
        String frase = String.format("Seu login é: %s \nSua senha é: %s \nVocê tem esta quantidades de tentativas: %d ", loginDigitado, senhaDigitada, numeroDeTentativas);
        System.out.println(frase);
    }
}
