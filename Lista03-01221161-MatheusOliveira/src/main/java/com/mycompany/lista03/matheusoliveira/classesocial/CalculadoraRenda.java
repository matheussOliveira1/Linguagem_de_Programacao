/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03.matheusoliveira.classesocial;

/**
 *
 * @author Aluno
 */
public class CalculadoraRenda {
    
    Double calcRenda(Double renda){
        Double salaraioMinimo = 1.045;
        Double resultado = renda / salaraioMinimo;
        return resultado;
    }

    String nivelSocial(Double renda){
        String nivelSocial;
        
        if(renda < 3){
            nivelSocial = "E";
        }else if(renda > 1 && renda < 5){
            nivelSocial = "D";
        }else if(renda > 3 && renda < 11){
            nivelSocial = "C";
        }else if(renda > 9 && renda < 21){
            nivelSocial = "B";
        }else{
            nivelSocial = "A";
        }
        
        return nivelSocial;
    }
}
