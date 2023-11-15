/*
#################################################################################################################

4. **Ler** um número infinitamente, até que o usuário informe o número 10

#################################################################################################################
*/

package m01_1.d3_4.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Digite números infinitamente. Digite 10 para sair.");

        while (true) {
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if (numero == 10) {
                System.out.println("Você digitou o número 10. Saindo...");
                break;
            }
        }
    }
}
