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
public class exerc02 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de filhos de 0 a 3 anos que"
                + "você tem:");
        Integer qtdFilhosAteTresAnos = in.nextInt();
        
        System.out.println("Digite a quantidade de filhos de 4 a 16 anos que"
                + "você tem:");
        Integer qtdFilhosAteDezesseisAnos = in.nextInt();
        
        System.out.println("Digite a quantidade de filhos de 17 a 18 anos que"
                + "você tem:");
        Integer qtdFilhosAteDezoitoAnos = in.nextInt();
        
        Integer totalFilhos = qtdFilhosAteTresAnos + qtdFilhosAteDezesseisAnos
                + qtdFilhosAteDezoitoAnos;
        
        Double bolsaFilhosTresAnos = qtdFilhosAteTresAnos * 25.12;
        Double bolsaFilhosDezesseisAnos = qtdFilhosAteDezesseisAnos * 15.88;
        Double bolsaFilhosDezoitoAnos = qtdFilhosAteDezoitoAnos * 12.44;
        
        Double totalBolsa = bolsaFilhosTresAnos + bolsaFilhosDezesseisAnos 
                + bolsaFilhosDezoitoAnos;
        
        String frase = String.format("Você tem um total de %d filhos e vai "
                + "receber R$%.2f de bolsa", totalFilhos, totalBolsa);
        
        System.out.println(frase);
    }
}
