package exercicios.desafio.predicate;

import java.util.function.Predicate;

public class DesafioPredicate02 {

    public static void main(String[] args) {
        Predicate<String> temMaisDecincoLetras = valor -> valor.replace(" ", "").length() > 5;

        System.out.println();
        System.out.println("Número positivo? Resultado: " + temMaisDecincoLetras.test("Java"));
        System.out.println("Número positivo? Resultado: " + temMaisDecincoLetras.test("Katho Mau"));
    }
}
