package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;// Só para facilitar a impressão
        //Consumer<Object> println = System.out::println;
        Consumer<Integer> println = System.out::println; // Para imprimir números inteiros


        /* Vamos ver formas de como criar Streams em Java. */


        // Forma 1: Usando metodo estático - .of() - da classe Stream
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        // Forma 2: Usando um Array
        String [] maisLangs = { "Phyton ", "Lisp ", "Pearl ", "Go\n"};
        Stream.of(maisLangs).forEach(print);

        // Forma 3: Usando .stream() - de uma coleção (Arrays nesse caso)
        Arrays.stream(maisLangs).forEach(print);

        // Forma 4: Usando um subconjunto de um Array
        // Onde 1 e 3 são os índices do Array. Ou os intervalos que serão impressos
        Arrays.stream(maisLangs, 1, 4).forEach(print);

        // Forma 5: Usando Collections
        // List(ArrayList, LinkedList) - Set(HashSet, Treeset) - Map(HashMap, TreeMap)
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print); // Impressao de forma Ordenada

        // Impressao de forma Paralela (Não Ordendada)
        outrasLangs.parallelStream().forEach(print);

        //Forma 6: Usando Stream.generate()
        Stream.generate(() -> "\na")
                .limit(100) // Limita a 100 elementos, se não vai gerar infinitamente
                .forEach(print); // Gera 100 letras 'a'

        // Forma 7: Usando Stream.iterate()
        System.out.println();
        Stream.iterate(0, n -> n + 1)
                .limit(100000) // Limita a 100000 elementos
                .forEach(println);



    }
}
