package m01_2.d3_4.exercicios.exercicio1;

public class MotoPartidaPedal extends Motocicleta {
    public MotoPartidaPedal() {
        super();
    }

    @Override
    public void ligar() {
        if (isAceleradorAcionado()) {
            super.ligar();
        } else {
            System.out.println("Não é possível ligar a moto com partida a pedal sem acionar o acelerador.");
        }
    }

    private boolean isAceleradorAcionado() {
        // Lógica para verificar se o acelerador está acionado
        return true; // Altere para a lógica real
    }
}
