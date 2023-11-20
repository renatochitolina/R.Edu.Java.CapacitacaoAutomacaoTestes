package m01_2.d1_2.exercicios.exercicio3;

public class Divisão {
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0.0;
        }
        return num1 / num2;
    }
}
