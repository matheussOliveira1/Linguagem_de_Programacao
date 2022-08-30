/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech2.lista02.matheusoliveira;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class Exercicio05 {
 
    public static void main(String[] args) {
        //Autenticação
        
        Scanner leitorLogin = new Scanner(System.in);
        Scanner leitorSenha = new Scanner(System.in);
        
        System.out.println("Digite seu login:");
        String loginDigitado = leitorLogin.nextLine();
        
        System.out.println("Digite sua senha:");
        String senhaDigitada = leitorSenha.nextLine();
        
        while (!loginDigitado.equals("admin") && !senhaDigitada.equals("#SPtech2022")) {
            System.out.println("Login e/ou senha inválidos! Tente novamente");
            
            System.out.println("Digite seu login:");
            loginDigitado = leitorLogin.nextLine();
            
            System.out.println("Digite sua senha:");
            senhaDigitada = leitorSenha.nextLine(); 
        }
        
        System.out.println("Login realizado com suscesso!");
    }
}
