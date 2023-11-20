package m01_2.d3_4.exemplos.pilares.heranca.interfaces;

// Efetuando implementação do contato ICarro através do "implements"
public class CarroCombustao implements ICarro {
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

    public CarroCombustao(String marca) {
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
            System.out.println(this.marca + " à combustão está ligado");
        else
            System.out.println(this.marca + " à combustão está desligado");
    }
}
