package m01_1.d2_3.exemplos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * Quaisquer tipos de variáveis podem se tornar
 * constantes, aqui é mais interessante na
 * verdade atentar-se aos escopos (constantes
 * locais vs constantes globais - spoiler sobre
 * classes, atributos e métodos)
 */
public class Constantes {
    // Extra: "static" no escopo de atributos da classe
    static final short iPequena = 300;

    public static void main(String[] args) {
        /*** Grupo dos inteiros ***/
        final short iPequena = 300;
        System.out.println("iPequena: " + iPequena);

        final int iMedia = 3000000; // 3 milhões
        System.out.println("iMedia: " + iMedia);

        final long iGrande = 300000000; // 300 milhões
        System.out.println("iGrande: " + iGrande);

        /*** Grupo dos reais ***/
        final float rPequena = (float) 5.555555;
        System.out.println("rPequena: " + rPequena);

        final double rMedia = 5.555555555555555;
        System.out.println("rMedia: " + rMedia);

        final BigDecimal rgrande = new BigDecimal("5.5555555555555555555555555");
        System.out.println("rgrande: " + rgrande);

        /*** Grupo dos lógicos ***/
        final boolean logica = true;
        // logica = false;
        System.out.println("logica: " + logica);

        /*** Grupo dos textos ***/
        final char caractere = 'H';
        System.out.println("caractere: " + caractere);

        final String texto = "Hello world";
        System.out.println("texto: " + texto);

        /*** Grupo das datas ***/
        final LocalDate dataAgora = LocalDate.now();
        System.out.println("dataAgora: " + dataAgora);

        final LocalDate data = LocalDate.of(2023, 11, 1);
        System.out.println("data: " + data);

        final LocalDateTime dataHoraAgora = LocalDateTime.now();
        System.out.println("dataHoraAgora: " + dataHoraAgora);

        final LocalDateTime dataHora = LocalDateTime.of(2023, 11, 1, 18, 58, 59);
        System.out.println("dataHora: " + dataHora);
    }
}
