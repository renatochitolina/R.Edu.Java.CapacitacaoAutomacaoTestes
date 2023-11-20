/*
#################################################################################################################

### 2. Criar um mini sistema de banco contendo uma classe `Conta`, que precisa que o seu saldo seja encapsulado 
para proteção contra modificações que possam gerar inconsistências, como por exemplo, sacar um valor maior que o 
valor atual de saldo disponível

#################################################################################################################
*/

package m01_2.d2_3.exercicios.exercicio2;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        System.out.println("Saldo atual: " + conta1.getSaldo());

        conta1.setSaldo(100);

        System.out.println("Saldo atual: " + conta1.getSaldo());

        conta1.setSaldo(0);

        System.out.println("Saldo atual: " + conta1.getSaldo());

        conta1.setSaldo(-150);

        System.out.println("Saldo atual: " + conta1.getSaldo());

        conta1.setSaldo(-80);

        System.out.println("Saldo atual: " + conta1.getSaldo());
    }
}
