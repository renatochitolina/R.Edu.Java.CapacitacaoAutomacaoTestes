package m01_2.d3_4.exemplos.pilares.polimorfismo.overloading;

public class Main {
    public static void main(String[] args) {
        CarroEletrico teslaEletrico = new CarroEletrico(CarroEletrico.TESLA);
        teslaEletrico.buzinar();
        teslaEletrico.buzinar("Fóón-fóón");
        System.out.println("Rodas do teslaEletrico: " + teslaEletrico.getRodas());

        CarroEletrico hondaEletrico = new CarroEletrico(CarroEletrico.HONDA, 4);
        hondaEletrico.buzinar();
        hondaEletrico.buzinar("Biii-biii");
        System.out.println("Rodas do hondaEletrico: " + hondaEletrico.getRodas());
    }
}
