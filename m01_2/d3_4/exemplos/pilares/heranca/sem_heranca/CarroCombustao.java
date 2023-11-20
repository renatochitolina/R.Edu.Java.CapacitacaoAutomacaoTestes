package m01_2.d3_4.exemplos.pilares.heranca.sem_heranca;

public class CarroCombustao {
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";
    public static final String HONDA = "Honda";
    public static final String TESLA = "Tesla";

    public String marca;
    public int rodas;
    private boolean ligado;

    public CarroCombustao(String marca) {
        this.marca = marca;
    }

    public void buzinar() {
        System.out.println("Buzinou o " + this.marca);
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;

        if (ligado)
            System.out.println(this.marca + " à combustão está ligado");
        else
            System.out.println(this.marca + " à combustão está desligado");
    }
}
