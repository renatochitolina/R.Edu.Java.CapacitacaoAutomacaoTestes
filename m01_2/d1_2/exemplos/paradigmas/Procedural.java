package m01_2.d1_2.exemplos.paradigmas;

public class Procedural {
    public static void main(String[] args) {
        int[] numeros1 = { 10, 50, 100 };
        int[] numeros2 = { 500, 200, 100 };

        // Imprimindo a soma de numeros1
        int soma = executarSomaNumeros(numeros1);
        imprimirTextoSoma("Soma: " + soma);

        // Imprimindo a soma de numeros2
        int soma2 = executarSomaNumeros(numeros2);
        imprimirTextoSoma("Soma: " + soma2);
    }

    /*
     * Benefício: Possibilitado o reuso
     */
    static int executarSomaNumeros(int[] numeros) {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return soma;
    }

    /*
     * Benefício: Possibilitado o reuso
     */
    static void imprimirTextoSoma(String textoSoma) {
        System.out.println(textoSoma);
    }
}
