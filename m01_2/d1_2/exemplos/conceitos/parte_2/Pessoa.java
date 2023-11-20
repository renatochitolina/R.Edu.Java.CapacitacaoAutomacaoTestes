package m01_2.d1_2.exemplos.conceitos.parte_2;

public class Pessoa {
    String nome = "";
    boolean gostaDeBiscoito = true; // porque... obviamente... todo mundo gosta de biscoito por natureza xP

    boolean comer(Biscoito biscoito) {
        if (this.gostaDeBiscoito) {
            // comeu o biscoito
            return true;
        } else {
            // Não comeu o biscoito
            return false;
        }
    }
}
