package m01_2.d1_2.exemplos.conceitos.parte_3;

public class Carro {
    // Voltar ao assunto das constantes, agora apresentando um uso prático de
    // constantes estáticas
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";

    // Explicar sobre atributos (características)
    public String marca = "";
    public String cor = "";
    public float motor = 0;
    private boolean ligado = false;

    // Explicar um pouco sobre construtores (e quando "explicitar" o vazio)
    public Carro() {

    }

    // Explicar um pouco sobre construtores
    public Carro(String marca, String cor, float motor) {
        this.marca = marca;
        this.cor = cor;
        this.motor = motor;
    }

    // Explicar sobre métodos (comportamentos)
    public String obterEspecificacoes() {
        return "Este é um carro da marca " + this.marca
                + ", fabricado na cor " + this.cor
                + " e munido de um motor " + this.motor;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void acelerar() {
        if (!this.ligado) {
            System.out.println("Não foi possível acelerar, o "
                    + this.marca + " não está ligado.");

            return;
        }

        System.out.println(this.marca + " acelerando...");
    }

    public void frear() {
        if (!this.ligado) {
            System.out.println("A frenagem não surtiu efeito, pois o "
                    + this.marca + " não está andando (está desligado).");

            return;
        }

        System.out.println(this.marca + " freando...");
    }
}
