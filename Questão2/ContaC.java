package atividades.q2;

public class ContaC extends Conta{
    private double limite;

    public ContaC(int codigo, String titular, double saldo, double limite) {
        super(codigo, titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public String toString() {
        return "Conta Corrente\n" +
                "Número: " + getCodigo() +
                "\nTitular: " + getTitular() +
                "\nSaldo: R$ " + getSaldo() +
                "\nLimite: R$ " + limite;
    }
}
