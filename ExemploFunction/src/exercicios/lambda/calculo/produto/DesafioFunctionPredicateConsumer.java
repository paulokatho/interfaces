package exercicios.lambda.calculo.produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFunctionPredicateConsumer {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3893.89, 0.85);
        Produto p2 = new Produto("iPad", 3199.89, 0.10);
        Produto p3 = new Produto("Smartphone", 1999.89, 0.05);

        List<Produto> produtos = new ArrayList<>(Arrays.asList(p1, p2, p3));

        System.out.println("");

        // Calcula preço final com desconto
        Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);
        // Exibe o preço final de cada produto
        Predicate<Produto> isCaro = p -> precoFinal.apply(p) >= 750;

        Consumer<Produto> exibirmensagem = p -> {
            double preco = precoFinal.apply(p);
            String status = isCaro.test(p) ? "Produto caro!!!" : "Bom preço do produto!!!";

            System.out.println(String.format(" - " + p.getNome()
                    + "- Preço Final: R$" + String.format("%.2f", preco)
                    + " ---> " + status));
        };
        System.out.println("\n=================== AVALIAÇÃO DE PREÇO ===================\n");

        produtos.forEach(exibirmensagem);
    }
}
