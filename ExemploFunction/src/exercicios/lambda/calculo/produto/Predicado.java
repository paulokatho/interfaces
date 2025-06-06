package exercicios.lambda.calculo.produto;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        // Versão mais legível (ideal para iniciantes e manutenção futura):
        System.out.println();
        System.out.println("-------> 1- Versão mais legível (ideal para iniciantes e manutenção futura): ");
        Predicate<Produto> isCaro = p -> (p.preco * (1 - p.desconto)) >= 750;

        //Produto prod = new Produto("Notebook", 3893.89, 0.85);
        Produto prod = new Produto("Notebook", 3893.89, 0.25);

        Consumer<Produto> exibirMensagem = p -> {
            if (isCaro.test(p)) {
                System.out.println("Produto caro!!!");
            } else {
                System.out.println("Bom preço do produto!!!");
            }
        };

        exibirMensagem.accept(prod);

        // Versão com operador ternário (mais compacta, ainda legível):
        System.out.println();
        System.out.println("-------> 2- Versão com operador ternário (mais compacta, ainda legível):");
        Predicate<Produto> isCaro2 = p -> (p.preco * (1 - p.desconto)) >= 750;

        // Produto prod2 = new Produto("Notebook", 3893.89, 0.15);
        Produto prod2 = new Produto("Notebook", 3893.89, 0.85);

        Consumer<Produto> exibirMensagem2 = p ->
                System.out.println(isCaro2.test(p) ? "Produto caro 2 !!!" : "Bom preço do produto 2 !!!");

        exibirMensagem2.accept(prod2);

        // Ultra enxuta (mas talvez menos didática para quem está começando):
        System.out.println();
        System.out.println("-------> 3- Ultra enxuta (mas talvez menos didática para quem está começando): ");
        Consumer<Produto> exibirMensagem3 = p ->
                System.out.println((p.preco * (1 - p.desconto)) >= 750 ? "Produto caro 3 !!!" : "Bom preço 3 !!!");

        // exibirMensagem3.accept(new Produto("Notebook", 3893.89, 0.15));
        exibirMensagem3.accept(new Produto("Notebook", 3893.89, 0.25));

    }
}
