package m01_2.d3_4.exemplos.pilares.heranca.heranca_concreta;

public class Main {
    public static void main(String[] args) {
        /*
         * Como foi usada uma classe "concreta" como classe mãe, está
         * sendo permitida a instância de um novo objeto a partir dessa
         * classe, o que nesse contexto acaba não fazendo muito sentido
         * pois "Carro" não vai saber como "se ligar"
         */
        Carro hondaGenerico = new Carro(Carro.FORD);

        CarroCombustao fordCombustao = new CarroCombustao(CarroCombustao.FORD);
        fordCombustao.setLigado(true);
        fordCombustao.buzinar();

        CarroEletrico teslaEletrico = new CarroEletrico(CarroEletrico.TESLA);
        teslaEletrico.setLigado(true);
        teslaEletrico.buzinar();
    }
}
