package m01_2.d1_2.exemplos.paradigmas;

public class Estruturado {
    public static void main(String[] args) {
        int[] numeros1 = { 10, 50, 100 };
        int[] numeros2 = { 500, 200, 100 };

        // Imprimindo a soma de numeros1
        int soma = 0;
        for (int i = 0; i < numeros1.length; i++) {
            soma += numeros1[i];
        }
        System.out.println("Soma: " + soma);

        /*
         * E se precisasse agora imprimir a soma de numeros2?
         */
        int soma2 = 0;
        for (int i = 0; i < numeros2.length; i++) {
            soma2 += numeros2[i];
        }
        System.out.println("Soma: " + soma2);
    }
}
