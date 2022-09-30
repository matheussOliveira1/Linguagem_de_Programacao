package com.bandtec.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList<>();
    }

    public void add(Integer valor) {
        if (valor != null) {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        inteiros.remove(valor);
    }

    public Integer count() {
        Integer contador = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            contador++;
        }
        return contador;
    }

    public Integer countPares() {
        Integer contadorNumerosPares = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 == 0) {
                contadorNumerosPares++;
            }
        }
        return contadorNumerosPares;
    }

    public Integer countImpares() {
        Integer contadorNumerosImpares = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 == 1) {
                contadorNumerosImpares++;
            }
        }
        return contadorNumerosImpares;
    }

    public Integer somar() {
        Integer resultadoSoma = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            resultadoSoma += inteiros.get(i);
        }
        return resultadoSoma;
    }

    public Integer getMaior() {
        Integer maiorNumero = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) > maiorNumero) {
                maiorNumero = inteiros.get(i);
            } else if (inteiros.isEmpty()) {
                maiorNumero = 0;
            }
        }
        return maiorNumero;
    }

    public Integer getMenor() {
        Integer menorNumero = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) < menorNumero) {
                menorNumero = inteiros.get(i);
            } else if (inteiros.isEmpty()) {
                menorNumero = 0;
            }
        }
        return menorNumero;
    }

    public Boolean hasDuplicidade() {
        Boolean hasCopia = false;
        for (int i = 0; i < inteiros.size(); i++) {
            Integer numeroTeste = inteiros.get(i);
            for (int j = i + 1; j < inteiros.size(); j++) {
                if (numeroTeste == inteiros.get(j)) {
                    hasCopia = true;
                }
            }
        }
        return hasCopia;
    }
}
