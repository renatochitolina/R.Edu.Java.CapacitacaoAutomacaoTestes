package m01_1.d3_4.exemplos;

public class ComandosRepeticao {
    public static void main(String[] args) {
        /*** while ***/
        int contadorWhile = 1;
        while (contadorWhile <= 10) { // Explicar o que é um loop / iteração
            System.out.println("contadorWhile: " + contadorWhile++);
            // contador++;
        }

        boolean condicaoWhile = true;
        while (condicaoWhile) {
            System.out.println("\"Iterando\" no while");
            // condicao = false;
            // continue; // Ir para a próxima iteração
            condicaoWhile = true;
            break; // Interromper a estrutura de repetição
        }

        // while (true) {
        // * * System.out.println("Infinito");
        // }

        /*** do-while ***/
        /*
         * Convertendo este while em do-while
         * int contadorWhile = 11;
         * while (contadorWhile <= 10) {
         * * * System.out.println("contadorWhile: " + contadorWhile);
         * * * contadorWhile++;
         * }
         */
        int contadorDoWhile = 11;
        do {
            System.out.println("contadorDoWhile: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile <= 10);

        // do {
        // * * System.out.println("Infinito");
        // } while (true);

        /*** for ***/
        /* * Inicialização * * | Condição * * | * * Pós iteração * */
        // for (int contadorFor = 1; contadorFor <= 10; contadorFor = contadorFor + 1) {
        // for (int contadorFor = 1; contadorFor <= 10; contadorFor += 1) {
        for (int contadorFor = 1; contadorFor <= 10; contadorFor++) {
            System.out.println("contadorFor: " + contadorFor);
        }

        // for (;;) {
        // * * System.out.println("Infinito");
        // }

        int contadorFor2 = 1;
        for (; contadorFor2 <= 10;) {
            System.out.println("contadorFor2: " + contadorFor2++);
        }
    }
}
