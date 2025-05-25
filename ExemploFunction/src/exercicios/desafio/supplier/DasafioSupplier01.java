package exercicios.desafio.supplier;

import java.util.function.Supplier;

public class DasafioSupplier01 {

        public static void main(String[] args) {
            // Supplier é uma interface funcional que não recebe parâmetros e retorna um valor.
            Supplier<String> agora = () -> {
                // Obtém a data e hora atual do sistema
                java.time.LocalDateTime dataHoraAtual = java.time.LocalDateTime.now();
                // Formata a data e hora no formato desejado
                return dataHoraAtual.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            };

            System.out.println("\nData e hora atual: " + agora.get());
        }
}
