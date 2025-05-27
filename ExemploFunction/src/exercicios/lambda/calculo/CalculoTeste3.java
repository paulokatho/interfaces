package exercicios.lambda.calculo;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        //Somar
        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };
        System.out.println(calc.apply(3.0, 4.0));

        //Multiplicar
        calc = (x, y) -> x * y;
        System.out.println(calc.apply(3.0, 4.0));
    }
}
