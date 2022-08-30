/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classifica.idade;

/**
 *
 * @author Aluno
 */
public class Classificador {
    
    void classificaIdade(Integer idade){
        String idadeClassificada;
        
        if (idade < 3) {
            idadeClassificada = "Bebê";
        }else if (idade < 12) {
            idadeClassificada = "Criança";
        }else if (idade < 19) {
            idadeClassificada = "Adolescente";
        }else if (idade < 31) {
            idadeClassificada = "Jovem";
        }else if (idade < 61) {
            idadeClassificada = "Adulto";
        }else{
            idadeClassificada = "Idoso";
        }
        
        System.out.println(idadeClassificada);
    }
}
