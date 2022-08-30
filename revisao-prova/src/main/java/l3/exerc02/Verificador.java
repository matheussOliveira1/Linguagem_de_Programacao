/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l3.exerc02;

/**
 *
 * @author zagreu
 */
public class Verificador {
    
    
    Double classeSocial(Double renda){
        Double qtdSalarioMinimo = renda / 1.045;
        return qtdSalarioMinimo;
    }
        
        
    String verificadorClasse(Double renda){
        String classeSocialVerificada;
        
        if(renda <= 2){
            classeSocialVerificada = "E";
        }else if(renda > 2 && renda <= 4){
            classeSocialVerificada = "D";
        }else if(renda > 4 && renda <= 10){
            classeSocialVerificada = "C";
        }else if(renda > 10 && renda <= 20){
            classeSocialVerificada = "B";
        }else{
            classeSocialVerificada = "A";
        }
        return classeSocialVerificada;
    }
}
