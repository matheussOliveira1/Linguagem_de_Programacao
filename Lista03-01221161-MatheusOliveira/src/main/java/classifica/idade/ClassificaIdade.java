/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classifica.idade;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ClassificaIdade {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Classificador idadeParaClassificar = new Classificador();
        
        System.out.println("Digite sua idade:");
        Integer idadeDigitada = in.nextInt();
        
        idadeParaClassificar.classificaIdade(idadeDigitada);
    }
}
