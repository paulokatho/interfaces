package exercicios.desafio.function;

import java.util.function.Function;

public class Desafio03 {

    public static void main(String[] args) {
        Function<String, String> letra = texto -> {
            char primeiraLetra = texto.charAt(0);
            //Verifica se o primeiro caracter é uma letra e retorna
            return String.valueOf(Character.isLetter(primeiraLetra) ? Character.toUpperCase(primeiraLetra) : texto);
        };


        String resultado = letra.apply("banana");

        System.out.println("O resultado é: " + resultado);
    }
}
