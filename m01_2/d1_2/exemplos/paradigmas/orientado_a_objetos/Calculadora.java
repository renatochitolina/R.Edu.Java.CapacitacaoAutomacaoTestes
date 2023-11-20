package m01_2.d1_2.exemplos.paradigmas.orientado_a_objetos;

public class Calculadora {
    public int[] valores;
    public int resultado;

    /*
     * Benefício: A calculadora tem sua responsabilidade, somar, e ela também
     * armazena em sua "memória" (em seu estado) os valores que compuseram a soma, e
     * o resultado final. Assim, várias calculadoras podem ser criadas com vários
     * valores e resultados diferentes, e cada uma vai se manter sem interferir na
     * outra
     */
    public void somar() {
        for (int i = 0; i < valores.length; i++) {
            this.resultado += this.valores[i];
        }
    }
}
