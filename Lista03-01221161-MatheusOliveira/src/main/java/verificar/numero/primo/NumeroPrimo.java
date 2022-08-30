/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verificar.numero.primo;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class NumeroPrimo {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Verificador numeroVerificado = new Verificador();
        
        System.out.println("Digite um número:");
        Integer numeroDigitado = in.nextInt();
        
        Integer isPrimo = numeroVerificado.verificadorNumeroPrimo(numeroDigitado);
       
        while (numeroDigitado > 0) {
            if (isPrimo == 2) {
            System.out.println("Este número é primo :) \nDigite outro número");
            numeroDigitado = in.nextInt();
            isPrimo = numeroVerificado.verificadorNumeroPrimo(numeroDigitado);       
            }else{
                System.out.println("Este não é um número primo :( \nDigite outro número");
                numeroDigitado = in.nextInt();
                isPrimo = numeroVerificado.verificadorNumeroPrimo(numeroDigitado);   
            }
        }
        
        System.out.println("Programa encerrado :p");
    }
}
