/*
#################################################################################################################

2. Criar um mini sistema que **escreve** a árvore genealógica de uma família. Para tal, é necessário o uso de uma 
classe `Pessoa`, contendo Nome, Idade, Pai e Mae. Dica: Mãe e pai também são considerados "pessoas"

#################################################################################################################
*/

package m01_2.d3_4.exercicios.exercicio2;

public class Main {
    public static void main(String[] args) {
        Familia avoPaterno = new Familia("Avô Paterno", 70, null, null);
        Familia avoPaterna = new Familia("Avó Paterna", 68, null, null);
        Familia avoMaterno = new Familia("Avô Materno", 75, null, null);
        Familia avoMaterna = new Familia("Avó Materna", 72, null, null);

        Familia pai = new Familia("Pai", 40, avoPaterno, avoMaterno);
        Familia mae = new Familia("Mãe", 38, avoPaterna, avoMaterna);

        Familia pessoa = new Familia("Filho", 15, pai, mae);

        pessoa.exibirArvoreGenealogica();
    }
}
