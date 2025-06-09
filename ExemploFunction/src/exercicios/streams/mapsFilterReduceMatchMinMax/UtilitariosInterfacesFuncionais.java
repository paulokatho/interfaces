package exercicios.streams.mapsFilterReduceMatchMinMax;

import java.util.function.UnaryOperator;

public class UtilitariosInterfacesFuncionais {

    private UtilitariosInterfacesFuncionais() {
        // Classe utilitária não deve ser instanciada
    }

    public final static UnaryOperator<String> maiuscula =
            texto -> texto.toUpperCase();

    public final static UnaryOperator<String> primeiraLetra =
            texto -> texto.charAt(0) + ""; // Uma string vazia para o retorno ser String

    public final static String grito(String texto) {
        return texto + "!!! ";
    }
}
