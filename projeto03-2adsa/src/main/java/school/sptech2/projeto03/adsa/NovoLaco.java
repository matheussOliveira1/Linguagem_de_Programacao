/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech2.projeto03.adsa;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class NovoLaco {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer numero = 42;

        System.out.println("Acerte o número:");
        Integer numeroDigitado = leitor.nextInt();

        /* 
        VERSÃO QUE FUNCIONA MAS É GAMBIARRA E NÃO É NENHUM POUCO INDICADO!!!
        
        if (numeroDigitado != numero) {
            while (true) {
                System.out.println("Numero errado!");
                numeroDigitado = leitor.nextInt();
                if (numeroDigitado == numero) {
                    System.out.println("Numero correto");
                    break;
                }
            }
        } else {
            System.out.println("Numero correto!");
        }
        */
        
        /*
        VERSÃO DO PROFESSOR:
        
            while(numeroDigitado != numero){
                System.out.println("Tente novamente!");
                numeroDigitado = leitor.nextInt()
            }
            
            System.out.println("Acertou!");
        */
        
        /*
        do {            
            System.out.println("Acerto o número");
            numeroDigitado = leitor.nextInt();
        } while (numeroDigitado != numero);
        */
    }
}
