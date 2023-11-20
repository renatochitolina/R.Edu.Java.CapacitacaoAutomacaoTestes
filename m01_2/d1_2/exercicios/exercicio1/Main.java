/*
#################################################################################################################

1. Criar um método que receba 3 notas de um aluno e que calcule e retorne a média simples dessas notas. Criar 
também um método que receba uma média calculada e **escreva** um parecer do aluno baseado nas *regras de negócio* 
descritas a seguir. Fazer a interação entre os dois métodos dentro do método `main`. Regras de negócio:
- Média *abaixo* de 4 - Reprovado
- Média *entre* 4 e 6 - Verificação Suplementar
- Média *acima* de 6 - Aprovado

> Resolver através do uso de métodos estáticos na classe Main

#################################################################################################################
*/

package m01_2.d1_2.exercicios.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as três notas do aluno:");
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();

        Aluno aluno = new Aluno(nota1, nota2, nota3);

        CalculaMedia calculadora = new CalculaMedia();
        double media = calculadora.calcularMedia(aluno);
        System.out.println("Média do aluno: " + media);

        ParecerAluno parecerAluno = new ParecerAluno();
        String parecer = parecerAluno.obterParecer(media);
        System.out.println("Parecer: " + parecer);
    }
}
