package exercicios.streams.mapsFilterReduceMatchMinMax;

import java.sql.SQLOutput;

public class MediaReduceTeste {

    public static void main(String[] args) {

        MediaReduce m1 = new MediaReduce().adicionar(8.3).adicionar(6.7);
        MediaReduce m2 = new MediaReduce().adicionar(7.9).adicionar(6.6);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(MediaReduce.combinar(m1, m2).getValor());
    }
}
