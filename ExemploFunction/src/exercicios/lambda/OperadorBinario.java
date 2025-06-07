package exercicios.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        // Essa função me retorna a media
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));

        // O BiFunction tem 2 argumentos e 1 retorno e faz tudo em um lugar só
        // Mas é menos reutilizavel
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(9.7, 4.1));

        Function<Double, String> notaFinal =
                m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(notaFinal).apply(9.7, 5.1));

    }
}
