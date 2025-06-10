package exercicios.streams.mapsFilterReduceMatchMinMax;

public class MediaReduce {

    private double total;
    private int quantidade;

    public MediaReduce adicionar(double valor) {
        total += valor;
        quantidade++;
        return this;
    }

    public double getValor() {
        return total / quantidade;
    }

    public static MediaReduce combinar(MediaReduce m1, MediaReduce m2) {
        MediaReduce resultante = new MediaReduce();
        resultante.total = m1.total + m2.total;
        resultante.quantidade = m1.quantidade + m2.quantidade;
        return resultante;
    }
}
