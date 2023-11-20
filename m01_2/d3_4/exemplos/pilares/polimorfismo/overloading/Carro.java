package m01_2.d3_4.exemplos.pilares.polimorfismo.overloading;

public class Carro {
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";
    public static final String HONDA = "Honda";
    public static final String TESLA = "Tesla";

    protected String marca;
    protected int rodas;

    public Carro(String marca, int rodas) {
        this.marca = marca;
        this.rodas = rodas;
    }

    public int getRodas() {
        return this.rodas;
    }

    // Overload 1 do método buzinar a partir da classe mãe
    public void buzinar() {
        System.out.println("Buzinou o " + this.marca + " através da Carro");
    }
}
