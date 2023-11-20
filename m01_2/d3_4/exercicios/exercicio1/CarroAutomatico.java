package m01_2.d3_4.exercicios.exercicio1;

public class CarroAutomatico extends Carro {
    public CarroAutomatico() {
        super();
    }

    @Override
    public void ligar() {
        if (isFreioAcionado()) {
            super.ligar();
        } else {
            System.out.println("Não é possível ligar o carro automático sem acionar o freio.");
        }
    }

    private boolean isFreioAcionado() {
        // Lógica para verificar se o freio está acionado
        return true; // Altere para a lógica real
    }
}
