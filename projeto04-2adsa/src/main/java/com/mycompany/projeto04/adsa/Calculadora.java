/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto04.adsa;

/**
 *
 * @author Aluno
 */
public class Calculadora {
    //Método com dois argumentos:
     
    //Sobrecarga // Sobreescrita:
    Integer somar(Integer num1, Integer num2){
        //System.out.println(num1 + num2);
        //Poderia fazer de outro jeito também:
        //Integer resultado = num1 + num2;
        //return resultado;
        return num1 + num2;
    }
    Integer somar(Integer num1, Integer num2, Integer num3){
        //System.out.println(num1 + num2);
        //Poderia fazer de outro jeito também:
        //Integer resultado = num1 + num2 + num3;
        //return resultado;
        return num1 + num2 + num3;
    }
    
    Double somar(Double num1, Double num2){
        //System.out.println(num1 + num2);
        //Poderia fazer de outro jeito também:
        //Integer resultado = num1 + num2;
        //return resultado;
        return num1 + num2;
    }
    
    Boolean isPar(Integer numero){
        
        return numero % 2 == 0;
        
        /*
        if (numero % 2 == 0) {
            return true;
        }
        
        return false;
        */
    }
    
    //Forma eficaz de fazer ambas as instruções de somar e verificar, mas
    //a melhor forma de se fazer é realmente ter um metodo pra cada atividade
    //metodo da soma e da verificação e no fim, caso necessário, poderiamos
    //criar um metodo orquestrador e juntar ambos os métodos.
    Boolean calculaEVerifica(Integer num1, Integer num2){
        Integer resultado = somar(num1, num2);
        return isPar(resultado);
    }
}
