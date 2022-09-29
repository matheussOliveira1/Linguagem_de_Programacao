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

        List<Integer> listaInteiros = new ArrayList();
        List<Integer> listaPares = new ArrayList();
        List<Integer> listaImpares = new ArrayList();

        System.out.println("Insira um numero inteiro:");
        numeroDigitado = leitorNumerico.nextInt();
        listaInteiros.add(numeroDigitado);

        Integer menorNumero = numeroDigitado;
        Integer maiorNumero = numeroDigitado;

        while (numeroDigitado != 0) {
            System.out.println("Insira um numero inteiro:");
            numeroDigitado = leitorNumerico.nextInt();
            listaInteiros.add(numeroDigitado);

            if (numeroDigitado < menorNumero) {
                menorNumero = numeroDigitado;
            }

            if (numeroDigitado > maiorNumero) {
                maiorNumero = numeroDigitado;
            }

            if (numeroDigitado % 2 == 0) {
                listaPares.add(numeroDigitado);
            } else {
                listaImpares.add(numeroDigitado);
            }
        }

        for (int i = 0; i < listaInteiros.size(); i++) {
            somatoriaTodosOsNumeros += listaInteiros.get(i);
        }

        for (int i = 0; i < listaPares.size(); i++) {
            System.out.println("Números pares:" + listaPares.get(i));
        }

        for (int i = 0; i < listaImpares.size(); i++) {
            System.out.println("Números ímpares:" + listaImpares.get(i));
        }

        String fraseFinal = String.format("Soma de todos os números: %d\n"
                + "Menor número: %d\n"
                + "Maior número: %d",
                somatoriaTodosOsNumeros, menorNumero, maiorNumero);

        System.out.println(fraseFinal);

    }
}
