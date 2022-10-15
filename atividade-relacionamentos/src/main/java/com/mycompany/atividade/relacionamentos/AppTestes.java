
package com.mycompany.atividade.relacionamentos;

public class AppTestes {
    
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
        
        System.out.println(carrinho);
        System.out.println("-".repeat(50));
        
        System.out.println("Quantidade: "+ carrinho.getQuantidade());
        System.out.println("-".repeat(50));
        
        System.out.println("Existe Coca-cola?: "+carrinho.existsPorNome("Coca-cola"));
        System.out.println("Existe feijão?: "+carrinho.existsPorNome("Feijão"));;
        System.out.println("-".repeat(50));
        
        System.out.println("Quantidade por limpeza: "+carrinho.getQuantidadePorCategoria("Limpeza"));
        System.out.println("Quantidade por ferramentas: "+carrinho.getQuantidadePorCategoria("Ferramentas"));
        System.out.println("Quantidade por informatica: "+carrinho.getQuantidadePorCategoria("Informática"));
        System.out.println("-".repeat(50));
        
        System.out.println("Limpando lista!");
        carrinho.limpar();
        System.out.println(carrinho);
        System.out.println("Quantidade: "+ carrinho.getQuantidade());
        System.out.println("-".repeat(50));
        
        System.out.println("Adicionando 3 itens!");
        carrinho.adicionar(p2);
        carrinho.adicionar(p3);
        carrinho.adicionar(p4);
        System.out.println(carrinho);
        System.out.println("-".repeat(50));
        
        System.out.println("Removendo Durex por nome");
        carrinho.removerPorNome("Durex");
        System.out.println(carrinho);
        System.out.println("-".repeat(50));
        
        System.out.println("Buscar por nome, Pão de forma: "+carrinho.getPorNome("Pão de forma"));
        System.out.println("Buscar por nome, Durex: "+carrinho.getPorNome("Durex"));
        System.out.println("-".repeat(50));
        
        System.out.println("Valor total do carrinho: "+carrinho.getValorTotal());
        System.out.println(carrinho);
        System.out.println("-".repeat(50));
    }
    
}
