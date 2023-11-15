/*
#################################################################################################################

1. **Escrever** a tabuada de um número **lido**. Por exemplo, para o número 1, escrever:
```md
1x1 = 1
2x1 = 2
3x1 = 3
4x1 = 4
5x1 = 5
6x1 = 6
7x1 = 7
8x1 = 8
9x1 = 9
10x1 = 10
```

> Resolver através do comando de repetição `for`

#################################################################################################################
*/

package m01_1.d3_4.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        int numero = input.nextInt();

        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
