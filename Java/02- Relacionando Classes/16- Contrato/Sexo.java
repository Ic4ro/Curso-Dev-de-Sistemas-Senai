
package com.mycompany.mavenproject6;

public enum Sexo {
    MASCULINO("Masculino", 'M'),
    FEMININO("Femnino", 'F');

    private final String texto;
    private final char caractere;

    private Sexo(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
