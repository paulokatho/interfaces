package exercicios.streams.mapsFilterReduceMatchMinMax;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a4 = new Aluno("Gui", 8.1);
        Aluno a3 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> apenasNota = aluno -> aluno.nota;

        BiFunction<MediaReduce, Double, MediaReduce> calcularMedia = (media, nota) ->
                media.adicionar(nota);
        BinaryOperator<MediaReduce> combinarMedia = (m1, m2) ->
                MediaReduce.combinar(m1, m2);

        MediaReduce media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new MediaReduce(), calcularMedia, combinarMedia);

        System.out.println("A média da turma é: " + media.getValor());
    }
}
