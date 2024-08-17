package com.mycompany.main;

public class Memorias extends Heranca {
    private double armazenamento;

    public Memorias(double armazenamento, String marca, String modelo) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }
}