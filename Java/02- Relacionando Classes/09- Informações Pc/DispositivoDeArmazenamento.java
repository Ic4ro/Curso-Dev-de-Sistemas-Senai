
package com.mycompany.principal;

import com.mycompany.Principal.Informacoes;

public class DispositivoDeArmazenamento extends Informacoes{
    private String capacidaDeArmazenamento;
    private String tipoDeConexao;

    public DispositivoDeArmazenamento(String capacidaDeArmazenamento, String tipoDeConexao, String marca, String modelo) {
        super(marca, modelo);
        this.capacidaDeArmazenamento = capacidaDeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidaDeArmazenamento() {
        return capacidaDeArmazenamento;
    }

    public void setCapacidaDeArmazenamento(String capacidaDeArmazenamento) {
        this.capacidaDeArmazenamento = capacidaDeArmazenamento;
    }
    
    
    
}