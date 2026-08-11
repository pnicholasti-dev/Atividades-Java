package atividades.q1;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emprestimo e = new Emprestimo();
        System.out.println("Valor do Emprestimo: ");
        e.setValor(sc.nextDouble());
        System.out.println("Taxa de juros: ");
        e.setTaxajuros(sc.nextDouble());
        System.out.println("Quantidade de parcelas: ");
        e.setParcela(sc.nextInt());

        System.out.println(e);


        sc.close();
    }
}
