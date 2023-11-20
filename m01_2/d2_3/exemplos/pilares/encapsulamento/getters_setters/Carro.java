package m01_2.d2_3.exemplos.pilares.encapsulamento.getters_setters;

public class Carro {
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";
    public static final String HONDA = "Honda";

    /* Atributos e Propriedades (características) */

    private String marca; // Propriedade read-only (só get)
    private String cor;
    private boolean ligado;

    /* Métodos construtores */

    public Carro(String marca, String cor) {
        this.marca = marca;
        this.setCor(cor);
        this.setLigado(false);
    }

    /* Métodos (comportamentos) */

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Apenas um método "calculado"
    public String getStatus() {
        if (getLigado())
            return "ligado";
        else
            return "desligado";
    }
}
