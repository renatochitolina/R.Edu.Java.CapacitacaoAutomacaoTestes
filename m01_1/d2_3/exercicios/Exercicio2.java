/*
#################################################################################################################

2. Para cada produto **lido** (nome, preço e quantidade), **escrever** o nome do produto comprado e o valor total 
a ser pago, considerando que são oferecidos descontos pelo número de unidades (quantidade) compradas, segundo as 
*regras de negócio* abaixo:
- *Até* 10 unidades - sem desconto
- 21 a 50 unidades - 20% de desconto
- *Acima de* 50 unidades - 25% de desconto

> Resolver através dos comandos de decisão `if`, `else` ou `else if`

#################################################################################################################
*/

package m01_1.d2_3.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = input.nextLine();

        System.out.print("Informe o preço do produto: ");
        double precoProduto = input.nextDouble();

        System.out.print("Informe a quantidade comprada: ");
        int quantidadeComprada = input.nextInt();

        double valorTotal = 0.0;

        if (quantidadeComprada <= 10) {
            valorTotal = quantidadeComprada * precoProduto;
        } else if (quantidadeComprada <= 20) {
            valorTotal = quantidadeComprada * precoProduto * 0.9; // 10% de desconto
        } else if (quantidadeComprada <= 50) {
            valorTotal = quantidadeComprada * precoProduto * 0.8; // 20% de desconto
        } else {
            valorTotal = quantidadeComprada * precoProduto * 0.75; // 25% de desconto
        }

        System.out.println("Produto comprado: " + nomeProduto);
        System.out.println("Valor total a ser pago: R$" + valorTotal);
    }
}
