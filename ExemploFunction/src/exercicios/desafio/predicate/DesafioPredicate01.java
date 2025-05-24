package exercicios.desafio.predicate;

import java.util.function.Predicate;

public class DesafioPredicate01 {

    public static void main(String[] args) {
        Predicate<String> contemJava = texto -> texto.contains("Java");

        System.out.println();
        System.out.println("É par? Resultado: " + contemJava.test("Java é vida e rock and roll também!"));
    }
}
