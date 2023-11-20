package m01_2.d1_2.exemplos.paradigmas.orientado_a_objetos;

public class ImpressoraSomas {
    /*
     * Benefício: A impressora tem sua responsabilidade, imprimir, e se um dia a
     * forma de impressão mudar, automaticamente todo mundo que chama o método
     * imprimir vai ter essa "atualização" automaticamente, e de graça
     */
    public void imprimir(int soma) {
        System.out.println("Soma: " + soma);
    }
}
