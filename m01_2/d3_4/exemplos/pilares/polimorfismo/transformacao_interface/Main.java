package m01_2.d3_4.exemplos.pilares.polimorfismo.transformacao_interface;

public class Main {
    public static void main(String[] args) {
        CarroEletrico teslaEletrico = new CarroEletrico(CarroEletrico.TESLA);
        testarCarro(teslaEletrico);

        CarroCombustao hondaCombustao = new CarroCombustao(CarroEletrico.HONDA);
        testarCarro(hondaCombustao);
    }

    public static void testarCarro(ICarro carro) {
        String tipo = carro.getClass().getSimpleName();
        System.out.println("Rodas do " + tipo + ": " + carro.getRodas());

        /*
         * "Voltando" para Carro
         */
        if (carro instanceof Carro) {
            Carro carroBase = (Carro) carro;
            carroBase.buzinar();
        }

        /*
         * "Voltando" para CarroEletrico
         */
        if (carro instanceof CarroEletrico) {
            CarroEletrico teslaEletrico = (CarroEletrico) carro;
            teslaEletrico.buzinar("Péém-Péém");
        }
    }
}
