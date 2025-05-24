package exercicios.desafio.function;

import java.util.function.Function;

public class Desafio02 {

    public static void main(String[] args) {

        //EXERCÍCIO 1
        Function<String, Integer> contarLetras = texto -> {
            String semEspacos = texto.replace(" ", "");
            return semEspacos.length();
        };

        int resultado = contarLetras.apply("java rocks123");

        System.out.println();
        System.out.println("FUNCTION 01: ");
        System.out.println("O valor dobrado é: " + resultado);


        //EXERCÍCIO 2
        Function<String, Integer> contarLetras2 = texto ->
                (int) texto.chars()
                        .filter(c -> c != ' ')
                        .count();

        int resultado2 = contarLetras2.apply("java rocks");

        System.out.println();
        System.out.println("FUNCTION 02: ");
        System.out.println("O valor dobrado é: " + resultado2);
        System.out.println();


        //EXERCÍCIO 3
        Function<String, Integer> contarLetras3 = texto ->
                (int) texto.chars()
                        .filter(c -> c != ' ' && Character.isLetter(c))
                        .count();

        int resultado3 = contarLetras3.apply("java rocks 123");

        System.out.println();
        System.out.println("FUNCTION 03: ");
        System.out.println("O valor dobrado é: " + resultado3);
        System.out.println();


        //EXERCÍCIO 4
        Function<String, Integer> contarLetras4 = texto ->
                (int) texto.chars()
                        .filter(c -> c != ' ' && Character.isLetterOrDigit(c))
                        .count();

        int resultado4 = contarLetras4.apply("java rocks 123");

        System.out.println();
        System.out.println("FUNCTION 04: ");
        System.out.println("O valor dobrado é: " + resultado4);
        System.out.println();

    }
}
