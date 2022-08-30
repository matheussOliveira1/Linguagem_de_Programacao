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
public class SwitchCase {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro!");
        Integer numeroDigitado = in.nextInt();
        
        String frase;
        
        switch (numeroDigitado) {
            case 1:
                frase = "Domingou";
                break;
            case 2:
                frase = "Segundou!";
                break;
            case 3:
                frase = "Terçou!";
                break;
            case 4:
                frase = "Quartou!";
                break;
            case 5:
                frase = "Quintou!";
                break;
            case 6:
                frase = "Sextou!";
                break;
            case 7:
                frase = "Sabadou!";
                break;
            default:
                frase = "Número inválido!";
                break;
        }
        
        System.out.println(frase);
        
        
    }
    
}
