package school.sptech.projeto1.heranca;

public class ProdutoInternacional extends Produto {

    /* 
        1. Essa classe deve ser herdeira de produto;
        2. O método "getPreco" (getter padrão) deverá ser sobreescrito e possuir um acréscimo de 60%;
    */
    
    public ProdutoInternacional(Integer id, String nome, String categoria, Double preco) {
        super(id, nome, categoria, preco);
    }

    public Double getPreco() {
        Double acrescimo = (super.getPreco() * 60) / 100;

        return super.getPreco() + acrescimo;
    }
}
