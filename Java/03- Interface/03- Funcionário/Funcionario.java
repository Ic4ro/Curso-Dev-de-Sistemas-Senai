
package com.mycompany.mavenproject5;

public abstract class Funcionario {
    
    protected String nome;
    protected String dataNacimento;
    protected Setor setor;        
    protected Sexo sexo;
    protected double salarioBase;

    public Funcionario(String dataNacimento, String nome, double salarioBase, Setor setor, Sexo sexo) {
        this.dataNacimento = dataNacimento;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.setor = setor;
        this.sexo = sexo;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    //A Implementação não é obrigatória.
    public abstract double getSalarioFinal();
    
    
    @Override
    public String toString() {
        return 
                "\nNome: " + nome + 
                "\nData de Nacimento: " + dataNacimento + 
                "\nSetor: " + setor.getNome() + 
                "\nSexo: " + sexo.name() + 
                "\nSalário Base: " + salarioBase +
                "\nSaçário Final: " + getSalarioFinal();
    }
    
}