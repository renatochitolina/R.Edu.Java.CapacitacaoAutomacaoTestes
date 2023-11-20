package m01_2.d3_4.exercicios.exercicio3;

public class AgendaTelefonica {
    private String[] contatos;
    private int totalContatos;

    public AgendaTelefonica(int capacidade) {
        contatos = new String[capacidade];
        totalContatos = 0;
    }

    public void adicionarContato(String numero) {
        if (totalContatos < contatos.length) {
            contatos[totalContatos] = numero;
            totalContatos++;
            System.out.println("Contato adicionado com sucesso!");
        } else {
            System.out.println("A agenda está cheia. Não é possível adicionar mais contatos.");
        }
    }

    public void deletarContato(String numero) {
        int index = -1;
        for (int i = 0; i < totalContatos; i++) {
            if (contatos[i] != null && contatos[i].equals(numero)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            contatos[index] = null;
            for (int i = index; i < totalContatos - 1; i++) {
                contatos[i] = contatos[i + 1];
            }
            contatos[totalContatos - 1] = null;
            totalContatos--;
            System.out.println("Contato deletado com sucesso!");
        } else {
            System.out.println("Contato não encontrado na agenda.");
        }
    }

    public void listarContatos() {
        System.out.println("Contatos na agenda:");
        for (int i = 0; i < totalContatos; i++) {
            System.out.println((i + 1) + ". " + contatos[i]);
        }
    }
}
