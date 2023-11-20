/*
#################################################################################################################

2. **Ler** um tempo em segundos e converter para o equivalente distribuído em horas, minutos e segundos, 
**escrevendo** o resultado convertido. Utilizar 5 métodos estáticos, sendo:

1. **Ler** o tempo informado em segundos e retorná-los
2. Extrair e retornar as horas do tempo informado 
3. Extrair e retornar os minutos do tempo informado
4. Extrair e retornar os segundos do tempo informado
5. Receber as horas, minutos e segundos e **escrever** o resultado. Por exemplo, para 7023 segundos, escrever:
```md
7023 segundos
=
1 hora, 57 minutos e 3 segundos
```

#################################################################################################################
*/

package m01_2.d1_2.exercicios.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int tempoEmSegundos = input.nextInt();

        int horas = Horas.extrairHoras(tempoEmSegundos);
        int minutos = Minutos.extrairMinutos(tempoEmSegundos);
        int segundos = Segundos.extrairSegundos(tempoEmSegundos);

        System.out.println(tempoEmSegundos + " segundos");
        System.out
                .println("Tempo Calculado = " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
    }
}
