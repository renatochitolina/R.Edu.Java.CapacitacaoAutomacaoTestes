package m01_1.d2_3.exemplos;

public class ComandosDecisao {
    public static void main(String[] args) {
        /*** if simples ***/
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Maior de idade.");
        }

        /*** if e else ***/
        int idade2 = 16;
        if (idade2 >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        /*** if, else ifs e else ***/
        boolean validarSemana = true;
        int dia = 3;
        String nomeDia;
        if (validarSemana && dia == 1) {
            nomeDia = "Segunda-feira";
        } else if (validarSemana && dia == 2) {
            nomeDia = "Terça-feira";
        } else if (validarSemana && dia == 3) {
            nomeDia = "Quarta-feira";
        } else if (validarSemana && dia == 4) {
            nomeDia = "Quinta-feira";
        } else if (validarSemana && dia == 5) {
            nomeDia = "Sexta-feira";
        } else if (validarSemana && dia == 6) {
            nomeDia = "Sábado";
        } else if (validarSemana && dia == 7) {
            nomeDia = "Domingo";
        } else {
            nomeDia = "Dia inválido";
        }
        System.out.println(nomeDia);

        /*** switch case ***/
        int dia2 = 5;
        String nomeDia2;
        switch (dia2) {
            case 1:
                nomeDia2 = "Segunda-feira";
                break;
            case 2:
                nomeDia2 = "Terça-feira";
                break;
            case 3:
                nomeDia2 = "Quarta-feira";
                break;
            case 4:
                nomeDia2 = "Quinta-feira";
                break;
            case 5:
                nomeDia2 = "Sexta-feira";
                break; // Exemplificar sem o break
            case 6:
                nomeDia2 = "Sábado";
                break;
            case 7:
                nomeDia2 = "Domingo";
                break;
            default:
                nomeDia2 = "Dia inválido";
                break;
        }
        System.out.println(nomeDia2);
    }
}
