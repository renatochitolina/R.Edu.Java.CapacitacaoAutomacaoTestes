/*
#################################################################################################################

4. Refatorar a calculadora criada no exercício anterior, substituindo a estrutura `if` por uma estrutura 
`switch case`

#################################################################################################################
*/

package m01_1.d2_3.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Operações disponíveis:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potenciação");

        System.out.print("Escolha uma operação: ");
        int escolha = input.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        double resultado = 0.0;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                resultado = num1 / num2;
                break;
            case 5:
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Escolha inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
