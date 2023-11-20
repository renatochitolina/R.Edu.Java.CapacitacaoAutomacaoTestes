package m01_2.d3_4.exemplos.pilares.heranca.heranca_concreta;

// Efetuando herança através do "extends"
public class CarroCombustao extends Carro {

    public CarroCombustao(String marca) {
        /*
         * Curiosidade: Chamando o construtor da classe
         * mãe (Carro), passando para ele a marca
         */
        super(marca);
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;

        if (ligado)
            System.out.println(this.marca + " à combustão está ligado");
        else
            System.out.println(this.marca + " à combustão está desligado");
    }
}
