
package com.mycompany.mavenproject10;

public enum Sexo {
    MASCULINO("Masculino", 'M'),
    FEMININO("Femninino", 'F');

    private final String texto;
    private final char caractere;

    private Sexo(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }

    
}
