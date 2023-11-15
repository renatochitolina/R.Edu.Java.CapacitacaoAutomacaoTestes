/*
#################################################################################################################

5. Implementar um jogo Jokenpô (Pedra, Papel ou Tesoura), **lendo** duas escolhas do usuário, aplicando as 
*regras de negócio* clássicas do jogo, e **escrevendo** qual foi a opção vencedora. As opções devem ser seguidas 
conforme os números abaixo:
- 1 - Pedra
- 2 - Papel
- 3 - Tesoura

#################################################################################################################
*/

package m01_1.d2_3.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jokenpô - Pedra, Papel ou Tesoura");
        System.out.println("Escolha sua opção:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        System.out.print("Jogador 1, escolha uma opção: ");
        int jogador1 = input.nextInt();

        System.out.print("Jogador 2, escolha uma opção: ");
        int jogador2 = input.nextInt();

        if (jogador1 < 1 || jogador1 > 3 || jogador2 < 1 || jogador2 > 3) {
            System.out.println("Opção inválida. Escolha apenas entre 1, 2 ou 3.");
        } else {
            String resultado = "";

            if (jogador1 == jogador2) {
                resultado = "Empate! Ambos escolheram a mesma opção.";
            } else if ((jogador1 == 1 && jogador2 == 3)
                    || (jogador1 == 2 && jogador2 == 1)
                    || (jogador1 == 3 && jogador2 == 2)) {
                resultado = "Jogador 1 venceu!";
            } else {
                resultado = "Jogador 2 venceu!";
            }

            System.out.println(resultado);
        }
    }
}
