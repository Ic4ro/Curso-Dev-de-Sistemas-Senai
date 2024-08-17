
package com.mycompany.Principal;

public class Memoria extends Informacoes {

   private String capacidaDeArmazenamento;
   private String Frequencia;

    public Memoria(String capacidaDeArmazenamento, String Frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.capacidaDeArmazenamento = capacidaDeArmazenamento;
        this.Frequencia = Frequencia;
    }

    public String getFrequencia() {
        return Frequencia;
    }

    public void setFrequencia(String Frequencia) {
        this.Frequencia = Frequencia;
    }

    public String getCapacidaDeArmazenamento() {
        return capacidaDeArmazenamento;
    }

    public void setCapacidaDeArmazenamento(String capacidaDeArmazenamento) {
        this.capacidaDeArmazenamento = capacidaDeArmazenamento;
    }
   
    
   
}