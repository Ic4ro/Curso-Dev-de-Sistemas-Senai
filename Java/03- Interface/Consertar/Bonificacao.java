
package com.mycompany.mavenproject10;

public enum Bonificacao {
    GERENTE(0.35),
    DIRETOR(0.45);
    
    private final double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
}
