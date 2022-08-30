/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech2.projeto03.adsa;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Randomico {
    
    public static void main(String[] args) {
        /*
        Existem alguns meios para gerar números aleatórios em Java;
        
        Alguns deles:
        - Math.random();
        - Math.random() * N;
        - Random x = new Random();
            * x.nextInt(10);
            * x.nextDouble() * N / padrão: (0.0/1.0);
            * x.nextBoolean();
        
        */
        
        Random x = new Random();
        Integer numeroInteiro = ThreadLocalRandom.current().nextInt(0, 11);
        System.out.println(numeroInteiro);
        
        /*
        System.out.println(ThreadLocalRandom.current().nextInt(0, 11););
        */
        
        
    }
}
