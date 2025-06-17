package simpleFunctions;

public class SimplesFunctions01 {

    public static void main(String[] args) {

        // Classe anonima que implementa a interface CustomFunction
        CustomFunction<Integer, String> intParaString = new CustomFunction<Integer, String>() {
            // Transforma um Integer em String
            public String apply(Integer i) {
                return i.toString();
            }
        };
        System.out.println("\nintParaString")  ;
        System.out.println(intParaString.apply(10));

        // Lambda
        CustomFunction<Integer, String> intParaStringLambda = Object::toString; // Ou podemos usar (i) -> i.toString();

        System.out.println("\nintParaString - Lambda")  ;
        System.out.println(intParaStringLambda.apply(10));

        // Adiciona 1
        CustomFunction<Integer, Integer> proximoNumero = new CustomFunction<Integer, Integer>() {
            public Integer apply(Integer i) {
                return i + 1;
            }
        };
        System.out.println("\nAdiciona 1 - Classe Anônima ")  ;
        System.out.println(intParaString.apply(proximoNumero.apply(10)));

        // Adiciona 1 - Lambda
        CustomFunction<Integer, Integer> proximoNumeroLambda = i -> i + 1;

        System.out.println("\nintParaString")  ;
        System.out.println(proximoNumeroLambda.apply(10));
    }
}
