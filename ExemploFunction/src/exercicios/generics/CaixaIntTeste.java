package exercicios.generics;

public class CaixaIntTeste {

    public static void main(String[] args) {

        /*
            Nesse exemplo vamos resolver o tipo Generico por herança.
            Na classe CaixaInt, estamos especificando que o tipo TIPO é Integer.
            Então podemos instaciar normalmente a classe e passar o tipo Integer diretamente.

            Não precisa mais definir CaixaInt<Integer> caixaA = new CaixaInt<>();
            Utilizando o : new CaixaInt<>();
         */

        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(42);

        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
