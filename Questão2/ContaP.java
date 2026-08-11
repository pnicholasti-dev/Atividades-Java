package atividades.q2;

public class ContaP extends Conta {
    private double rendimento;

    public ContaP(int codigo, String titular, double saldo, double rendimento) {
        super(codigo, titular, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    @Override
    public String toString() {
        return "Conta Poupança\n" +
                "Número: " + getCodigo() +
                "\nTitular: " + getTitular() +
                "\nSaldo: R$ " + getSaldo() +
                "\nRendimento: " + rendimento + "%";
    }
}
