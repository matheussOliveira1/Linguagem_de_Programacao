/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto04.adsa;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class App {
    
    public static void main(String[] args) {
        
        //Objeto em Java (instancia)
        Scanner in = new Scanner(System.in);

        //Funções = Métodos
        
        //Objeto em Java (instancia)
        Utilitaria util = new Utilitaria();
        
        /*
        util.exibirLinha();
        System.out.println("Matheus");
        util.exibirLinha();
        System.out.println("Matheus");
        util.exibirLinha();
        */
        
        //System.out.println("*** Matheus ***");
        
        System.out.println("Digite seu nome:");
        String nomeUsuario = in.nextLine();
        
        util.exibitNomeDecoradoComLinha(nomeUsuario);
        
        //System.out.println("\nDigite outro nome:");
        //String nomeUsuario2 = in.nextLine();
        
        //util.exibirNomeDecorado(nomeUsuario2);
        
        Calculadora calc = new Calculadora();
        
        System.out.println("Digite um número:");
        Integer numeroDigitado1 = in.nextInt();
        
        System.out.println("Digite outro número:");
        Integer numeroDigitado2 = in.nextInt();
        
        Integer resultadoCalc = calc.somar(numeroDigitado1, numeroDigitado2);
        System.out.println("Resultado: " + resultadoCalc);
        
        Boolean par = calc.isPar(resultadoCalc);
        Boolean par2 = calc.calculaEVerifica(numeroDigitado1, numeroDigitado2);
        
        if(par){
            System.out.println("É par!");
        }else{
            System.out.println("É impar!");
        }
    }
}
        
