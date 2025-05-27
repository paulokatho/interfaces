package exercicios.lambda.calculo;

public class CalculoTeste2 {

    public static void main(String[] args) {

        //Somar
        Calculo calc = (x,y) -> {
            return x + y;
        };
        System.out.println(calc.executar(3, 4));

        //Multiplicar
        calc = (x, y) -> x * y;
        System.out.println(calc.executar(3, 4));
    }
}
