package com.mycompany.main;

public class Processadores extends Heranca {
    private double frquencia;

    public Processadores(double frquencia, String marca, String modelo) {
        super(marca, modelo);
        this.frquencia = frquencia;
    }

    public double getFrquencia() {
        return frquencia;
    }

    public void setFrquencia(double frquencia) {
        this.frquencia = frquencia;
    }
}