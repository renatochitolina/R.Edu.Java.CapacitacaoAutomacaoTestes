/*
#################################################################################################################

6. Formular um vetor de 100 números inteiros gerados aleatoriamente, ordenar com *bubble sort* e **escrever** o 
resultado

#################################################################################################################
*/

package m01_1.d3_4.exercicios;

import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {

        int[] vetor = new int[100];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000);
        }

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        bubbleSort(vetor);

        System.out.println("\nVetor ordenado:");
        imprimirVetor(vetor);
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean troca;
        do {
            troca = false;
            for (int i = 1; i < n; i++) {
                if (vetor[i - 1] > vetor[i]) {

                    int temp = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    troca = true;
                }
            }
            n--;
        } while (troca);
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
