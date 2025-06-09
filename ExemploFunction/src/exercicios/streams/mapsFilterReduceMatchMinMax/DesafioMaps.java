package exercicios.streams.mapsFilterReduceMatchMinMax;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMaps {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
            1. Número para string binária... 6 => "110"
            2. Inverter a string... "110" => "011"
            3. Converter de volta para inteiro => "011" => 3
        **/

        UnaryOperator<String> inverterString = texto ->
                new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterParaInteiro =  texto -> Integer.parseInt(texto, 2);

        nums.stream()
                .map(Integer::toBinaryString) // 1. Número para string binária
                .map(inverterString)
                .map(converterParaInteiro)
                .forEach(System.out::println);
    }
}
