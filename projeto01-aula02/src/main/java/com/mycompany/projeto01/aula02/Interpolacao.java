/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto01.aula02;

/**
 *
 * @author Aluno
 */
public class Interpolacao {
    
    public static void main(String[] args) {
    
        String nome = "Diego";
        String sobrenome = "Brito";
        Integer idade = 29;
        Double altura = 1.83;
        
        //System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
        
        String frase = String.format("Nome:%s \nSobrenome:%s \nIdade:%d \nAltura:%.2f", nome, sobrenome, idade, altura);
        /*
            %s é utilizado para especificar variaves do tipo STRING
            %d é utilizado para especificar variaveis do tipo DOUBLE ou INTEGER
            %.2f é utilizado para especificar variaves que contenham casas decimais e o 2 nesse caso seria a quantidade que eu quero de casas decimais
            É IMPORTANTE SEGUIR UMA ORDEM, SEM SEGUIR A ORDEM VEZES PODE DAR CERTO E VEZES DARÃO ERRADO!!!
            A ORDEM QUE EU SEGUI FOI: NOME = %s / IDADE = %d / ALTURA = %.2f
        */
        
        System.out.println(frase);
        /*
            TAMBÉM É POSSIVEL EXIBIR DA SEGUINTE FORMA:
            System.out.println("Nome:%s \nSobrenome:%s \nIdade:%d \nAltura:%.2f", nome, sobrenome, idade, altura);
            MAS NÃO É ALGO INDICADO!!
        */
    }
}
