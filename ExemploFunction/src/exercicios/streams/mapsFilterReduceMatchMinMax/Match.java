package exercicios.streams.mapsFilterReduceMatchMinMax;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        // Vendo sobre funções Match
        // Match é uma forma de verificar se todos, algum ou nenhum elemento
        // de uma coleção atende a uma determinada condição.

        // Exemplo: Verificar se todos os alunos estão aprovados, se algum aluno está
        // aprovado ou se nenhum aluno está reprovado.

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a4 = new Aluno("Gui", 8.1);
        Aluno a3 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        // Alunos REPROVADOS
        Predicate<Aluno> reprovado = aprovado.negate(); // Posso negar a função anterior

        System.out.println(alunos.stream().allMatch( aprovado)); // Todos os alunos estão aprovados?
        System.out.println(alunos.stream().anyMatch( aprovado)); // Algum aluno está aprovado?
        System.out.println(alunos.stream().noneMatch( reprovado)); // Nenhum aluno está reprovado?
    }
}
