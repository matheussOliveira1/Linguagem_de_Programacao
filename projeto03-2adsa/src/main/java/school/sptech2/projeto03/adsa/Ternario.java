/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech2.projeto03.adsa;

/**
 *
 * @author Aluno
 */
public class Ternario {
    
    public static void main(String[] args) {
        
        String frase;
        
        Boolean isMatriculado = true;
        
        /*
        if(isMatriculado){
         frase = "Está matriculado...";
        }else{
            frase = "Não está matriculado..";
        }
        */
        
        /*
            Operador ternário:
            
            É uma espécie de if/else em uma linha;
        */
        
        frase = isMatriculado ? "Está matriculado.." : "Não está matriculado..";
         
        System.out.println(frase);
        
        Integer numero = 42;
        
        String fraseNumero;
        
        /*
        if (numero > 10) {
            fraseNumero = "É maior...";
        }else{
            fraseNumero = "É menor...";
        }
        */
        
        fraseNumero = numero > 10 ? "É maior..." : "É menor...";
        
        Boolean teste = numero > 10;
        
        System.out.println(fraseNumero);
    }
}
