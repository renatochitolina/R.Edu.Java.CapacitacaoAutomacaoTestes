package m01_2.d1_2.exemplos.paradigmas;

public class Funcional {
    public static void main(String[] args) {
        int[] numeros1 = { 10, 50, 100 };
        int[] numeros2 = { 500, 200, 100 };

        // Imprimindo a soma de numeros1
        imprimirTextoSoma(gerarTextoSoma(executarSomaNumeros(numeros1)));

        // Imprimindo a soma de numeros2
        imprimirTextoSoma(gerarTextoSoma(executarSomaNumeros(numeros2)));
    }

    /*
     * Benefício: Reúso e não tem estado que precise ser controlado lá fora, algo
     * entra, e um resultado sai
     */
    static int executarSomaNumeros(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    /*
     * Benefício: Reúso e não tem estado que precise ser controlado lá fora, algo
     * entra, e um resultado sai
     */
    static String gerarTextoSoma(int soma) {
        return "Soma: " + soma;
    }

    /*
     * Benefício: Reúso e não tem estado que precise ser controlado lá fora, algo
     * entra, e nesse caso nada sai, só é executada uma ação final (isso também é
     * válido)
     */
    static void imprimirTextoSoma(String textoSoma) {
        System.out.println(textoSoma);
    }
}
