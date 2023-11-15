package m01_1.d2_3.exemplos;

public class Operadores {
    public static void main(String[] args) {
        /*** Operadores de atribuição ***/
        int numeroAtr1 = 2;
        System.out.println("numeroAtr1: " + numeroAtr1);

        int numeroAtr2;
        numeroAtr2 = numeroAtr1;
        System.out.println("numeroAtr2: " + numeroAtr2);

        numeroAtr1 = 0;
        System.out.println("numeroAtr1: " + numeroAtr1);
        System.out.println("numeroAtr2: " + numeroAtr2); // depois de alterar o 1, mudou o 2 também?

        /*** Operadores aritméticos ***/
        // Soma
        int soma = 5 + 5;
        System.out.println("soma: " + soma);

        int soma2 = soma + 10;
        System.out.println("soma2: " + soma2);
        System.out.println("soma + soma2: " + soma + soma2);

        // Soma - Função extra
        String primeiroNome = "João";
        String segundoNome = "Silva";
        String nome = primeiroNome + " " + segundoNome;
        System.out.println("nome: " + nome);

        System.out.println("nome: " + "João" + " " + "Silva");

        // Subtração
        int sub = 10 - 5;
        System.out.println("sub: " + sub);

        int sub2 = sub - 2;
        System.out.println("sub2: " + sub2);
        System.out.println("sub - sub2: " + (sub - sub2)); // Testar sem o parêntese pra mostrar o problema

        // Multiplicação
        int mult = 3 * 3;
        System.out.println("mult: " + mult);

        int mult2 = 3 * mult;
        System.out.println("mult2: " + mult2);

        // Divisão
        double div = 10.0 / 5;
        System.out.println("div: " + div);

        double div2 = 10.0 / 3;
        System.out.println("div2: " + div2);

        // Módulo
        double mod = 10.0 % 3;
        System.out.println("mod: " + mod);

        /*** Operadores de incremento / decremento ***/
        int contador = 0;
        System.out.println("contador: " + contador);
        // contador = contador + 1;
        int contador2 = ++contador;
        System.out.println("contador2: " + contador2);

        int contador3 = 10;
        System.out.print("contador3: ");
        System.out.print(--contador3);
        System.out.println();
        System.out.print("contador3: ");
        System.out.print(contador3--);
        System.out.println();
        System.out.println("contador3: " + contador3);

        /*** Operadores de atribuição e aritmética - Atribuição composta ***/
        int numeroAtrComp1 = 1;
        // numeroSoma = numeroSoma + 100;
        numeroAtrComp1 += 100;
        System.out.println("numeroAtrComp1: " + numeroAtrComp1);

        int numeroAtrComp2 = 10;
        numeroAtrComp2 /= 5;
        System.out.println("numeroAtrComp2: " + numeroAtrComp2);

        /*** Operadores de igualdade (ou diferença) ***/
        // expressão = tem por finalidade retornar um resultado lógico / boolean
        boolean expr1 = 1 == 1;
        System.out.println("expr1: " + expr1);

        // boolean expr2 = -7 != -7;
        System.out.println("-7 != -7?: " + (-7 != -7));

        /*** Operadores relacionais ***/
        boolean expr3 = 9 <= 10; // true
        System.out.println("expr3: " + expr3);

        boolean expr4 = 1 >= 10; // false
        System.out.println("expr4: " + expr4);

        int numeroRel1 = 7;
        int numeroRel2 = 8;
        System.out.println("numeroRel1 < numeroRel2?: " + (numeroRel1 < numeroRel2));

        /*** Operadores lógicos ***/
        boolean expr5 = true;
        boolean expr6 = 5 <= 10; // true
        boolean expr7 = "AB" != "BA"; // true
        boolean resExpr = expr5 && expr6 && expr7; // E
        System.out.println("resExpr: " + resExpr);

        boolean expr8 = false;
        boolean expr9 = 5 >= 10; // false
        boolean expr10 = "AB" != "BA"; // true
        boolean res2Expr = expr8 || expr9 || expr10; // OU
        System.out.println("res2Expr: " + res2Expr);

        int numSelecionado = 8;
        boolean res3Expr = numSelecionado == 0 || (numSelecionado <= 10 && numSelecionado > 0);
        System.out.println("res3Expr: " + res3Expr);
    }
}
