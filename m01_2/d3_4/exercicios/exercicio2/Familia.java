package m01_2.d3_4.exercicios.exercicio2;

public class Familia {
    private String nome;
    private int idade;
    private Familia pai;
    private Familia mae;

    public Familia(String nome, int idade, Familia pai, Familia mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Familia getPai() {
        return pai;
    }

    public Familia getMae() {
        return mae;
    }

    public void exibirArvoreGenealogica() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
        if (pai != null) {
            System.out.println("Pai: " + pai.getNome());
            pai.exibirArvoreGenealogica();
        }
        if (mae != null) {
            System.out.println("Mãe: " + mae.getNome());
            mae.exibirArvoreGenealogica();
        }
    }
}
