/*
#################################################################################################################

3. Calcular e **escrever** a sequência de Fibonacci mais próxima de um número inteiro não-negativo **lido**, 
seguindo as *regras de negócio* clássicas da sequência. Por exemplo, para o número 150, escrever:
```md
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
```

> Resolver através dos comandos de repetição `while` ou `do-while`

#################################################################################################################
*/

package m01_1.d3_4.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro não-negativo: ");
        int numero = input.nextInt();

        int fib1 = 0;
        int fib2 = 1;

        System.out.println("Sequência de Fibonacci mais próxima de " + numero + ":");

        System.out.println(numero);

        while (fib1 <= numero) {
            System.out.print(fib1 + " ");

            int soma = fib1 + fib2;
            fib1 = fib2;
            fib2 = soma;
        }
    }
}
