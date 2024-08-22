
package com.mycompany.mavenproject5;


public class Fisica extends Pessoa{
    private Sexo sexo;
    private String dataNascimento;

    public Fisica(Sexo sexo, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "\nDados da Pessoa Fisica: " + 
               super.toString() +
               "\nSexo: " + sexo + 
               "\nData Nascimento: " + dataNascimento;
    }
    
    
    
}
