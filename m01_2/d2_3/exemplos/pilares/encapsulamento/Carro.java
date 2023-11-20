package m01_2.d2_3.exemplos.pilares.encapsulamento;

/*
 * (-) private - Escondidos (abstraídos) do mundo exterior
 * (+) public - Expostos ao mundo exterior
 */
public class Carro {
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";
    public static final String HONDA = "Honda";

    /* Atributos e Propriedades (características) */
    public String marca;
    // Escondendo o atributo "ligado", pois ele vai ser
    // encapsulado e virar uma propriedade acessível
    // através de Get & Set
    /* (-) */ private boolean ligado;
    private boolean sistemaEletricoPronto;
    private boolean sistemaArPronto;
    private boolean sistemaFrenagemPronto;

    /* Métodos construtores */
    public Carro(String marca) {
        this.marca = marca;
    }

    /* Métodos (comportamentos) */

    // public void ligar() {
    // this.ligado = acionarMotorACombustao();
    // this.sistemaEletricoPronto = this.ligado;
    // this.sistemaArPronto = this.ligado;
    // this.sistemaFrenagemPronto = this.ligado;
    // }

    // public void desligar() {
    // this.ligado = false;
    // }

    /*
     * Os métodos "ligar" e "desligar" comentados
     * acima, agora vão ser substituídos pelo
     * encapsulamento do atributo ligado.
     * As duas opções são pertinentes, depende
     * da melhor escolha para o contexto
     */
    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        // Validação: Proteção contra tentativa de ligar com o
        // carro já ligado, ou desligar com o carro já desligado
        if (ligado == this.ligado) {
            if (ligado) { // Verificação implícita de true
                System.out.println("O " + this.marca + " já está ligado!");
            } else {
                System.out.println("O " + this.marca + " já está desligado!");
            }

            return;
        }

        // Rotina de desligamento
        // - Para melhor organização, poderia estar em um método private separado
        if (!ligado) { // Verificação implícita de NOT true
            this.ligado = false;

            this.sistemaEletricoPronto = this.ligado;
            this.sistemaArPronto = this.ligado;
            this.sistemaFrenagemPronto = this.ligado;

            return;
        }

        // Rotina de ligação
        // - Para melhor organização, poderia estar em um método private separado
        this.ligado = acionarMotorACombustao();

        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagemPronto = this.ligado;
    }

    private boolean acionarMotorACombustao() {
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

    private boolean executarTempo1() {
        return true; // Mistura de ar e combustível
    }

    private boolean executarTempo2() {
        return true; // Geração de pressão
    }

    private boolean executarTempo3() {
        return true; // Geração de combustão
    }

    private boolean executarTempo4() {
        return true; // Liberação de gases
    }
}
