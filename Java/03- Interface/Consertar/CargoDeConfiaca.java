
package com.mycompany.mavenproject10;

public abstract class CargoDeConfiaca extends Funcionario{
    protected Bonificacao bonificacao; 

    public CargoDeConfiaca(Bonificacao bonificacao, String nome, String cpf, String rg, Setor setor, Sexo sexo, double salario, String dataNascimento, Endereco endereco) {
        super(nome, cpf, rg, setor, sexo, salario, dataNascimento, endereco);
        this.bonificacao = bonificacao;
    }

   
    public Bonificacao getBonificacao() {
        return bonificacao;
    }
    
    
}
