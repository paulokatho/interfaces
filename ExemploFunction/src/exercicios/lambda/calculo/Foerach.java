package exercicios.lambda.calculo;

import java.util.Arrays;
import java.util.List;

public class Foerach {

    public static void main(String[] args) {

        // Usando forEach normal
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println("Forma tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        // Usando forEach com lambda 01
        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        // Usando Method Reference 01
        System.out.println("\nMethod Reference #01...");
        aprovados.forEach(System.out::println);

        // Usando forEach com lambda 02
        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome)); // Essa é uma sentença de código
        // nome -> meuImprimir(nome) - Essa não é uma sentença de código, é uma expressão lambda!
        // É uma expressão lambda que é passada como parametro para a função forEach

        // Usando Method Reference 02
        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(Foerach::meuImprimir); // Passo minha propria classe Foreach e o metodo meuImprimir como referência
        // Esse metodo, meuImprimir, já tem tudo o que preciso e posso usar ele tranquilamente

    }

    static void meuImprimir(String nome) {
        System.out.println("Method Reference 02 - " + nome);
    }
}
