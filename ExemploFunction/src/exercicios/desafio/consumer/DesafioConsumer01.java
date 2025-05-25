package exercicios.desafio.consumer;

import java.util.function.Consumer;

public class DesafioConsumer01 {

    public static void main(String[] args) {

        Consumer<String> imprime = texto -> System.out.println("Olá, " + texto + "! Bem-vindo ao mundo do Java!");
        System.out.println();
        imprime.accept("Katho Mau");
    }
}
