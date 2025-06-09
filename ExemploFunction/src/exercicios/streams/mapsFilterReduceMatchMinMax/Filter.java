package exercicios.streams.mapsFilterReduceMatchMinMax;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.9);
        Aluno a2 = new Aluno("Bia", 6.9);
        Aluno a3 = new Aluno("Lia", 8.9);
        Aluno a4 = new Aluno("Gui", 10.0);
        Aluno a5 = new Aluno("Rebeca", 6.1);
        Aluno a6 = new Aluno("Pedro", 5.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        // Só os alunos com média maior ou igual a 7.0 ficam no filtro
        alunos.stream()
                .filter(nota -> nota.nota >= 7)
                .map(aluno -> "Parabéns " + aluno.nome + "! Você foi aprovado(a)!")
                .forEach(System.out::println);

        System.out.println("\n\n********************* OUTRA IMPLEMENTAÇÃO *********************\n\n");

        Predicate<Aluno> reprovado = aluno -> aluno.nota <= 7;
        Function<Aluno, String> respostaReprovado = aluno -> "Reprovado! " + aluno.nome + " com nota " + aluno.nota;

        alunos.stream()
                .filter(reprovado)
                .map(respostaReprovado)
                .forEach(System.out::println);}
}
