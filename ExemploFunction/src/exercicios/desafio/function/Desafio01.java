package exercicios.desafio.function;

import java.util.function.Function;

public class Desafio01 {

    public static void main(String[] args) {

        Function<Integer, String> dobrar = dobrarValor -> "O dobro é: " + (dobrarValor * 100);
        String resultado = dobrar.apply(2);

        System.out.println("Valor dobrado: " + resultado);
    }

}
