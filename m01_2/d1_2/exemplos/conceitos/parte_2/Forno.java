package m01_2.d1_2.exemplos.conceitos.parte_2;

public class Forno {
    public static final String METAL = "Metal";
    public static final String BARRO = "Barro";

    /* Características */
    String tipo = METAL;
    boolean ligado = false;
    double temperatura = 0;

    /* Comportamentos */
    void ligar(Pessoa cozinheiro, double temperatura) {
        this.temperatura = temperatura;
        this.ligado = true;

        System.out.println(cozinheiro.nome + " ligou o forno para " + this.temperatura + " graus!");
    }

    void assar(Biscoito item) {
        // ...Assando
        // ...Assando
        // ...Assando
        // ...Assando
        // ...Assando
        item.pronto = true;
    }
}
