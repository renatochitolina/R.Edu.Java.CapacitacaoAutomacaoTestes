package m01_2.d3_4.exemplos.pilares.polimorfismo.transformacao_heranca;

public class Main {
    public static void main(String[] args) {
        CarroEletrico teslaEletrico = new CarroEletrico(CarroEletrico.TESLA);
        teslaEletrico.buzinar("Fóón-fóón");
        testarCarro(teslaEletrico); // Cast implícito (assunto futuro)

        CarroCombustao hondaCombustao = new CarroCombustao(CarroEletrico.HONDA);
        hondaCombustao.buzinar("Biii-biii");
        testarCarro(hondaCombustao); // Cast implícito (assunto futuro)
    }

    public static void testarCarro(Carro carro) {
        /*
         * Curiosidade: Truque para pegar o nome da classe original
         */
        String tipo = carro.getClass().getSimpleName();
        carro.buzinar();
        System.out.println("Rodas do " + tipo + ": " + carro.getRodas());

        /*
         * Caso queira voltar para a versão original
         */
        if (carro instanceof CarroEletrico) {
            CarroEletrico teslaEletrico = (CarroEletrico) carro; // Cast explícito (assunto futuro)
            teslaEletrico.buzinar("Péém-Péém");
        }
    }
}
