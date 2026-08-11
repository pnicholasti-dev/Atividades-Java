package atividades.q3;

    public class Financiamento {

        private String nomeCliente;
        private double valorVeiculo;
        private double entrada;
        private int quantidadeParcelas;

        public Financiamento(String nomeCliente, double valorVeiculo, double entrada, int quantidadeParcelas) {
            this.nomeCliente = nomeCliente;
            this.valorVeiculo = valorVeiculo;
            this.entrada = entrada;
            this.quantidadeParcelas = quantidadeParcelas;
        }

        public String getNomeCliente() {
            return nomeCliente;
        }

        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }

        public double getValorVeiculo() {
            return valorVeiculo;
        }

        public void setValorVeiculo(double valorVeiculo) {
            this.valorVeiculo = valorVeiculo;
        }

        public double getEntrada() {
            return entrada;
        }

        public void setEntrada(double entrada) {
            this.entrada = entrada;
        }

        public int getQuantidadeParcelas() {
            return quantidadeParcelas;
        }

        public void setQuantidadeParcelas(int quantidadeParcelas) {
            this.quantidadeParcelas = quantidadeParcelas;
        }
    }

