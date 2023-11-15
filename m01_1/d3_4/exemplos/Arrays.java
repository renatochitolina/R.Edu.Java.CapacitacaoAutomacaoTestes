package m01_1.d3_4.exemplos;

public class Arrays {
    public static void main(String[] args) {
        /*** Array de 1 dimensão (Vetor) ***/
        // 1º Posições (P)
        int[] vetor = {
                /* * P0 * P1 * P2 * P3 * P4 * P5 * P6 * P7 */
                /**/ 144, 176, 269, 507, 698, 671, 866, 198
        };
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("Posicao " + posicao + ": " + vetor[posicao]);
        }

        /*** Array de 2 dimensões (Matriz) ***/
        // 1º Linhas (L) e 2º Colunas (C)
        int[][] matriz = {
                /* * * * * C0 * C1 * C2 * C3 * */
                /* L0 */ { 405, 506, 754 },
                /* L1 */ { 786, 801, 455 },
                /* L2 */ { 737, 364, 786, 999 },
                /* L3 */ { 456, 675, 884 }
        };
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.println("----Linha " + linha + "---------------------");
            System.out.println(" Col 0 | Col 1 | Col 2 | Col 3 |");
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("  " + matriz[linha][coluna] + "  |");
            }
            System.out.println();
        }

        /*
         * Também é possível acessar uma "linha" inteira da matriz (tabela), salvando
         * essa "linha" em um vetor (array de uma dimensão), permitindo
         * acesso facilitado às "colunas" dessa linha em separado. Ex.:
         */
        int[] linha0 = matriz[0]; // Vai armazenar na variável um vetor (array de 1 dimensão) = { 405, 506, 754 }
        int[] linha1 = matriz[1]; // Vai armazenar na variável um vetor (array de 1 dimensão) = { 786, 801, 455 }
        int coluna2DaLinha0 = linha0[2]; // 754
        System.out.println("coluna2DaLinha0: " + coluna2DaLinha0);
        int coluna1DaLinha1 = linha1[1]; // 801
        System.out.println("coluna1DaLinha1: " + coluna1DaLinha1);

        /*** Array de 3 dimensões ***/
        // 1º Linhas (L), 2º Colunas (C) e 3º Posições (P)
        int[][][] array3D = {
                /* * * * * * * C0 * * * * * * C1 * * * */
                /* * * * * * P0 * P1 * * * P0 * P1 * * */
                /* L0 */ { { 101, 682 }, { 675, 787 } },
                /* L1 */ { { 576, 675 }, { 786, 992 } },
                /* L2 */ { { 545, 898 }, { 709, 678 } }
        };
        for (int linha = 0; linha < array3D.length; linha++) {
            System.out.println("----Linha " + linha + "---------------------");
            System.out.println("-----Col 0-----|-----Col 1-----|");
            System.out.println(" Pos 0 | Pos 1 | Pos 0 | Pos 1 |");
            for (int coluna = 0; coluna < array3D[linha].length; coluna++) {
                for (int posicao = 0; posicao < array3D[linha][coluna].length; posicao++) {
                    System.out.print("  " + array3D[linha][coluna][posicao] + "  |");
                }
            }
            System.out.println();
        }
    }
}
