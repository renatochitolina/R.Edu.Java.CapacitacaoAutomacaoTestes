/*
#################################################################################################################

1. Criar um mini sistema de biblioteca, contendo as classes `Pessoa`, `Livro` e `Emprestimo`

#################################################################################################################
*/

package m01_2.d2_3.exercicios.exercicio1;

public class Biblioteca {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João dos Santos");
        Livro livro1 = new Livro("Literatura Brasileira em um clique");
        Emprestimo emprestimo1 = new Emprestimo(pessoa1, livro1);

        System.out.println("Dados do empréstimo:");
        System.out.println("Pessoa: " + emprestimo1.getPessoa().getNome());
        System.out.println("Livro: " + emprestimo1.getLivro().getTitulo());
    }
}
