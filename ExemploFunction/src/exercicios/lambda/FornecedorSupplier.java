package exercicios.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class FornecedorSupplier {

    public static void main(String[] args) {

        Supplier<List<String>> listaDeNomes = () -> Arrays.asList("Katho", "Mario", "Mario", "Enzo", "Nathaly");

        System.out.println(listaDeNomes.get()); // [Katho, Mario, Mario, Enzo, Nathaly]
    }
}
