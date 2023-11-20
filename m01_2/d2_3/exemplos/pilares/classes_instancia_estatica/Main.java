package m01_2.d2_3.exemplos.pilares.classes_instancia_estatica;

public class Main {
    public static void main(String[] args) {
        /* Estratégia de instâncias */
        CarroInstancia toyotaPrata = new CarroInstancia(CarroInstancia.TOYOTA, "Prata", 2.5f);
        System.out.println(toyotaPrata.obterEspecificacoes());

        CarroInstancia fordVermelho = new CarroInstancia();
        fordVermelho.marca = CarroInstancia.FORD;
        fordVermelho.cor = "Vermelho";
        fordVermelho.motor = 5.0f;
        System.out.println(fordVermelho.obterEspecificacoes());

        /* Estratégia estática */
        /*
         * Nada aqui vai dar acusar erro, mas tudo vai ser apontado
         * como "estranho" pelo compilador
         */
        CarroEstatico kiaAzul = new CarroEstatico();
        kiaAzul.marca = CarroEstatico.KIA;
        kiaAzul.cor = "Azul";
        kiaAzul.motor = 1.6f;
        System.out.println(kiaAzul.obterEspecificacoes());

        /*
         * Declarando um segundo objeto e alterando os valores,
         * vai sobrescrever os do kiaAzul, pois a classe estática só
         * tem 1 estado
         */
        CarroEstatico hondaPreto = new CarroEstatico();
        hondaPreto.marca = CarroEstatico.HONDA;
        hondaPreto.cor = "Preto";
        hondaPreto.motor = 2.0f;
        System.out.println(hondaPreto.obterEspecificacoes());
        System.out.println(kiaAzul.obterEspecificacoes()); // Deu ruim

        // Forma correta de manipulação de estado da classe estática (uso direto)
        CarroEstatico.marca = CarroEstatico.KIA;
        CarroEstatico.cor = "Azul";
        CarroEstatico.motor = 1.6f;
        System.out.println(CarroEstatico.obterEspecificacoes());

        /* Estratégia híbrida */

        Carro fordBranco = new Carro(Carro.FORD, "Branco", 1.8f);
        System.out.println(fordBranco.obterEspecificacoes());

        Carro toyotaBranco = new Carro(Carro.TOYOTA, "Branco", 1.0f);
        System.out.println(toyotaBranco.obterEspecificacoes());

        Carro hondaBranco = new Carro(Carro.HONDA, "Branco", 2.0f);
        System.out.println(hondaBranco.obterEspecificacoes());

        System.out.println(Carro.obterContagemCarrosCriados());
    }
}
