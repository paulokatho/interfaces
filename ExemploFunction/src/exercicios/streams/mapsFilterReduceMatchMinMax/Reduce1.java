package exercicios.streams.mapsFilterReduceMatchMinMax;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Função que vai somar
        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        // Utilizando o reduce() com retorno de Optional<Integer>
        Integer total1 = nums.stream().reduce(soma).get();
        System.out.println(total1);

        // reduce() com retorno de Integer garantido pelo 100
        Integer total2 = nums.stream().reduce(100, soma); // 100 é o valor inicial
        System.out.println(total2);

        // reduce() com retorno de Integer garantido pelo 100
        // **** CUIDADO COM O PARALLEL STREAM ****
        // O resultado pode ser diferente por causa do paralelismo
        Integer total3 = nums.parallelStream().reduce(100, soma); // 100 é o valor inicial
        System.out.println(total3);

        // Resultado foi um Optional<Integer>...
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)// Ele vai somar todos numeros da lista que são maiores que 5 e descarta o restante
                .ifPresent(System.out::println);



    }
}
