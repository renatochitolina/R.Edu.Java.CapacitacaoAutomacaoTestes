package m01_2.d2_3.exemplos.pilares.classes_instancia_estatica;

/*
 * Essa classe permite o uso do estado de 1 carro,
 * que é definido no escopo da própria classe
 */
public class CarroEstatico {
    /*
     * Independente da estratégia de instância ou estática,
     * o uso dessas constantes permanece oportuno
     */
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";
    public static final String HONDA = "Honda";

    // Atributos (características) estáticos
    public static String marca = "";
    public static String cor = "";
    public static float motor = 0;

    /*
     * Só é chamado com o uso do "new", e como nesse caso não
     * existe nada importante em termos de instâncias, os objetos
     * gerados por essa classe vão ser inúteis
     */
    public CarroEstatico() {

    }

    /*
     * Só é chamado com o uso do "new", e como nesse caso não
     * existe nada importante em termos de instâncias, os objetos
     * gerados por essa classe vão ser inúteis
     */
    public CarroEstatico(String marca, String cor, float motor) {
        /*
         * Na prática aqui a cada nova instância, o próprio estado
         * único da classe vai ser alterado, o que não faz muito
         * sentido
         * - Construtor totalmente dispensável
         */
        CarroEstatico.marca = marca;
        CarroEstatico.cor = cor;
        this.motor = motor; // Compilador aponta que o uso do "this" é permitido, mas é "estranho"
    }

    // Métodos (comportamentos) estáticos
    public static String obterEspecificacoes() {
        return "Este é um carro da marca " + marca
                + ", fabricado na cor " + cor
                + " e munido de um motor " + motor;
    }
}
