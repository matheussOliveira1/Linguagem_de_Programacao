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
public class exerc01 {
    
    public static void main(String[] args) {
        //CadastroUsuario
        
        Scanner in = new Scanner(System.in);
        Scanner numerico = new Scanner(System.in);
        
        System.out.println("Digite seu login:");
        String loginDigitado = in.nextLine();
        
        System.out.println("Digite sua senha:");
        String senhaDigitada = in.nextLine();
        
        System.out.println("Digite a quantidades de tentativa que você possuí");
        Integer qtdDigitada = numerico.nextInt();
        
        String frase = String.format("Seu login é %s e sua senha é %s. Você tem "
                + "%d tentativas antes de ser bloqueado!",
                loginDigitado, senhaDigitada, qtdDigitada);
        
        System.out.println(frase);
    }
}
