package m01_2.d1_2.exemplos.conceitos.parte_3;

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

        // Operando o carro agora: acionando comportamentos (métodos) que dependem de
        // características (atributos)
        kiaAzul.acelerar(); // Não vai dar
        kiaAzul.frear(); // Não vai dar

        kiaAzul.ligar(); // Agora que ligou vai dar

        kiaAzul.acelerar(); // Vai dar!
        kiaAzul.frear(); // Vai dar!

        kiaAzul.desligar(); // Agora desligou, não vai dar mais

        kiaAzul.frear(); // Não vai dar mais
    }
}
