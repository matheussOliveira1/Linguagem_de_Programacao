/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m.c.de.oliveira
 */
public class Lista {

    private List<Integer> listaInteiros = new ArrayList();
    private List<Integer> listaPares = new ArrayList();
    private List<Integer> listaImpares = new ArrayList();

    public List<Integer> listaNumerosInteiros(Integer numeroDigitado) {
        listaInteiros.add(numeroDigitado);

        return listaInteiros;
    }
    
    public void corrigirLista(){
        listaInteiros.remove(listaInteiros.size() - 1);
    }

    public String somatoriaNumerosInteiros() {
        Integer resultadoSomatoria = 0;

        for (int i = 0; i < listaInteiros.size(); i++) {
            resultadoSomatoria += listaInteiros.get(i);
        }

        String exibirSomatoria = "Somatória total: " + resultadoSomatoria;

        return exibirSomatoria;
    }

    public String listaNumerosPares() {
        for (int i = 0; i < listaInteiros.size(); i++) {
            if (listaInteiros.get(i) % 2 == 0) {
                listaPares.add(listaInteiros.get(i));
            }
        }

        String exibirListaPares = "Números pares: " + listaPares;

        return exibirListaPares;
    }

    public String listaNumerosImpares() {
        for (int i = 0; i < listaInteiros.size(); i++) {
            if (listaInteiros.get(i) % 2 == 1) {
                listaImpares.add(listaInteiros.get(i));
            }
        }

        String exibirListaImapres = "Números ímpares: " + listaImpares;

        return exibirListaImapres;
    }

    public String menorNumero() {
        Integer menorNumeroLista = listaInteiros.get(0);

        for (int i = 0; i < listaInteiros.size(); i++) {
            if (listaInteiros.get(i) < menorNumeroLista && listaInteiros.get(i) != 0) {
                menorNumeroLista = listaInteiros.get(i);
            }
        }

        String exibirMenorNumero = "Menor número: " + menorNumeroLista;

        return exibirMenorNumero;
    }

    public String maiorNumero() {
        Integer maiorNumeroLista = listaInteiros.get(0);

        for (int i = 0; i < listaInteiros.size(); i++) {
            if (listaInteiros.get(i) > maiorNumeroLista) {
                maiorNumeroLista = listaInteiros.get(i);
            }
        }

        String exibirMaiorNumero = "Maior número: " + maiorNumeroLista;

        return exibirMaiorNumero;
    }
}
