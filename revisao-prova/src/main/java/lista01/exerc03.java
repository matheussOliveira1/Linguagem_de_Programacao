/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class exerc03 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Programa para calcular calorias perdidas:");
        System.out.println("-".repeat(30));
        
        System.out.println("Quantos minutos você aqueceu?");
        Integer minutosAquecendo = in.nextInt();
        
        System.out.println("Quantos minutos foram de exercícios aeróbicos?");
        Integer minutosAerobicos = in.nextInt();
        
        System.out.println("Quantos minutos foram de musculação?");
        Integer minutosMusculacao = in.nextInt();
        
        //Total minutos:
        Integer totalMinutos = minutosAquecendo + minutosAerobicos
                + minutosMusculacao;
        
        //Calorias perdidas:
        Integer caloriasPerdidasAquecendo = minutosAquecendo * 12;
        Integer caloriasPerdidasAerobicos = minutosAerobicos * 20;
        Integer caloriasPerdidasMusculacao = minutosMusculacao * 25;
        
        Integer totalCaloriasPerdidas = caloriasPerdidasAquecendo + 
                caloriasPerdidasAerobicos + caloriasPerdidasMusculacao;
        
        String frase = String.format("Olá, Jorge. Você fez um total de %d "
                + "minutos de exercícios e perdeu cerca de %d calorias", 
                totalMinutos, totalCaloriasPerdidas);
        
        System.out.println(frase);
        
    }
}
