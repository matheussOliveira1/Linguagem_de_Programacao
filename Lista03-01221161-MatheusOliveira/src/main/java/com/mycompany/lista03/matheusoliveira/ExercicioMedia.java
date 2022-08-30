/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03.matheusoliveira;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExercicioMedia {
    
    public static void main(String[] args) {
        
        Scanner notaDigitada = new Scanner(System.in);
        Calculadora calculadoraMedia = new Calculadora();
        
        System.out.println("Digite uma nota:");
        Double nota1 = notaDigitada.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        Double nota2 = notaDigitada.nextDouble();
        
        Double resultadoMedia = calculadoraMedia.calcularMedia(nota1, nota2);
        System.out.printf("A média dessas notas são: %.2f", resultadoMedia);
    }
}
