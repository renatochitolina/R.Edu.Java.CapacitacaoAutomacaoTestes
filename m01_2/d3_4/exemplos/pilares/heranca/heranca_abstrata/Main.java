package m01_2.d3_4.exemplos.pilares.heranca.heranca_abstrata;

public class Main {
    public static void main(String[] args) {
        // Agora não tem mais como utilizar a classe mãe diretamente
        // Carro hondaGenerico = new Carro(Carro.FORD); // Não funciona

        CarroCombustao fordCombustao = new CarroCombustao(CarroCombustao.FORD);
        fordCombustao.setLigado(true);
        fordCombustao.buzinar();

        CarroEletrico teslaEletrico = new CarroEletrico(CarroEletrico.TESLA);
        teslaEletrico.setLigado(true);
        teslaEletrico.buzinar();
    }
}
