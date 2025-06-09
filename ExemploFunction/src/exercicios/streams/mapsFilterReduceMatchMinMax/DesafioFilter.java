package exercicios.streams.mapsFilterReduceMatchMinMax;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        List<Eventos> eventos = Arrays.asList(
                new Eventos("Festa de Aniversário", 2023, "São Paulo"),
                new Eventos("Show de Rock", 2022, "Rio de Janeiro"),
                new Eventos("Festival de Música", 2023, "Belo Horizonte"),
                new Eventos("Conferência de Tecnologia", 2021, "São Paulo"),
                new Eventos("Feira de Artesanato", 2023, "Curitiba")
        );

        Predicate<Eventos> eventosRecentes = evento -> evento.ano >= 2022;
        Predicate<Eventos> eventosEmSaoPaulo = evento -> evento.nomeEvento.equals("Show de Rock");
        Function<Eventos, String> formatarEvento = evento ->
                "O Grande evento está de volta : "
                        + evento.nomeEvento.toUpperCase() + " - "
                        + evento.ano + " - "
                        + evento.local.toUpperCase();

        eventos.stream()
                .filter(eventosRecentes)
                .filter(eventosEmSaoPaulo)
                .map(formatarEvento)
                .forEach(System.out::println);
    }
}
