package m01_2.d3_4.exemplos.pilares.heranca.interfaces;

public class Main {
    public static void main(String[] args) {
        // Interfaces não podem ser instanciadas
        // ICarro hondaGenerico = new ICarro(ICarro.FORD); // Não funciona

        ICarro fordCombustao = new CarroCombustao(ICarro.FORD);
        fordCombustao.setLigado(true);
        fordCombustao.buzinar();

        ICarro teslaEletrico = new CarroEletrico(ICarro.TESLA);
        teslaEletrico.setLigado(true);
        teslaEletrico.buzinar();
    }
}
