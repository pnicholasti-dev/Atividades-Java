package atividades.q3;

    public class FinanciamentoVeiculo extends Financiamento {

        private double taxaJurosAnual;

        public FinanciamentoVeiculo(String nomeCliente, double valorVeiculo,
                                    double entrada, int quantidadeParcelas,
                                    double taxaJurosAnual) {

            super(nomeCliente, valorVeiculo, entrada, quantidadeParcelas);
            this.taxaJurosAnual = taxaJurosAnual;
        }

        public double getTaxaJurosAnual() {
            return taxaJurosAnual;
        }

        public void setTaxaJurosAnual(double taxaJurosAnual) {
            this.taxaJurosAnual = taxaJurosAnual;
        }

        public double calcularValorFinanciado() {

            double valorFinanciado = getValorVeiculo() - getEntrada();

            double juros = valorFinanciado * (taxaJurosAnual / 100);

            return valorFinanciado + juros;
        }

        @Override
        public String toString() {
            return "Nome do Cliente: " + getNomeCliente() +
                    "\nValor do Veículo: R$ " + getValorVeiculo() +
                    "\nEntrada: R$ " + getEntrada() +
                    "\nQuantidade de Parcelas: " + getQuantidadeParcelas() +
                    "\nTaxa de Juros Anual: " + taxaJurosAnual + "%" +
                    "\nValor Total Financiado: R$ " + calcularValorFinanciado();
        }
    }

