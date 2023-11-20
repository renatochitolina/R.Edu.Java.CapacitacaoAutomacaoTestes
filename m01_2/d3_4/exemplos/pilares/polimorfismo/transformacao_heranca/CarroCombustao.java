package m01_2.d3_4.exemplos.pilares.polimorfismo.transformacao_heranca;

public class CarroCombustao extends Carro {
    private static final int PADRAO_RODAS = 5;

    public CarroCombustao(String marca) {
        this(marca, PADRAO_RODAS);
    }

    public CarroCombustao(String marca, int rodas) {
        super(marca, rodas);
    }

    public void buzinar(String somBuzina) {
        System.out.println("Buzinou o " + this.marca + " através da CarroCombustao: \"" + somBuzina + "\"");
    }
}
