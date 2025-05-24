import java.util.function.Function;

public class ExemploFunction {
    public static void main(String[] args) {

        Function<Integer, String> dobrar = (valor) -> "Dobro: " + (valor * 2);

        String resultado = dobrar.apply(5);

        System.out.println();
        System.out.println("FUNCTION 01: ");
        System.out.println(resultado);
        System.out.println();
        System.out.println("FUNCTION 02: ");
        System.out.println();

        processarTexto("katho mau", upper -> upper.toUpperCase());
        processarTexto("katho mau", texto -> texto + " - Metal");


    }
    public static void processarTexto(String texto, Function<String, String> transformador) {
        String resultado = transformador.apply(texto);
        System.out.println("Resultado: " + resultado);
    }
}

