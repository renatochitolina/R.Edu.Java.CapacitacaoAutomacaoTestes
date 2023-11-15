package m01_1.d3_4.exemplos;

import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        /*** Math.random() simples ***/
        // Math.random() produz um double entre:
        // 0.0... (incluindo)
        // 1.0... (excluindo - vai até "antes" do número, mas nunca o vai considerar)
        double numeroAleatorioSimples = Math.random();
        System.out.println(numeroAleatorioSimples);

        /*** Math.random() com "upper bound" ***/
        /*
         * Problemático por causa da exclusão do 1.0
         * Isso precisa ser corrigido no bound incluindo + 1
         */
        // double numeroAleatorioBrutoAte10 = Math.random() * 10;
        while (true) {
            double numeroAleatorioBrutoAte100 = Math.random() * 100 + 1;
            int numeroAleatorioAte100 = (int) numeroAleatorioBrutoAte100;
            System.out.println(numeroAleatorioAte100);

            if (numeroAleatorioAte100 == 100)
                break;
        }

        /*** Math.random() com "lower bound" e "upper bound" ***/
        while (true) {
            // double numeroAleatorioBrutoEntre10e100 = Math.random() * ((10 - 5) + 1) + 5;
            int limiteInferior = 10;
            int limiteSuperior = 100;
            double numeroAleatorioBrutoEntre10e100 = Math.random() * ((limiteSuperior - limiteInferior) + 1)
                    + limiteInferior;
            int numeroAleatorioEntre10e100 = (int) numeroAleatorioBrutoEntre10e100;
            System.out.println(numeroAleatorioEntre10e100);

            if (numeroAleatorioEntre10e100 <= 10)
                break;
        }

        /*** Classe Random com "upper bound" ***/
        Random sorteador = new Random();
        while (true) {
            int numeroAleatorioEntre0e1000 = sorteador.nextInt(1000 + 1);
            boolean aleatorioBoolean = sorteador.nextBoolean();
            System.out.println(numeroAleatorioEntre0e1000 + " - " + aleatorioBoolean);

            if (numeroAleatorioEntre0e1000 == 1000)
                break;
        }

        /*** Classe Random com "lower bound" e "upper bound" ***/
        while (true) {
            int limiteInferior = 501;
            int limiteSuperior = 1000;
            /*
             * Somente a partir do Java 17
             * int numeroAleatorioEntre501e1000 =
             * * * sorteador.nextInt(limiteInferior, limiteSuperior + 1);
             */
            int numeroAleatorioEntre501e1000 = sorteador.nextInt((limiteSuperior - limiteInferior) + 1)
                    + limiteInferior;
            boolean aleatorioBoolean = sorteador.nextBoolean();
            System.out.println(numeroAleatorioEntre501e1000 + " - " + aleatorioBoolean);

            if (numeroAleatorioEntre501e1000 == 1000)
                break;
        }

        /*** Algoritmo de geração de nomes com classe Random ***/
        while (true) {
            String[] nomes = { "Marta", "Afonso", "Jean", "Michele" };
            String[] sobrenomes = { "Oliveira", "Mendes", "Rodrigues", "Martins" };
            int nomePosicao = sorteador.nextInt(4);
            int sobrenomePosicao = sorteador.nextInt(4);
            String nomeCompleto = nomes[nomePosicao] + " " + sobrenomes[sobrenomePosicao];
            System.out.println(nomeCompleto);

            if (nomeCompleto.equals("Marta Martins"))
                break;
        }
    }
}
