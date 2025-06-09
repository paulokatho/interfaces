package exercicios.streams.mapsFilterReduceMatchMinMax;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioProdutoFilter {

    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Lapis", 1.99, 0.35, 0),
                new Produto("Notebook", 4899.89, 0.32, 0),
                new Produto("Caderno", 30, 0.45, 0),
                new Produto("Impressora", 1200, 0.40, 0),
                new Produto("iPdad", 3100, 0.29, 0),
                new Produto("Relogio", 1900, 0.12, 0),
                new Produto("Monitor", 800, 0.31, 0));

        // Filter, filter, filter e map
        Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
        Predicate<Produto> freteGratis = p -> p.valorFrete >= 0;
        Predicate<Produto> precoRelevante = p -> p.preco >= 500;

        Function<Produto, String> chamadaPromocional =
                p -> "Aproveite! " + p.nome + " por apenas R$" + p.preco;

        produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .filter(precoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);
    }
}
