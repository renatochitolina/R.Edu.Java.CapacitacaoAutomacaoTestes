package m01_2.d2_3.exercicios.exercicio2;

public class Conta {
    private float saldo = 0;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float montante) {
        if (montante == 0) {
            System.out.println("Operação invalida");

            return;
        }

        String operacao;
        if (montante > 0)
            operacao = "Deposito";
        else
            operacao = "Saque";

        if (operacao == "Saque" && Math.abs(montante) > this.saldo) {
            System.out.println("Saldo insuficiente (" + this.saldo + ") para um saque de " + Math.abs(montante));

            return;
        }

        this.saldo += montante;

        System.out.println(operacao + " de " + Math.abs(montante) + " realizado com sucesso!");
    }
}
