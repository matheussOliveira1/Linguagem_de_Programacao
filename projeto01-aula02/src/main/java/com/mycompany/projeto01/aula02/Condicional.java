/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto01.aula02;

/**
 *
 * @author Aluno
 */
public class Condicional {
    public static void main(String[] args) {
      
        /*
            .equals() = UTILIZADO PARA COMPARAR TEXTOS IGUAIS(NÃO UTILIZAR "==" PARA TEXTO!!!!!!!!)
            == (PARA COMPARAR NUMEROS NÃO HÁ PROBLEMA UTILIZAR O "==")
            !=
            &&
            ||
            <
            >
            <=
            >=
            %
            Math.pow(x, y); = POTENCIAÇÃO
        */
        
        /*
        Integer numero1 = 5;
        Integer numero2 = 5;
        
        if (numero1 > numero2) {
            System.out.println("Número " + numero1 + " é maior que " + numero2);
        }else if(numero1 < numero2){
            System.out.println("Número " + numero1 + " é menor que " + numero2);
        }else{
            System.out.println("Número " + numero1 + " e " + numero2 + " são iguais");
            
        }
        
        Boolean isProfessor = true;
        
        //VARIAVEIS BOLEANAS NÃO PRECISAM SER COMPARADAS, A PROPRIA VARIAVEL TEM O VALOR DE "TRUE" OU "FALSE"
        if (isProfessor) {
            System.out.println("É professor");
        }else{
            System.out.println("Não é professor");
        }
        */

        String nome1 = "Diego";
        String nome2 = "Diego";
        
        //  Case Sensitive
        if(nome1.equals(nome2)){
            System.out.println("Nomes iguais");
        }else{
            System.out.println("Nomes diferentes");
        }
        //  PARA NÃO COMPARAR MAIUSCULA OU MINUSCULA COLOCAR : .equalsIgnoreCase()
    }
}
