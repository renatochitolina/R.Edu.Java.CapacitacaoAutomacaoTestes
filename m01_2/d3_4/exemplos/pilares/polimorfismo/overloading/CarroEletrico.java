package m01_2.d3_4.exemplos.pilares.polimorfismo.overloading;

/*
 * Nota: Overloading é o único aspecto do polimorfismo que
 * não depende necessariamente de extensão (herança de classes)
 * ou implementação de interfaces, pois pode-se também fazer 
 * overloading de métodos em uma única classe isolada
 */
public class CarroEletrico extends Carro {
    private static final int PADRAO_RODAS = 5;

    // Overload 1 do construtor: Recebendo apenas marca
    public CarroEletrico(String marca) {
        /*
         * Curiosidade: Encadeando chamada ao 2º construtor,
         * para reaproveitar a estrutura onde já se
         * atribuem valores a ambos os atributos através
         * da chamada encadeada ao construtor da classe mãe
         */
        this(marca, PADRAO_RODAS);
    }

    // Overload 2 do construtor: Recebendo marca e rodas
    public CarroEletrico(String marca, int rodas) {
        /*
         * Curiosidade: Encadeando chamada ao único
         * construtor possível da classe mãe
         */
        super(marca, rodas);
    }

    /*
     * Overload 2 do método buzinar a partir da classe filha.
     * Este se comporta um pouco diferente pois ele tem
     * condições diferentes (recebe o barulho da buzina por
     * parâmetro)
     */
    public void buzinar(String somBuzina) {
        System.out.println("Buzinou o " + this.marca + " através da CarroEletrico: \"" + somBuzina + "\"");
    }
}
