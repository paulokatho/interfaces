package highOrderFunctionsPt01;

import java.util.function.Consumer;
import java.util.function.Function;

public class HighOrderFunctions01 {

    public static void main(String[] args) {

        // Saudacao
        // Bom dia, nome
        // Boa noite, nome

        // f2(string nome) -> saudacao + ", " + nome;
        // f1(string saudacao) -> return f2;

        // 1a funcao recebe string -> retorna 2a funcao
        // 2a funcao recebe string -> retorna string + ", " + " string

        Function<String, Function<String, String>> funcao01 =
            new Function<String, Function<String, String>>() {
                public Function<String, String> apply(String valor01) {

                    String texto = "\nComo vai você?\n" + valor01;

                    return new Function<String, String>() {
                        public String apply(String valor02) {
                            return texto + ", " + valor02;
                        }
                    };
                }
        };


        Function<String, String> bomDiaPara = funcao01.apply("Bom dia");
        String saudacaoBomDia = bomDiaPara.apply("Katho");

        System.out.println("\nHIGH ORDER FUNCTION :\n " + saudacaoBomDia);
        System.out.println("\n TESTE 01 :\n " + funcao01.apply("Boa noite").apply("Katho Mau"));

        System.out.println(bomDiaPara.apply("Jacinto Pinto"));


        // Exemplo com Lambda

        Function<String, Function<String, String>> saudacaoLambda =
            saudacao -> (funcao02 -> saudacao + ", " + funcao02);
        // Lambda que recebe um parametro e retorna uma funcao.
        // A função 02 recebe um parametro e retorna uma string.
        
        System.out.println("\nCOM LAMBDA :\n " +
            saudacaoLambda.apply("Boa Noite...").apply("Katho"));

    }
}
