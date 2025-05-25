package exercicios.desafio.supplier;

import java.util.function.Supplier;

public class DasafioSupplier02 {

        public static void main(String[] args) {
            // Supplier é uma interface funcional que não recebe parâmetros e retorna um valor.
            Supplier<Integer> numeroAleatorio = () -> {
                // Gera um número aleatório entre 1 e 100
                return (int) (Math.random() * 100) + 1;

            };
            System.out.println("\nNúmero aleatório: " + numeroAleatorio.get());
        }
}
