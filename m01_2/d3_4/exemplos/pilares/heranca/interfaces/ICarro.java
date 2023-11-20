package m01_2.d3_4.exemplos.pilares.heranca.interfaces;

/* 
 * O que antes era a classe mãe "Carro", agora
 * se torna apenas um contrato, que define
 * as especificações que quem o implementa
 * (as classes filhas) terá que atender
 */
public interface ICarro {
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";
    public static final String HONDA = "Honda";
    public static final String TESLA = "Tesla";

    // Especificação de assinatura do getLigado
    boolean getLigado();

    // Especificação de assinatura do setLigado
    void setLigado(boolean ligado);

    /*
     * Especificação de assinatura do buzinar,
     * mas aqui está sendo removida a "obrigatoriedade"
     * de implementação nas classes filhas, pois
     * a própria interface já está definindo uma
     * implementação "default". De qualquer maneira
     * uma classe que implementar essa interface ainda
     * poderá "sobrescrever" esse método se quiser
     */
    default void buzinar() {
        System.out.println("Buzinou o carro");
    }
}
