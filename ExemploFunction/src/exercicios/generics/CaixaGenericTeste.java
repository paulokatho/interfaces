package exercicios.generics;

public class CaixaGenericTeste {

    public static void main(String[] args) {

        // Esse tipo de declaração não é permitido
        // Você tem uma classe genérica e não especificou o tipo - ERRADO e má prática!
        // Veja abaixo:
        //CaixaGenerics caixaA = new CaixaGenerics();

        // Correto: Especificando o tipo de dado que a caixa irá armazenar
        CaixaGenerics<String> caixaA = new CaixaGenerics<>();
        caixaA.guardar(("Segredo!"));

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        CaixaGenerics<String> caixaB = new CaixaGenerics<>();
        caixaB.guardar("Outro Segredo!");

        String coisaB = caixaB.abrir();
        System.out.println(coisaB);

        // Definindo outro tipo para o Generics
        CaixaGenerics<Double> caixaC = new CaixaGenerics<>();
        caixaC.guardar(3.1415);

        Double coisaC = caixaC.abrir();
        System.out.println(coisaC);

    }
}
