
package com.mycompany.mavenproject6;

public class Cliente extends Fisica{
    private String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Sexo sexo, EstadoCivil estadocivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadocivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    


    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n=====Cliente=====" +                
                "\nProtocolo de Atendimento: " + protocoloAtendimento;
    }
    
    
}
