
package com.mycompany.mavenproject2;


public class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String dataDeNascimento;

    public Fisica(String cpf, String rg, String dataDeNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
    }



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
     @Override
    public String toString() {
        return "\nDados da Fisica:  " +
               // super.nome +
               // super.telefone+
                super.toString() +
                "\nCPF: " + cpf + 
                "\nRG: " + rg + 
                "\nData de Nascimento: " + dataDeNascimento;
    }
}
