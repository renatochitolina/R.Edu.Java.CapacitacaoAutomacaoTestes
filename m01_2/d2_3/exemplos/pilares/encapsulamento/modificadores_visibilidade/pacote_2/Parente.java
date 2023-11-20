package m01_2.d2_3.exemplos.pilares.encapsulamento.modificadores_visibilidade.pacote_2;

// Importando as classes do outro pacote (ignorar mais detalhes)
import m01_2.d2_3.exemplos.pilares.encapsulamento.modificadores_visibilidade.pacote_1.*;

// Parente pertence à cadeia de herança de Pessoa
public class Parente extends Pessoa {
    public static void main(String[] args) {
        // A cabine pública é acessível a todos
        CabinePublica.ligarDaCabinePublica();

        /*
         * A casa da pessoa é acessível por todos do
         * círculo social (pacote_1) e pelos familiares
         * da pessoa (cadeia de herança)
         */
        Parente.ligarDaCasaPessoa(); // Pessoa.ligarDaCasaPessoa();

        /*
         * A empresa 1 é acessível por todos do
         * círculo social (pacote_1). o parente
         * NÃO é uma delas
         */
        // Empresa1.ligarDaEmpresa1(); // Inacessível

        /*
         * A empresa 2 é acessível por todos do
         * círculo social (pacote_2).
         */
        Empresa2.ligarDaEmpresa2();

        /*
         * O celular é acessível pela pessoa
         * e somente ela
         */
        // Pessoa.ligarDoCelular(); // Inacessível
    }
}
