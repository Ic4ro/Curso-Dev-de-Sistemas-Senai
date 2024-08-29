
package com.mycompany.mavenproject10;

public class Motorista extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, String rg, Setor setor, Sexo sexo, double salario, String dataNascimento, Endereco endereco) {
        super(nome, cpf, rg, setor, sexo, salario, dataNascimento, endereco);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return getSalarioFinal();
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n===Motorista " + 
                "\nCarteira de Habilitação: " + carteiraDeHabilitacao;
    }

    
    
    
    
}
