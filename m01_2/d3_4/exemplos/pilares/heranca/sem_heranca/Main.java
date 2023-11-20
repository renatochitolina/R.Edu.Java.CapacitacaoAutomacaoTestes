package m01_2.d3_4.exemplos.pilares.heranca.sem_heranca;

public class Main {
    public static void main(String[] args) {
        CarroCombustao fordCombustao = new CarroCombustao(CarroCombustao.FORD);
        fordCombustao.setLigado(true);
        fordCombustao.buzinar();

        CarroEletrico teslaEletrico = new CarroEletrico(CarroEletrico.TESLA);
        teslaEletrico.setLigado(true);
        teslaEletrico.buzinar();
    }
}
