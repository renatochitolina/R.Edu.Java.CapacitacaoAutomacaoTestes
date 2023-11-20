package m01_2.d1_2.exemplos.conceitos.parte_1;

public class Main {
    public static void main(String[] args) {
        Carro toyotaPrata = new Carro(Carro.TOYOTA, "Prata", 2.5f);
        System.out.println(toyotaPrata.obterEspecificacoes());

        Carro fordVermelho = new Carro(Carro.FORD, "Vermelho", 5.0f);
        System.out.println(fordVermelho.obterEspecificacoes());

        Carro kiaAzul = new Carro();
        kiaAzul.marca = Carro.KIA;
        kiaAzul.cor = "Azul";
        kiaAzul.motor = 1.6f;
        System.out.println(kiaAzul.obterEspecificacoes());
    }
}
