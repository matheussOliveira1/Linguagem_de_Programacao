/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto04.adsa;

/**
 *
 * @author Aluno
 */
public class Utilitaria {
    
    /*
        O método é composto por (Assinatura):
        - retorno
            nesse caso abaixo, não retorna;
        - nome
            nome que é referido o método, no caso abaixo "exibirLinha"
        - argumentos
            parametros que são informados para o método
    
        Quando chamamos um método, existe o costume de chamar isso de "Invocar".
    */
    
    void exibirLinha(){
        System.out.println(".".repeat(30));
    }
    
    //Posso colocar a quantidade de argumentos que eu quiser, mas para fazer a
    //utilização do método eu terei que passar uma resposta que tenha todos os
    //argumentos que eu adicionei, inclusive na mesma ordem que eu adicionar.
    void exibirNomeDecorado(String nomeDigitado){
        System.out.printf("*** %s ***\n", nomeDigitado);
    }
    
    //Metodo orquestrador, ele em si não faz nada, mas ele puxa outros metodos
    //com um intuito.
    void exibitNomeDecoradoComLinha(String texto){
        exibirLinha();
        exibirNomeDecorado(texto);
        exibirLinha();
    }
}
