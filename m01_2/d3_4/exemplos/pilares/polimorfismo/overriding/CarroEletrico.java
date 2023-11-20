package m01_2.d3_4.exemplos.pilares.polimorfismo.overriding;

/*
 * Nota: Overriding é dependente de extensão por herança (
 * concreta ou abstrata) ou implementação de interfaes
 */
public class CarroEletrico extends Carro {
    private static final int PADRAO_RODAS = 5;

    public CarroEletrico(String marca) {
        this(marca, PADRAO_RODAS);
    }

    public CarroEletrico(String marca, int rodas) {
        super(marca, rodas);
    }

    /*
     * Overriding do método buzinar a partir da classe filha.
     * Este vai se comportar diferente, e vai anular a existência
     * do seu par na classe mãe. Porém, o método da classe mãe vai
     * seguir send chamando através de encadeamento
     * 
     * Overriding só funciona com métodos de mesma assinatura
     */
    @Override
    public void buzinar() {
        /*
         * Curiosidade: Encadeando uma chamada para o "buzinar"
         * da classe mãe
         */
        super.buzinar();
        System.out.println("Buzinou o " + this.marca + " através da CarroEletrico: Biii-biii");
    }
}
