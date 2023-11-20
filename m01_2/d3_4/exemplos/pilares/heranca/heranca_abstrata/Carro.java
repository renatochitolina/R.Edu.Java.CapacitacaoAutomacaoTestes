package m01_2.d3_4.exemplos.pilares.heranca.heranca_abstrata;

/* 
 * Tornando a classe mãe "Carro" abstrata (abstract)
 * para que ela comece a ser tratada apenas como
 * uma "base comum" entre suas especializações 
 * (classes filhas)
 */
public abstract class Carro {
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";
    public static final String HONDA = "Honda";
    public static final String TESLA = "Tesla";

    public String marca;
    public int rodas;
    /*
     * A classe mãe (Carro) vai conter o estado de ligado
     * e vai possibilitar a leitura encapsulada deste estado,
     * porém ela não vai saber como atualizar este estado,
     * pois este comportamento vai ser implementado nas
     * classes filhas
     */
    protected boolean ligado;

    public Carro(String marca) {
        this.marca = marca;
    }

    public void buzinar() {
        System.out.println("Buzinou o " + this.marca);
    }

    // Leitura encapsulada do estado de ligado
    public boolean getLigado() {
        return this.ligado;
    }

    /*
     * Definindo uma especificação abstrata de setLigado
     * para que todas as classes que herdarem desta classe
     * entendam que precisam implementar esse método em
     * seus contextos
     * 
     * Esse método não tem corpo definido aqui, somente sua
     * "assinatura" (cabeçalho), pois o corpo (implementação)
     * em si vai ser exigida em cada classe filha
     */
    public abstract void setLigado(boolean ligado);
}
