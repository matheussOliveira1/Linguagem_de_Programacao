/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcula.peso.ideal;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class PesoIdeal {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        CalculadoraPesoIdeal calcPeso = new CalculadoraPesoIdeal();
        
        System.out.println("Diga-me seu sexo\nM para homens \nF para mulheres:");
        String sexoDigitado = leitorTexto.nextLine();
        if (!sexoDigitado.equals("M") && !sexoDigitado.equals("F")) {
            System.out.println("ERRADO! Apenas M para homens ou F para mulheres");
            System.out.println("Tente novamente:");
            System.out.println("Diga-me seu sexo\nM para homens \nF para mulheres:");
            sexoDigitado = leitorTexto.nextLine();
        }
        
        System.out.println("Digite sua altura:");
        Double alturaDigitada = in.nextDouble();
        
        Double pesoIdeal = calcPeso.calculaPesoIdeal(alturaDigitada, sexoDigitado);
        System.out.printf("\nSeu peso ideal é de: %.2f", pesoIdeal);
    }
}
