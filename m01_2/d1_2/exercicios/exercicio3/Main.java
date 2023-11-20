/*
#################################################################################################################

3. Refatorar a calculadora feita nos exercícios 3 e 4 do dia de Comandos de decisão no módulo Lógica de 
Programação, agora segregando todas as operações em diferentes métodos estáticos
Referência: [Exercícios 3 e 4](/m01_1/d2_3/exercicios/Exerc%C3%ADcios.md#3-criar-uma-calculadora-que-leia-dois-valores-e-escreva-o-resultado-de-opera%C3%A7%C3%B5es-de-soma-subtra%C3%A7%C3%A3o-multiplica%C3%A7%C3%A3o-divis%C3%A3o-e-potencia%C3%A7%C3%A3o-utilizar-a-estrutura-if)

#################################################################################################################
*/

package m01_2.d1_2.exercicios.exercicio3;

import java.util.Scanner;

public class Main {
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

        Calculadora calculadora = new Calculadora();

        double resultado = 0.0;

        switch (escolha) {
            case 1:
                resultado = Soma.somar(num1, num2);
                break;
            case 2:
                resultado = Subtração.subtrair(num1, num2);
                break;
            case 3:
                resultado = Multiplicação.multiplicar(num1, num2);
                break;
            case 4:
                resultado = Divisão.dividir(num1, num2);
                break;
            case 5:
                resultado = Potenciação.elevarPotencia(num1, num2);
                break;
            default:
                System.out.println("Escolha inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
