/*
#################################################################################################################

1. **Ler** a idade de uma pessoa e **escrever** se ela é maior de idade ou não utilizando a estrutura `if`

#################################################################################################################
*/

package m01_1.d2_3.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa não é maior de idade.");

        }

        scanner.close();
    }
}
