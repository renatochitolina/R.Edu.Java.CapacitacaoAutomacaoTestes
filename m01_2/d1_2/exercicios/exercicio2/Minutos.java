package m01_2.d1_2.exercicios.exercicio2;

public class Minutos {
    public static int extrairMinutos(int tempoEmSegundos) {
        return (tempoEmSegundos % 3600) / 60;
    }
}
