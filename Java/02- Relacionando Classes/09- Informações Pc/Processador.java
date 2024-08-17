
package com.mycompany.Principal;


public class Processador extends Informacoes{
    
    private String frequencia;

    public Processador(String frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
   
    
}

  