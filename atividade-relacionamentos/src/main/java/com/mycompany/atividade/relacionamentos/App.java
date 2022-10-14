
package com.mycompany.atividade.relacionamentos;

public class App {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Vassoura", "Limpeza", 10.00);
        Produto p2 = new Produto("Pão de forma", "Alimento", 8.50);
        Produto p3 = new Produto("Durex", "Ferramentas", 4.50);
        Produto p4 = new Produto("Coca-cola", "Bebidas", 5.50);
        
        Carrinho carrinho = new Carrinho("Felipe");
        
        carrinho.adicionar(p1);
        carrinho.adicionar(p2);
        carrinho.adicionar(p3);
        carrinho.adicionar(p4);
        
        System.out.println("Quantidade: "+ carrinho.getQuantidade());
        
        System.out.println("Existe Coca-cola?");carrinho.existsPorNome("Coca-cola");
        carrinho.existsPorNome("Feijão");
        
        carrinho.getQuantidadePorCategoria("Limpeza");
        carrinho.getQuantidadePorCategoria("Ferramentas");
        carrinho.getQuantidadePorCategoria("Informática");
        
        carrinho.limpar();
        
        System.out.println(carrinho);
        
        carrinho.adicionar(p2);
        carrinho.adicionar(p3);
        carrinho.adicionar(p4);
        
        System.out.println("-".repeat(50));
        System.out.println(carrinho);
        
        carrinho.removerPorNome("Durex");
        
        System.out.println("-".repeat(50));
        System.out.println(carrinho);
        
        carrinho.getPorNome("Pão de forma");
        carrinho.getPorNome("Durex");
        
        carrinho.getValorTotal();
    }
    
}
