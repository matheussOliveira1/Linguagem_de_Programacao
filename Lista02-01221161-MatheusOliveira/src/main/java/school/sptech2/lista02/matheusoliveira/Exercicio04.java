/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech2.lista02.matheusoliveira;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio04 {
    
    public static void main(String[] args) {
        //Acumulador
        
        Scanner leitorNumerico = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        Integer numeroDigitado = leitorNumerico.nextInt();
        Integer soma = 0;
        
        while (numeroDigitado != 0) {            
            soma += numeroDigitado;
            System.out.println("Digite um numero:");
            numeroDigitado = leitorNumerico.nextInt();
        }
        
        System.out.println("Resultado da soma:");
        System.out.println(soma);
        
        
    }
}
