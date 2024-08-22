
package com.mycompany.mavenproject7;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico");
    
    private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }
    
    
}
