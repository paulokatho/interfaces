package exercicios.lambda.calculo.produto.desafioCalcularPrecoProdutoFrete;

import exercicios.lambda.calculo.produto.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioCalcularProduto {

    public static void main(String[] args) {

    /*
        1. A partir do produto calcular o preço real (com desconto)
        2. Imposto Municipal: >= 2500 (8,5%) < 2500 (Isento)
        3. Frete: >= 3000 (R$100) < 3000 (R$50)
        3. Arrendondar: Deixar duas casas decimais
        4. Formatar: R$1234,56
     */

        // 1. Preço real com desconto
        Function<Produto, Double> precoComDesconto =
                produto -> produto.getPreco() * (1 - produto.getDesconto());

        // 2. Imposto Municipal
        UnaryOperator<Double> precoComImpostoMunicipal =
                valor -> valor >= 2500 ? valor * 1.085 : valor;

        // 3. Frete
        UnaryOperator<Double> frete = valor ->
                valor >= 3000 ? valor + 100 : valor + 50;

        // 4. Arredondar (2 casas decimais)
        UnaryOperator<Double> arredondar = valor -> Math.round(valor * 100.0) / 100.0;


        // 5. Formatar como moeda (R$1234,56)
        Function<Double, String> formatar =
                valor -> ("R$" + valor).replace(".", ","); // Substitui o ponto por vírgula

        Produto p = new Produto("iPad", 3235.89, 0.13);
        String precoFinal = precoComDesconto
                .andThen(precoComImpostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("\n************** Cálculo do Preço do Produto **************");
        System.out.println("\nPreço final do produto: " + precoFinal);


    }

}
