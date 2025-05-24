package exercicios.desafio.function;

import java.util.function.Function;

public class Desafio04 {

    public static void main(String[] args) {

        Function<String, String> textoReverso = texto -> {
            StringBuilder sb = new StringBuilder(texto);
            return sb.reverse().toString();
        };

        String resultado = textoReverso.apply("Rock and Roll");

        System.out.println();
        System.out.println("Texto reverso: " + resultado);
    };
}
