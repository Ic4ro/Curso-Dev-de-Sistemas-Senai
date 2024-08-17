package com.mycompany.atividade;

public class Clientes extends Pessoa{
    private String dataCompra;
    private String formaPagamento;

    public Clientes(String dataCompra, String formaPagamento, String nome, int idade) {
        super(nome, idade);
        this.dataCompra = dataCompra;
        this.formaPagamento = formaPagamento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}