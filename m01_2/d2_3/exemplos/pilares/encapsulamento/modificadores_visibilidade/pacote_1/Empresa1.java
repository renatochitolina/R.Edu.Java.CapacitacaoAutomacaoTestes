package m01_2.d2_3.exemplos.pilares.encapsulamento.modificadores_visibilidade.pacote_1;

/*
 * Só public faz sentido em classes, pois os modificadores 
 * de acesso começam a ter efeito justamente no escopo 
 * interno das classes
 */
public class Empresa1 {
    /* Trabalhando com estáticos pra facilitar o exemplo */

    // [~] default
    /* default */ static String linhaCorporativa = "Linha corporativa Empresa 1";

    // [~] default
    /* default */ static void ligarDaEmpresa1() {
        System.out.println("Ligando da " + linhaCorporativa);
    }
}
