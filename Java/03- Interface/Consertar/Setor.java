
package com.mycompany.mavenproject10;

public enum Setor {
    EMGENHARIA("Engenharia"),
    JURIDICO("Jurídico"),
    RECURSIS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERADOCOES("Operações");
    
    
    private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
