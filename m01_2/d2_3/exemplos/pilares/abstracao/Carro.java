package m01_2.d2_3.exemplos.pilares.abstracao;

/*
 * (-) private - Escondidos (abstraídos) do mundo exterior
 * (+) public - Expostos ao mundo exterior
 */
public class Carro {
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";
    public static final String HONDA = "Honda";

    /* Atributos (características) */
    /* (+) */ public String marca;
    /* (+) */ public boolean ligado;
    /* (-) */ private boolean sistemaEletricoPronto;
    /* (-) */ private boolean sistemaArPronto;
    /* (-) */ private boolean sistemaFrenagemPronto;

    /* Métodos construtores */
    /* (+) */ public Carro(String marca) {
        this.marca = marca;
    }

    /* Métodos (comportamentos) */
    /* (+) */ public void ligar() {
        this.ligado = acionarMotorACombustao();

        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagemPronto = this.ligado;
    }

    /* (+) */ public void desligar() {
        this.ligado = false;

        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagemPronto = this.ligado;
    }

    /* (-) */ private boolean acionarMotorACombustao() {
        /*
         * Executa as complexidades de acionamento do
         * motor à combustão de 4 tempos
         */

        if (this.executarTempo1() == false)
            return false;

        if (this.executarTempo2() != true)
            return false;

        if (!this.executarTempo3())
            return false;

        if (!this.executarTempo4())
            return false;

        return true;
    }

    /* (-) */ private boolean executarTempo1() {
        // Executa as complexidades de:
        return true; // Mistura de ar e combustível
    }

    /* (-) */ private boolean executarTempo2() {
        // Executa as complexidades de:
        return true; // Geração de pressão
    }

    /* (-) */ private boolean executarTempo3() {
        // Executa as complexidades de:
        return true; // Geração de combustão
    }

    /* (-) */ private boolean executarTempo4() {
        // Executa as complexidades de:
        return true; // Liberação de gases
    }
}
