
package com.mycompany.mavenproject10;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;   
    protected Setor setor;
    protected Sexo sexo;
    protected double salario;
    protected String dataNascimento;
    protected Endereco endereco;

    public Funcionario(String nome, String cpf, String rg, Setor setor, Sexo sexo, double salario, String dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.setor = setor;
        this.sexo = sexo;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

   
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
                "\n===Funcionario===" + 
                "\nNome: " + nome + 
                "\nCPF: " + cpf + 
                "\nRG: " + rg + 
                "\nEndereço: " + endereco +
                "\nSetor: " + setor.getNome() + 
                "\nSexo: " + sexo.getTexto() + " / " + sexo.getCaractere() +
                "\nSalário: " + salario + 
                "\nSalário Final: " + getSalarioFinal() +
                "\nData de Nascimento: " + dataNascimento +
                "\nEndereço: " + endereco;
                
    }

    
}
