
package com.mycompany.mavenproject7;

public abstract class Funcionario extends Fisica{
    
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double salario;

    public Funcionario(String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstadoCivil estadocivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadocivil, dataNascimento, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n=====Funcionário===== " + 
                "\nCPF: " + cpf + 
                "\nRG: " + rg + 
                "\nMatricula: " + matricula + 
                "\nSetor: " + setor.getTexto() + 
                "\nSalário: " + salario;
    }
    
}