package com.mycompany.atividade.relacionamentos;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public Integer getQuantidade() {
        return this.produtos.size();
    }

    public void adicionar(Produto novoProduto) {
        this.produtos.add(novoProduto);
    }

    public Boolean existsPorNome(String nome) {
        Boolean isExiste = false;

        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                isExiste = true;
            }
        }
        return isExiste;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer quantidadePerCategoria = 0;

        for (Produto produto : produtos) {
            if (produto.getCategoria().equals(nome)) {
                quantidadePerCategoria++;
            }
        }
        return quantidadePerCategoria;
    }

    public void limpar() {

        for (int i = 0; i < produtos.size(); i++) {
            produtos.removeAll(produtos);
        }
    }

    public void removerPorNome(String nome) {

        for (Produto produto : produtos) {

            if (produto.getNome().equals(nome)) {
                produtos.remove(produto);
            }

        }
    }

    public Produto getPorNome(String nome) {

        for (Produto produto : produtos) {

            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public Double getValorTotal() {
        Double valorTotalCarrinho = 0.0;

        for (Produto produto : produtos) {
            valorTotalCarrinho += produto.getPreco();
        }
        return valorTotalCarrinho;
    }

    @Override
    public String toString() {
        return "Carrinho{" + "cliente=" + cliente + ", produtos=" + produtos + '}';
    }
}
