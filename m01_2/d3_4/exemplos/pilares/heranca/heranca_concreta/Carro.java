package m01_2.d3_4.exemplos.pilares.heranca.heranca_concreta;

public class Carro {
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
}
