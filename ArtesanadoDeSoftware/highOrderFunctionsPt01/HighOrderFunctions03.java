package highOrderFunctionsPt01;

import java.util.function.Function;

public class HighOrderFunctions03 {

    public static void main(String[] args) {

        // RETORNO ESPERADO:
        // i1 -> (i2 -> (i3 -> i1 + i2 + i3))
        // i1 -> i2 -> i3 -> i1 + i2 + i3

        // Exemplo de função de alta ordem que retorna uma função aninhada
        Function<Integer, Function<Integer, Function<Integer, Integer>>> f1 =
                new Function<Integer, Function<Integer, Function<Integer, Integer>>>() {
                    @Override
                    public Function<Integer, Function<Integer, Integer>> apply(Integer i1) {
                        return new Function<Integer, Function<Integer, Integer>>() {
                            @Override
                            public Function<Integer, Integer> apply(Integer i2) {
                                return new Function<Integer, Integer>() {
                                    @Override
                                    public Integer apply(Integer i3) {
                                        return i1 + i2 + i3;
                                    }
                                };
                            }
                        };
                    }
                };
        // Exemplo de uso
        Function<Integer, Function<Integer, Integer>> f2 = f1.apply(10);
        Function<Integer, Integer> f3 = f2.apply(20);
        System.out.println("\nHIGH ORDER FUNCTION - COM CLASSE ANÔNIMA:\n " + f3.apply(30)); // Saída: 60

        // Exemplo com Lambda
        Function<Integer, Function<Integer, Function<Integer, Integer>>> f1Lambda =
                i1 -> i2 -> i3 -> i1 + i2 + i3;

        System.out.println("\nHIGH ORDER FUNCTION - COM LAMBDA:\n " );
        System.out.println(f1Lambda.apply(10).apply(20).apply(40)); // Saída: 70
    };
}
