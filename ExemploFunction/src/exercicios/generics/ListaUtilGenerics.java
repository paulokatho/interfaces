package exercicios.generics;

import java.util.List;

public class ListaUtilGenerics {

    public static Object getUltimo1(List<?> lista) {
        return lista.get(lista.size() - 1); // Devolve o último elemento da lista
    }

    public static <T> T getUltimo2(List<T> lista) {
        return lista.get(lista.size() -1); // Devolve o último elemento da lista
    }

    public static <A, B, C> C teste(A paramA, B paramB) {
        C teste = null;
        return teste;
    }
}
