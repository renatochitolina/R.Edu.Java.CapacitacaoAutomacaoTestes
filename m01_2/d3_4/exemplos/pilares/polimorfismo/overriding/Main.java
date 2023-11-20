package m01_2.d3_4.exemplos.pilares.polimorfismo.overriding;

public class Main {
    public static void main(String[] args) {
        CarroEletrico teslaEletrico = new CarroEletrico(CarroEletrico.TESLA);
        teslaEletrico.buzinar();
        System.out.println("Rodas do teslaEletrico: " + teslaEletrico.getRodas());

        CarroEletrico hondaEletrico = new CarroEletrico(CarroEletrico.HONDA, 4);
        hondaEletrico.buzinar();
        System.out.println("Rodas do hondaEletrico: " + hondaEletrico.getRodas());
    }
}
