/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class ListaInteiros {

    public static void main(String[] args) {

        Scanner leitorNumerico = new Scanner(System.in);
        Integer somatoriaTodosOsNumeros = 0;
        Integer numeroDigitado;
        Lista listaNumeros = new Lista();

        do {
            System.out.println("Insira um numero inteiro:");
            numeroDigitado = leitorNumerico.nextInt();
            listaNumeros.listaNumerosInteiros(numeroDigitado);
        } while (numeroDigitado != 0);
        
        listaNumeros.corrigirLista();
        
        System.out.println(listaNumeros.listaNumerosPares());
        System.out.println(listaNumeros.listaNumerosImpares());
        System.out.println(listaNumeros.somatoriaNumerosInteiros());
        System.out.println(listaNumeros.menorNumero());
        System.out.println(listaNumeros.maiorNumero());
    }
}
