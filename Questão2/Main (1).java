package atividades.q2;

public class Main {

    public static void main(String[] args) {

        ContaC cc = new ContaC(1001, "Francisco", 2500.00, 1000.00);
        ContaP cp = new ContaP(2001, "Maria", 5000.00, 0.8);


        cc.setSaldo(3000.00);
        cc.setLimite(1500.00);

        cp.setTitular("Maria Silva");
        cp.setRendimento(1.0);

        System.out.println(cc);
        System.out.println();
        System.out.println(cp);
    }
}
