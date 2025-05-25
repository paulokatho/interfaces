package exercicios.desafio.supplier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class DasafioSupplier03 {

    public static void main(String[] args) {
        List<String> frases = new ArrayList<>();
        frases.add("Acredite em você, você é capaz.");
        frases.add("O futuro pertence àqueles que acreditam nos seus sonhos.");
        frases.add("A jornada de mil milhas começa com um único passo.");
        frases.add("A força que você busca está dentro de você.");
        frases.add("A vida é uma sucessão de oportunidades, aproveite-as.");
        frases.add("A persistência vence a resistência.");
        frases.add("Seja o exemplo que você quer ver no mundo.");
        frases.add("Não tenha medo de falhar, mas tenha medo de não tentar.");
        frases.add("Acredite que a felicidade é um direito, não um privilégio.");
        frases.add("Aprende a amar a vida, ela é o maior presente.");

        Supplier<List<String>> mensagens = () -> {
            List<String> mensagemAleatoria = new ArrayList<>(frases);
            Collections.shuffle(mensagemAleatoria);
            List<String> frasesDoDia = mensagemAleatoria.subList(0, 3);
            return frasesDoDia;
        };

        List<String> frasesDoDia = mensagens.get();

        System.out.println("Frases do dia:");
        for (String frase : frasesDoDia) {
            System.out.println("- " + frase);
        }
    }
}
