package exercicios.generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilGenericsTeste {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        // IUtilizando o método genérico com tipo Object da classe ListaUtilGenerics
        String ultimaLinguagem1 = (String) ListaUtilGenerics.getUltimo1(langs);
        System.out.println(ultimaLinguagem1);

        Integer ultimonumero1 = (Integer) ListaUtilGenerics.getUltimo1(nums);
        System.out.println(ultimonumero1);

        // Utilizando o método genérico com tipo T da classe ListaUtilGenerics
        String ultimaLinguagem2 = ListaUtilGenerics.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);

        Integer ultimoNumero2 = ListaUtilGenerics.getUltimo2(nums);
        System.out.println(ultimoNumero2);
    }
}

