package m01_2.d2_3.exemplos.pilares.classes_instancia_estatica;

/*
 * Essa classe permite a criação de N carros, cada um
 * com seu "estado" próprio
 */
public class CarroInstancia {
    /*
     * Independente da estratégia de instância ou estática,
     * o uso dessas constantes permanece oportuno
     */
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";

    // Atributos (características) de instância
    public String marca = "";
    public String cor = "";
    public float motor = 0;

    /*
     * Métodos construtores só fazem sentido quando
     * se trabalhando com estratégia de instâncias
     */
    public CarroInstancia() {

    }

    /*
     * Métodos construtores só fazem sentido quando
     * se trabalhando com estratégia de instâncias
     */
    public CarroInstancia(String marca, String cor, float motor) {
        this.marca = marca;
        this.cor = cor;
        this.motor = motor;
    }

    // Métodos (comportamentos) de instância
    public String obterEspecificacoes() {
        /*
         * O "this" também só faz sentido para quando se trabalhando com
         * estratégia de instâncias, pois na prática "this" significa que
         * está apontando para "coisas dessa instância específica"
         * (a originadora) da chamada do método
         */
        return "Este é um carro da marca " + this.marca
                + ", fabricado na cor " + this.cor
                + " e munido de um motor " + this.motor;
    }
}
