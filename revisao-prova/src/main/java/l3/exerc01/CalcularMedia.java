/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l3.exerc01;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class CalcularMedia {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Calculadora calc = new Calculadora();
    
        System.out.println("Digite a primeira nota:");
        Double nota1 = in.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        Double nota2 = in.nextDouble();
        
        Double resultadoMedias = calc.mediaNotas(nota1, nota2);
        
        System.out.println("Resultado da sua média: " + resultadoMedias);
    
    }
}
