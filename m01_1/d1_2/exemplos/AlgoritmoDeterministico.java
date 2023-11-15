package m01_1.d1_2.exemplos;

import java.util.Scanner;

public class AlgoritmoDeterministico {
    public static void main(String[] args) {
        /*
         * Determinístico: Não importa o número recebido,
         * ele sempre será impresso em sua forma positiva
         */
        Scanner input = new Scanner(System.in);

        // Entrada
        System.out.println("Digite um número inteiro: ");
        int numero = input.nextInt();

        // Processamento
        int numeroAbs = Math.abs(numero);

        // Saída
        System.out.println(numeroAbs);
    }
}
