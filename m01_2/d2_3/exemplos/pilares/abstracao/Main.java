package m01_2.d2_3.exemplos.pilares.abstracao;

public class Main {
    public static void main(String[] args) {
        Carro hondaBranco = new Carro(Carro.HONDA);

        /*
         * Todas as complexidades da ligação desse carro hondaBranco
         * estão abstraídas dentro da classe Carro, ou seja, para o
         * mundo exterior só é necessário se "ligar" o hondaBranco,
         * e deixar que o próprio hondaBranco resolva a forma como ele
         * se liga internamente
         */
        hondaBranco.ligar();

        if (hondaBranco.ligado)
            System.out.println("Carro esta ligado");
        else
            System.out.println("Carro NAO esta ligado");
    }
}
