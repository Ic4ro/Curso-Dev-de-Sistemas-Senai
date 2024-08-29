
package com.mycompany.mavenproject10;

public class Gerente extends CargoDeConfiaca {

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Setor setor, Sexo sexo, double salario, String dataNascimento, Endereco endereco) {
        super(bonificacao, nome, cpf, rg, setor, sexo, salario, dataNascimento, endereco);
    }

    
    @Override
    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n===Gerente===";
    }

    @Override
    public double getSalarioFinal() {
        return getSalarioFinal();
    }

    
    
    
}
