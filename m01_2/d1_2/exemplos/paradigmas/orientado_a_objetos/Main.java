package m01_2.d1_2.exemplos.paradigmas.orientado_a_objetos;

public class Main {
    public static void main(String[] args) {
        int[] numeros1 = { 10, 50, 100 };
        int[] numeros2 = { 500, 200, 100 };

        ImpressoraSomas imp = new ImpressoraSomas();

        Calculadora calc1 = new Calculadora();
        calc1.valores = numeros1;
        calc1.somar();

        Calculadora calc2 = new Calculadora();
        calc2.valores = numeros2;
        calc2.somar();

        // Imprimindo a soma de numeros1
        imp.imprimir(calc1.resultado);
        // Imprimindo a soma de numeros2
        imp.imprimir(calc2.resultado);
    }
}
