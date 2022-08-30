/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto01.aula02;

/**
 *
 * @author Aluno
 */
public class Tipo {
    
    public static void main(String[] args) {
        
        /*
            String -> para texto;
            Integer -> para números inteiros;
            Double -> para números com casas decimais;
            Boolean -> para verdadeiro ou false;
        */
        
        String texto = "Lorem ipsum";
        Integer numeroInteiro = 42;
        Double numeroComPontoFlutuante = 42.0;
        Boolean isProfessor = true;
        
        System.out.println("Nome: " + texto + " Idade: " + numeroInteiro);
        //System.out.print("Nome: " + texto);
        //System.out.print("Idade: " + numeroInteiro);
    }
}
