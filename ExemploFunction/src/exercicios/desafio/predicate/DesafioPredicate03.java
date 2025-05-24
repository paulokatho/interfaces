package exercicios.desafio.predicate;

import java.util.function.Predicate;

public class DesafioPredicate03 {

    public static void main(String[] args) {
        Predicate<String> ehPalindromo = texto -> {
            //String textoIgnoreCase = texto.equalsIgnoreCase();
            StringBuilder sb = new StringBuilder(texto);
            String textoReverso = sb.reverse().toString();
            return textoReverso.equalsIgnoreCase(texto);
        };

        System.out.println();
        System.out.println("É palíndromo? Resultado: " + ehPalindromo.test("arara"));
        System.out.println("É palíndromo? Resultado: " + ehPalindromo.test("java"));
        System.out.println("É palíndromo? Resultado: " + ehPalindromo.test("radar"));
        System.out.println("É palíndromo? Resultado: " + ehPalindromo.test("Katho"));
        System.out.println("É palíndromo? Resultado: " + ehPalindromo.test("Ovo"));
    }
}
