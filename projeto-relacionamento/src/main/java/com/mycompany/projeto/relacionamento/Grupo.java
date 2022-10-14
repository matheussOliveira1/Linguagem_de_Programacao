package com.mycompany.projeto.relacionamento;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void adiciona(Contato novoContato) {
        this.contatos.add(novoContato);
    }
    
    public void adiciona(List<Contato> novosContatos) {
        this.contatos.addAll(novosContatos);
    }

    public void remove(Contato contatoParaRemover) {
        this.contatos.remove(contatoParaRemover);
    }

    public void remove(String nome) {

        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);

            if (contatoDaVez.getNome().equals(nome)) {
                contatos.remove(i);
            }
        }
    }

}
