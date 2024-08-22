
package com.mycompany.mavenproject6;

public abstract class Fisica extends Pessoa{
    protected Sexo sexo;
    protected  EstadoCivil estadocivil;
    protected String dataNascimento;

    public Fisica(Sexo sexo, EstadoCivil estadocivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

  @Override
    public String toString() {
        return super.toString() +
               "\n=====Dados da Pessoa Fisica=====" + 
               "\nSexo: " + sexo.getTexto() + " | " + sexo.getCaractere() +
               "\nData Nascimento: " + dataNascimento;
    }
    
}
