/*
#################################################################################################################

3. Criar um mini sistema de agenda telefônica, contendo, no mínimo, operações de adição e deleção de números 
telefônicos (organizar com vetor)

#################################################################################################################
*/

package m01_2.d3_4.exercicios.exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica(10);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Deletar contato");
            System.out.println("3. Listar contatos");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número de telefone a ser adicionado: ");
                    String numero = scanner.nextLine();
                    agenda.adicionarContato(numero);
                    break;
                case 2:
                    System.out.print("Digite o número de telefone a ser deletado: ");
                    numero = scanner.nextLine();
                    agenda.deletarContato(numero);
                    break;
                case 3:
                    agenda.listarContatos();
                    break;
                case 4:
                    System.out.println("Saindo da agenda telefônica.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
