package exercicios.generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {

        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3);// Aqui podemos ter um erro de "ClassCastException"

        //Integer coisaA = (Integer) caixaA.abrir();// Essa forma da erro de ClassCastException
        Double coisaA = (Double) caixaA.abrir(); // Aqui estamos fazendo o cast correto
        System.out.println(coisaA);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Texto genérico");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);

        // Esse tipo de cast explícito pode levar a erros em tempo de execução,
        // pois não há garantia de que o objeto armazenado é do tipo esperado.
        // Para evitar isso, é melhor usar generics, que garantem o tipo em tempo de compilação.
        // Em tempo de compilação vai dar erro e vamos pegar o erro antes de executar o programa.
        // Não chega a ir para o cliente com problema, pegamos o erro antes.

    }


}
