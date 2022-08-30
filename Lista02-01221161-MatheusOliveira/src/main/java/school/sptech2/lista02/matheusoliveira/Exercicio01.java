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
public class Exercicio01 {
    
    public static void main(String[] args) {
        //Tabuada
        Scanner leitorNumerico = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        Integer numeroDigitado = leitorNumerico.nextInt();
        
        System.out.println("Tabuada do " + numeroDigitado + ":");  
        
        for (int i = 0; i <= 10; i++) {
            Integer resultado = numeroDigitado * i;
            
            String frase = String.format("%d X %d = %d", numeroDigitado, i, resultado);
            
            System.out.println(frase);
        }
        
        System.out.println("Fim da execução!");
    }
}
