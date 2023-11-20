package m01_2.d2_3.exemplos.pilares.classes_instancia_estatica;

/*
 * Essa classe tem ambas as estratégias para resolver
 * diferentes problemas, pois permite a criação de N 
 * carros, e ao mesmo tempo possui 1 estado na classe que 
 * armazena uma contagem de todas as instâncias já criadas
 */
public class Carro {
    /*
     * Independente da estratégia de instância ou estática,
     * o uso dessas constantes permanece oportuno
     */
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";
    public static final String HONDA = "Honda";

    // Atributos (características) estáticos
    public static int contagemCarros = 0;

    // Atributos (características) de instância
    public String marca = "";
    public String cor = "";
    public float motor = 0;

    public Carro() {
        // A cada novo carro criado, o contador incrementa
        contagemCarros++;
    }

    public Carro(String marca, String cor, float motor) {
        /*
         * Curiosidade: Chamando também o construtor vazio
         * encadeado (para efetuar o incremento do estado estático)
         */
        this();
        this.marca = marca;
        this.cor = cor;
        this.motor = motor;
    }

    // Métodos (comportamentos) estáticos
    public static String obterContagemCarrosCriados() {
        /*
         * Quando um atributo ou método estático é chamado internamente
         * na própria classe, ele pode ser chamado tanto direto quanto
         * através da classe (Carro.contagemCarros ou somente contagemCarros)
         */
        return "Ao todo já foram criados " + Carro.contagemCarros + " carros";
    }

    // Métodos (comportamentos) de instância
    public String obterEspecificacoes() {
        return "Este é um carro da marca " + this.marca
                + ", fabricado na cor " + this.cor
                + " e munido de um motor " + this.motor;
    }
}
