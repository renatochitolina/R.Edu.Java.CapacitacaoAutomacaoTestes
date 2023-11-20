package m01_2.d1_2.exemplos.conceitos.parte_2;

public class Main {
    public static void main(String[] args) {
        // Instancia uma nova pessoa (um novo objeto da classe Pessoa)
        Pessoa flavia = new Pessoa();
        flavia.nome = "Flávia";
        flavia.gostaDeBiscoito = true;

        // Instancia mais uma pessoa (outro novo objeto da classe Pessoa)
        Pessoa alan = new Pessoa();
        alan.nome = "Alan";
        alan.gostaDeBiscoito = false;

        // Vamos preparar um forno pra assar esses biscoitos
        Forno fornoCasa = new Forno();
        fornoCasa.tipo = Forno.BARRO;
        fornoCasa.ligar(alan, 200);
        System.out.println("Forno da casa tá ligado mesmo? " + fornoCasa.ligado);

        /* Vamos preparar os biscoitos */
        // Instancia (prepara) um novo objeto (biscoito)
        Biscoito biscoitoDeNatal = new Biscoito();
        biscoitoDeNatal.forma = Biscoito.CIRCULAR;
        biscoitoDeNatal.ingredientes[0] = "Farinha de trigo";
        biscoitoDeNatal.ingredientes[1] = "Leite";
        biscoitoDeNatal.ingredientes[2] = "Açúcar";
        biscoitoDeNatal.ingredientes[3] = "Granulado colorido";
        System.out.println("Biscoito de natal pronto? " + biscoitoDeNatal.pronto);
        fornoCasa.assar(biscoitoDeNatal);
        System.out.println("Biscoito de natal pronto? " + biscoitoDeNatal.pronto);

        // Instancia (prepara) um novo objeto (biscoito)
        Biscoito amanteigado = new Biscoito();
        amanteigado.forma = Biscoito.QUADRADO;
        amanteigado.ingredientes[0] = "Farinha de trigo";
        amanteigado.ingredientes[1] = "Leite";
        amanteigado.ingredientes[2] = "Açúcar";
        amanteigado.ingredientes[3] = "Manteiga";
        System.out.println("Amanteigado pronto? " + amanteigado.pronto);
        fornoCasa.assar(amanteigado);
        System.out.println("Amanteigado pronto? " + amanteigado.pronto);

        // A flávia vai comer (comportamento) o biscoito porque ela gosta de biscoitos
        // (característica)
        boolean flaviaComeu = flavia.comer(amanteigado);
        if (flaviaComeu == true) {
            System.out.println(flavia.nome + " comeu o amanteigado");
        } else {
            System.out.println(flavia.nome + " NÃO comeu o amanteigado");
        }

        // O Alan NÃO vai comer (comportamento) o biscoito porque ele NÃO gosta de
        // biscoitos (característica)
        boolean AlanComeu = alan.comer(biscoitoDeNatal);
        if (AlanComeu == true) {
            System.out.println(alan.nome + " comeu o biscoito de natal");
        } else {
            System.out.println(alan.nome + " NÃO comeu o biscoito de natal");
        }
    }
}
