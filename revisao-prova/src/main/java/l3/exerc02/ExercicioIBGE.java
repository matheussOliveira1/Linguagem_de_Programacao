/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l3.exerc02;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class ExercicioIBGE {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Verificador verif = new Verificador();
        
        System.out.println("Digite sua renda:");
        Double renda = in.nextDouble();
        
        Double classeSocial = verif.classeSocial(renda);
        String classeVerificada = verif.verificadorClasse(renda);
        
        String fraseFinal = String.format("Sua classe social é: %s"
                + "\nVocê tem um total de %.f salários mínimos", 
                classeVerificada, classeSocial);
        
        System.out.println(fraseFinal);
    }
}
