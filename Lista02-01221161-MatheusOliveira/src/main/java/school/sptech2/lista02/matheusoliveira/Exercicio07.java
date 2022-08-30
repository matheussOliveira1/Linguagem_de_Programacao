/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech2.lista02.matheusoliveira;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author zagreu
 */
public class Exercicio07 {
    
    public static void main(String[] args) {
        //Sorteio
        //NÃO FINALIZADO
        
        Scanner leitorNumerico = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 100");
        Integer numeroDigitado = leitorNumerico.nextInt();
        
        Integer numerosPares = 0;
        Integer numerosImpares = 0;

        Integer qtdSorteio = 0;
        Integer primeiraPosicao = 0;
        
        for (int i = 0; i < 200; i++) {
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 101);
            if(numeroDigitado == numeroSorteado){
                primeiraPosicao = qtdSorteio;
                
            }
            if(numeroSorteado % 2 == 0){
               numerosPares++;
            }
            numerosImpares = 200 - numerosPares;
            qtdSorteio++;
        }
        
        String frase = String.format("O numero foi sorteado na posição: %d"
                + "\nQuantidade de numeros pares sorteados: %d"
                + "\nQuantidade de numeros impares sorteados: %d"
                , primeiraPosicao, numerosPares, numerosImpares);
        System.out.println(frase);
    }
}
