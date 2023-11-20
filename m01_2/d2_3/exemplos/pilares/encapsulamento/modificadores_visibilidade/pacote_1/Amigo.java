package m01_2.d2_3.exemplos.pilares.encapsulamento.modificadores_visibilidade.pacote_1;

// Importando as classes do outro pacote (ignorar mais detalhes)
import m01_2.d2_3.exemplos.pilares.encapsulamento.modificadores_visibilidade.pacote_2.*;

public class Amigo {
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
         * círculo social (pacote_2). o amigo
         * NÃO é uma delas
         */
        // Empresa2.ligarDaEmpresa2(); // Inacessível

        /*
         * O celular é acessível pela pessoa
         * e somente ela
         */
        // Pessoa.ligarDoCelular(); // Inacessível
    }
}
