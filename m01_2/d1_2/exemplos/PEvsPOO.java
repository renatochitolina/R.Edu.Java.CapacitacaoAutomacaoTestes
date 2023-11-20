package m01_2.d1_2.exemplos;

/* 
 * Aqui a ideia é pegar o código da parte 3 de conceitos, e "refatorá-lo" para uma 
 * versão estruturada, para demonstrar as diferenças daquele código orientado a objetos 
 * para uma versão altamente estruturada
 */
public class PEvsPOO {
    public static final String TOYOTA = "Toyota";
    public static final String FORD = "Ford";
    public static final String KIA = "Kia";

    /*
     * Usando uma "nested static class", que na prática é uma
     * subclasse da classe principal, marcada como estática
     * para que não haja um relacionamento direto de referência
     * à classe principal. Essa é talvez a forma mais aproximada
     * que se tem para se simular algo parecido com uma struct
     */
    /* Pseudo-struct */ static class Carro {
        public String marca;
        public String cor;
        public float motor;
        public boolean ligado;

        public Carro(String marca, String cor, float motor, boolean ligado) {
            this.marca = marca;
            this.cor = cor;
            this.motor = motor;
            this.ligado = ligado;
        }
    }

    public static void main(String[] args) {
        Carro toyotaPrata = new Carro(TOYOTA, "Prata", 2.5f, false);
        System.out.println("Este é um carro da marca " + toyotaPrata.marca
                + ", fabricado na cor " + toyotaPrata.cor
                + " e munido de um motor " + toyotaPrata.motor);

        Carro fordVermelho = new Carro(FORD, "Vermelho", 5.0f, false);
        System.out.println("Este é um carro da marca " + fordVermelho.marca
                + ", fabricado na cor " + fordVermelho.cor
                + " e munido de um motor " + fordVermelho.motor);

        Carro kiaAzul = new Carro(KIA, "Azul", 1.6f, false);
        System.out.println("Este é um carro da marca " + kiaAzul.marca
                + ", fabricado na cor " + kiaAzul.cor
                + " e munido de um motor " + kiaAzul.motor);

        // kiaAzul.acelerar();
        if (!kiaAzul.ligado) {
            System.out.println("Não foi possível acelerar, o "
                    + kiaAzul.marca + " não está ligado.");
        } else {
            System.out.println(kiaAzul.marca + " acelerando...");
        }

        // kiaAzul.frear();
        if (!kiaAzul.ligado) {
            System.out.println("A frenagem não surtiu efeito, pois o "
                    + kiaAzul.marca + " não está andando (está desligado).");
        } else {
            System.out.println(kiaAzul.marca + " freando...");
        }

        // kiaAzul.ligar();
        kiaAzul.ligado = true;

        // kiaAzul.acelerar();
        if (!kiaAzul.ligado) {
            System.out.println("Não foi possível acelerar, o "
                    + kiaAzul.marca + " não está ligado.");
        } else {
            System.out.println(kiaAzul.marca + " acelerando...");
        }

        // kiaAzul.frear();
        if (!kiaAzul.ligado) {
            System.out.println("A frenagem não surtiu efeito, pois o "
                    + kiaAzul.marca + " não está andando (está desligado).");
        } else {
            System.out.println(kiaAzul.marca + " freando...");
        }

        // kiaAzul.desligar();
        kiaAzul.ligado = false;

        // kiaAzul.frear();
        if (!kiaAzul.ligado) {
            System.out.println("A frenagem não surtiu efeito, pois o "
                    + kiaAzul.marca + " não está andando (está desligado).");
        } else {
            System.out.println(kiaAzul.marca + " freando...");
        }
    }
}
