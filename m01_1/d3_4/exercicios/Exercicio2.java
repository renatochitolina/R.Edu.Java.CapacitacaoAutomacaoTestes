/*
#################################################################################################################

2. Gerar e **escrever** em uma única linha 10 números aleatórios entre 0 e 100. Também identificar e **escrever** 
em linhas subsequentes o menor e o maior números dentre os gerados

#################################################################################################################
*/

package m01_1.d3_4.exercicios;

import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        Random random = new Random();

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        System.out.print("Números aleatórios: ");

        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(101);
            System.out.print(numero + " ");

            if (numero < menor) {
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}
