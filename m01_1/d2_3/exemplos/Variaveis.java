package m01_1.d2_3.exemplos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * Diferentes tipos de variáveis
 * short, int, long         - primitivas
 * float, double            - primitivas 
 * BigDecimal               - objeto (referência)
 * boolean                  - primitiva
 * char                     - primitiva
 * String                   - objeto (referência)
 * LocalDate, LocalDateTime - objeto (referência) 
 */
public class Variaveis {
    public static void main(String[] args) {
        /*** Grupo dos inteiros ***/
        // short iPequena = -32769;
        // short iPequena = 32768;
        short iPequena = 300;
        System.out.println("iPequena: " + iPequena);

        int iMedia = 3000000; // 3 milhões
        System.out.println("iMedia: " + iMedia);

        long iGrande = 300000000; // 300 milhões
        System.out.println("iGrande: " + iGrande);

        /*** Grupo dos reais ***/
        // float rPequena = 5.555555f;
        float rPequena = (float) 5.555555;
        System.out.println("rPequena: " + rPequena);

        double rMedia = 5.555555555555555;
        System.out.println("rMedia: " + rMedia);

        BigDecimal rgrande = new BigDecimal("5.5555555555555555555555555");
        System.out.println("rgrande: " + rgrande);

        /*** Grupo dos lógicos ***/
        boolean logica = true;
        logica = false;
        System.out.println("logica: " + logica);

        /*** Grupo dos textos ***/
        char caractere = 'H';
        System.out.println("caractere: " + caractere);

        String texto = "Hello world";
        System.out.println("texto: " + texto);

        /*** Grupo das datas ***/
        LocalDate dataAgora = LocalDate.now();
        System.out.println("dataAgora: " + dataAgora);

        LocalDate data = LocalDate.of(2023, 11, 1);
        System.out.println("data: " + data);

        LocalDateTime dataHoraAgora = LocalDateTime.now();
        System.out.println("dataHoraAgora: " + dataHoraAgora);

        LocalDateTime dataHora = LocalDateTime.of(2023, 11, 1, 18, 58, 59);
        System.out.println("dataHora: " + dataHora);
    }
}
