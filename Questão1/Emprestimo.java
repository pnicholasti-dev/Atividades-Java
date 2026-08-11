package atividades.q1;

public class Emprestimo {
    private double valor, taxajuros;
    private int parcela;

    public Emprestimo(double valor, double taxajuros, int parcela) {
        this.valor = valor;
        this.taxajuros = taxajuros;
        this.parcela = parcela;
    }

    public Emprestimo() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxajuros() {
        return taxajuros;
    }

    public void setTaxajuros(double taxajuros) {
        this.taxajuros = taxajuros;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public double calcularPrecoFinal() {
        return valor + (valor * taxajuros);
    }


    @Override
    public String toString() {
        return "Valor do empréstimo: R$ " + valor +
                "\nTaxa de juros: " + taxajuros +
                "\nQuantidade de parcelas: " + parcela +
                "\nValor final: R$ " + calcularPrecoFinal();
    }

}

