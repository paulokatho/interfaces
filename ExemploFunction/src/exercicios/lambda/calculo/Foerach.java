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


    }

}
