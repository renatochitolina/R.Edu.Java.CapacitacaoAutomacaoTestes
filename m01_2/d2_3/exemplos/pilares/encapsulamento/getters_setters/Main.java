package m01_2.d2_3.exemplos.pilares.encapsulamento.getters_setters;

public class Main {
    public static void main(String[] args) {
        Carro hondaBranco = new Carro(Carro.HONDA, "Branco");

        hondaBranco.setCor("Prata");

        hondaBranco.setLigado(true);

        System.out.println(
                hondaBranco.getMarca()
                        + " agora é " + hondaBranco.getCor()
                        + " e está " + hondaBranco.getStatus());
    }
}
