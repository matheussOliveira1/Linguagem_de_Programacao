/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03.matheusoliveira.classesocial;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ClassesSociais {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        CalculadoraRenda classeRenda = new CalculadoraRenda();
        
        System.out.println("Digite sua renda:");
        Double rendaDigitada = in.nextDouble();
        
        Double rendaCalculada = classeRenda.calcRenda(rendaDigitada);
        String nivelSocial = classeRenda.nivelSocial(rendaDigitada);
        
        System.out.printf("\nSua renda lhe dá %.0f salários mínimos\n", rendaCalculada);
        System.out.printf("Sua classe é: %s", nivelSocial);
    }
}
