package m01_2.d1_2.exercicios.exercicio1;

public class ParecerAluno {
    public String obterParecer(double media) {

        if (media < 4) {
            return "Reprovado";
        } else if (media >= 4 && media < 6) {
            return "Verificação Suplementar";
        } else {
            return "Aprovado";
        }
    }
}
