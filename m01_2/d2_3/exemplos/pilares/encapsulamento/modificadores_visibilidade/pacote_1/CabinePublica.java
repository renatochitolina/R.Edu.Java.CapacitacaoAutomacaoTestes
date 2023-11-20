package m01_2.d2_3.exemplos.pilares.encapsulamento.modificadores_visibilidade.pacote_1;

/*
 * Só public faz sentido em classes, pois os modificadores 
 * de acesso começam a ter efeito justamente no escopo 
 * interno das classes
 */
public class CabinePublica {
    /* Trabalhando com estáticos pra facilitar o exemplo */

    // [+] public
    public static String linhaPublica = "Linha pública";

    // [+] public
    public static void ligarDaCabinePublica() {
        System.out.println("Ligando da " + linhaPublica);
    }
}
