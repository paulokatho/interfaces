package exercicios.lambda;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

        Function<String, String> oResultadoE = resultado -> "O resultado é : " + resultado;

        Function<String, String> empolgado = resultado -> resultado + "!!! - Empolgado";

        Function<String, String> duvida = resultado -> resultado + "???? - Dúvida";

        // Composição de funções
        // Acrescenta o resultado das funções na variavel String resultadoFinal
        String resultadoFinal1 = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(10);

        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(11);

        System.out.println();
        //System.out.println(oResultadoE.apply(parOuImpar.apply(11)));
        System.out.println(resultadoFinal1);// Resultado empolgado!
        System.out.println(resultadoFinal2);// Resultado com dúvida?

    }
}
