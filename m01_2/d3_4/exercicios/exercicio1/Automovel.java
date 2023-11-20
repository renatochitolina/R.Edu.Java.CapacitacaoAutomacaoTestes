package m01_2.d3_4.exercicios.exercicio1;

public class Automovel {
    private boolean ligado;
    private double velocidade;

    public void Automóvel() {
        this.ligado = false;
        this.velocidade = 0.0;
    }

    public void ligar() {
        ligado = true;
        System.out.println("o Automóvel está ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println("o Automóvel esta desligado");
    }

    public void acelerar(double valor) {
        if (ligado) {
            velocidade += valor;
            System.out.println("Acelerando para " + velocidade + "Km/h");
        } else {
            System.out.println("Não é possivel acelerar, o automóvel esta desligado");
        }
    }

    public void frear(double valor) {
        if (ligado) {
            velocidade -= valor;
            System.out.println("Freando para " + velocidade + "Km/h");
        } else {
            System.out.println("Não é possovel frear, o automóvel esta desligado");
        }
    }
}
