package exercicios.desafio.consumer;

import java.util.function.Consumer;

public class DesafioConsumer02 {

    public static void main(String[] args) {

        Consumer<Integer> tabuada = numero -> {
            System.out.println("\nTabuada do: " + numero + "\n");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        };

        tabuada.accept(5);
        tabuada.accept(9);
    }
}
