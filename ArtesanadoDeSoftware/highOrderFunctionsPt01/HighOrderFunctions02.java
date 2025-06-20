package highOrderFunctionsPt01;

import java.util.function.Function;

public class HighOrderFunctions02 {

    public static void main(String[] args) {

        // Saudacao
        // Bom dia, nome
        // Boa noite, nome

        Function<String, Function<String, String>> saudacao =
                new Function<String, Function<String, String>>() {

                  public Function<String, String> apply(String nome) {
                      return new Function<String, String>() {
                        public String apply(String saudacao) {
                            return saudacao + ", " + nome;
                        }
                      };
                  }
              };
        // Exemplo de uso
        Function<String, String> bomDia = saudacao.apply("Katho ");
        String mensagem = bomDia.apply("Bom dia");

        System.out.println("\nHIGH ORDER FUNCTION :\n " + mensagem);

        // Exemplo com Lambda
       Function<String, Function<String, String>> saudacaoLambda =
               saudacao02 -> (nome -> saudacao02 + ", " + nome);

        System.out.println("\nSAUDAÇÃO COM LAMBDA :\n " + saudacaoLambda.apply("Boa Noite").apply("Katho Mau"));
    }
}
