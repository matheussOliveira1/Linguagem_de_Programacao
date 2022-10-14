package com.mycompany.projeto.relacionamento;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Grupo g1 = new Grupo("2ADSA");

        Contato marcelo = new Contato("Marcelo", "99999-0000");
        Contato neymar = new Contato("Neymar", "88888-0000");
        Contato lateral = new Contato("LATERAL", "LATERAL-LATERAL");

        g1.adiciona(marcelo);
        g1.adiciona(neymar);
        g1.adiciona(lateral);

        List<Contato> contatos = g1.getContatos();

        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
        }

        g1.remove(lateral);

        System.out.println("-".repeat(50));
        
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
        }
    }
}
