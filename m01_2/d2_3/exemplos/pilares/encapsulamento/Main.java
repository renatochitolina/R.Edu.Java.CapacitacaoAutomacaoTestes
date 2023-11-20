package m01_2.d2_3.exemplos.pilares.encapsulamento;

public class Main {
    public static void main(String[] args) {
        Carro hondaBranco = new Carro(Carro.HONDA);

        /*
         * Agora não existe mais um método "ligar", porém através
         * da propriedade ligado encapsulada em Getters & Setters
         * continua tudo funcionando normalmente
         */
        hondaBranco.setLigado(true);

        // hondaBranco.setLigado(true); // Vai acusar que o carro já está ligado
        // hondaBranco.setLigado(false); // Vai desligar o carro

        if (hondaBranco.getLigado())
            System.out.println("Carro está ligado");
        else
            System.out.println("Carro NÃO está ligado");
    }
}
