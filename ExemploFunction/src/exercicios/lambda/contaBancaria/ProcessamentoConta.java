package exercicios.lambda.contaBancaria;

import java.util.function.UnaryOperator;

public class ProcessamentoConta {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Katho", 1000.00);

        // Aplica 10% de juros
        UnaryOperator<ContaBancaria> aplicarJuros = c -> {
            c.setSaldo(c.getSaldo() * 1.10);
            return c;
        };

        // Desconta taxa de R$ 50,00
        UnaryOperator<ContaBancaria> descontarTaxa = c -> {
            c.setSaldo(c.getSaldo() - 50.00);
            return c;
        };

        // Arredonda o saldo para 2 casas decimais (simulado)
        UnaryOperator<ContaBancaria> arredondarSaldo = c -> {
            double saldoArredondado = Math.round(c.getSaldo() * 100.0) / 100.0;
            c.setSaldo(saldoArredondado);
            return c;
        };

        // Encadeamento de operações
        ContaBancaria contaFinal = aplicarJuros
                .andThen(descontarTaxa)
                .andThen(arredondarSaldo)
                .apply(conta);

        System.out.println("********************* Após processamento: *********************");
        System.out.println(contaFinal);
    }
}
