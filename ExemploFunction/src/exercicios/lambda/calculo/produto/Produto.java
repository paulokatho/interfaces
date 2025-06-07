package exercicios.lambda.calculo.produto;

public class Produto {

    protected final String nome;
    protected final Double preco;
    protected final Double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return nome + " tem preço de R$ " + precoFinal + ".";
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

}
