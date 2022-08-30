/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech2.lista02.matheusoliveira;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class Exercicio10 {
    
    public static void main(String[] args) {
        //Potencia
        
        Scanner leitorNumerico = new Scanner(System.in);
        Integer i = 1;
        
        System.out.println("Digite o valor que representará a base:");
        Integer baseDigitada = leitorNumerico.nextInt();
        
        System.out.println("Digite o valor que representará o expoente:");
        Integer expoenteDigitado = leitorNumerico.nextInt();
        
        Integer potencia = 1;
        while (i <= expoenteDigitado) {            
            potencia = potencia * baseDigitada;
            i++;
        }
        
        System.out.println("Resultado: " + potencia);
    }
}
