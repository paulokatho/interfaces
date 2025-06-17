package highOrderFunctionsPt01;

import java.util.function.Function;

public class Teste02 {

    public static void main(String[] args) {

        // Saudacao
        // Bom dia, nome
        // Boa noite, nome

        // f2(string nome) -> saudacao + ", " + nome;
        // f1(string saudacao) -> return f2;

        // 1a funcao recebe string -> retorna 2a funcao
        // 2a funcao recebe string -> retorna string + ", " + " string

        //Function<String, Function<String, String>>;
        //Function<String, String>;

        Function<String, Function<String, String>> funcao01 =
                new Function<String, Function<String, String>>() {
            public Function<String, String > apply(String saudacao) {
                return new Function<String, String>() {
                    public String apply(String nome) {

                        return saudacao + ", " + nome;
                    }
                };
            }
        };

        System.out.println("\n" + funcao01.apply("Boa Merda").apply("Seu Bosta...\n"));

        Function<String, String> saudacao = funcao01.apply("Saudação de Merda");
        String nome = saudacao.apply("Seu Zé Ruela");

        System.out.println(nome);
    }
}
