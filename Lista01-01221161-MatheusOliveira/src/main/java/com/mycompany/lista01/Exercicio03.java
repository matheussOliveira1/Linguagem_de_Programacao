/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner valoresExigidos = new Scanner(System.in);
        Scanner nomeDigitado = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = nomeDigitado.nextLine();
        
        System.out.println("Digite a quantiade de minutos que você passou aquecendo (Número Inteiro!)");
        Integer minutosAquecendo = valoresExigidos.nextInt();
        
        System.out.println("Digite a quantidade de minutos que você passou fazendo exercícios aeróbicos (Número Inteiro!)");
        Integer minutosExercitandoAerobicos = valoresExigidos.nextInt();
        
        System.out.println("Digite a quantidade de minutos que você passou fazendo exercícios de musculação (Número Inteiro!)");
        Integer minutosExercitandoMusculacao = valoresExigidos.nextInt();
        
        Integer totalMinutosExercicitando = minutosAquecendo + minutosExercitandoAerobicos + minutosExercitandoMusculacao;
        
        Double percaCaloriaAquecimento = 12.00 * minutosAquecendo; 
        Double percaCaloriaAerobico = 20.00 * minutosExercitandoAerobicos;
        Double percaCaloriaMusculacao = 25.00 * minutosExercitandoMusculacao;
        
        Double caloriasTotaisPerdidas = percaCaloriaAquecimento + percaCaloriaAerobico + percaCaloriaMusculacao;
        
        String frase = String.format("Olá, %s. Você fez um total de %d minutos de exercícios e perdeu um total de %.2f de calorias!", nome, totalMinutosExercicitando,caloriasTotaisPerdidas);
        System.out.println(frase);
        
    }
}
