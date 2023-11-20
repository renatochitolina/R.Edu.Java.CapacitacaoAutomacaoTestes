package m01_2.d2_3.exemplos.pilares.encapsulamento.modificadores_visibilidade.pacote_1;

// Importando as classes do outro pacote (ignorar mais detalhes)
import m01_2.d2_3.exemplos.pilares.encapsulamento.modificadores_visibilidade.pacote_2.*;

public class Pessoa {
    /* Trabalhando com estáticos pra facilitar o exemplo */

    // [-] private
    private static String linhaParticular = "Linha particular (celular) da Pessoa";

    // [#] protected
    protected static String linhaResidencial = "Linha residencial da Pessoa";

    // [-] private
    private static void ligarDoCelular() {
        System.out.println("Ligando da " + linhaParticular);
    }

    // [#] protected
    protected static void ligarDaCasaPessoa() {
        System.out.println("Ligando da " + linhaResidencial);
    }

    public static void main(String[] args) {
        // A cabine pública é acessível a todos
        CabinePublica.ligarDaCabinePublica();

        /*
         * A casa da pessoa é acessível por todos do
         * círculo social (pacote_1) e pelos familiares
         * da pessoa (cadeia de herança)
         */
        Pessoa.ligarDaCasaPessoa();

        /*
         * A empresa 1 é acessível por todos do
         * círculo social (pacote_1).
         */
        Empresa1.ligarDaEmpresa1();

        /*
         * A empresa 2 é acessível por todos do
         * círculo social (pacote_2). a pessoa
         * NÃO é uma delas
         */
        // Empresa2.ligarDaEmpresa2(); // Inacessível

        /*
         * O celular é acessível pela pessoa
         * e somente ela
         */
        Pessoa.ligarDoCelular();
    }
}
