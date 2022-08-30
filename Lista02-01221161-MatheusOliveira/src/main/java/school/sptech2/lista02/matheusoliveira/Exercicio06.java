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
public class Exercicio06 {
    
    public static void main(String[] args) {
        //Loteria
        
        Scanner leitorNumerico = new Scanner(System.in);
        
        System.out.println("Digite um numero entre 0 e 10:");
        Integer numeroDigitado = leitorNumerico.nextInt();
        
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        System.out.println("Numero sorteado: " + numeroSorteado);
        
        Integer qtdSorteio = 1;
        
        while (numeroSorteado != numeroDigitado) {            
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println("Numero sorteado: " + numeroSorteado);
            qtdSorteio++;
        }
        
        if(qtdSorteio <= 3){
            System.out.println("Você é muito sortudo!");
            System.out.println("Quantidade de vezes sorteadas: " + qtdSorteio);
        }else if(qtdSorteio <= 10){
            System.out.println("Você é sortudo");
            System.out.println("Quantidade de vezes sorteadas: " + qtdSorteio);
        }else{
            System.out.println("É melhor você parar de apostar e ir trabalhar!");
            System.out.println("Quantidade de vezes sorteadas: " + qtdSorteio);
        }
    }
}
