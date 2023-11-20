package m01_2.d3_4.exemplos.pilares.heranca.interfaces;

// Efetuando implementação do contato ICarro através do "implements"
public class CarroEletrico implements ICarro {
    /*
     * Agora estados devem voltar a ser controlados em
     * cada classe individualmente, pois uma interface
     * tem outra natureza e ela não é capaz de manter
     * estados de objetos (suporta somente declaração
     * de constantes. Ex.: nomes das marcas)
     */
    public String marca;
    public int rodas;
    private boolean ligado;

    public CarroEletrico(String marca) {
        this.marca = marca;
    }

    /*
     * Efetuando a implementação da especificação
     * exigida no contrato (interface)
     * 
     * o @Override também é usado nesse caso, para indicar
     * que este método está seguindo uma especificação
     * da interface
     */
    @Override
    public boolean getLigado() {
        return this.ligado;
    }

    /*
     * Efetuando a implementação da especificação
     * exigida no contrato (interface)
     * 
     * o @Override também é usado nesse caso, para indicar
     * que este método está seguindo uma especificação
     * da interface
     */
    @Override
    public void setLigado(boolean ligado) {
        this.ligado = ligado;

        if (ligado)
            System.out.println(this.marca + " elétrico está ligado");
        else
            System.out.println(this.marca + " elétrico está desligado");
    }

    /*
     * Mesmo que a interface já tenha um método "buzinar"
     * default, nesse caso está se decidindo "sobrescrever"
     * esse método, passando a usar o "buzinar" específico
     * da CarroEletrico quando trabalhando com objetos deste
     * tipo
     * 
     * o @Override segue sendo usado nesse caso, tanto
     * para indicar que se está seguindo a especificação,
     * quanto para indicar que está sobrescrevendo o default
     */
    @Override
    public void buzinar() {
        /*
         * Curiosidade: Chamando também o método
         * "buzinar" default da interface
         */
        ICarro.super.buzinar();

        System.out.println("Buzinou o " + this.marca);
    }
}
