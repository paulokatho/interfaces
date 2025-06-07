package exercicios.streams.maps;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print; // Só para facilitar a impressão

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        // UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        // UnaryOperator<String> grito = n -> n + "!!! ";

        System.out.println("\n\nUsando Composição de Funções...");
        marcas.stream() // Built Operator
                .map(UtilitariosInterfacesFuncionais.maiuscula) //
                .map(primeiraLetra) // Intermediate Operator
                .map(UtilitariosInterfacesFuncionais::grito) // Intermediate Operator
                .forEach(print); // Terminal Operator
    }
}
