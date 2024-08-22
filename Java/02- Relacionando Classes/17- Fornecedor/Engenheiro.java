
package com.mycompany.mavenproject7;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstadoCivil estadocivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadocivil, dataNascimento, nome, telefone, email, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n=====Dados do Engenheiro=====" +
               "\nCREA: " + crea;
    }
    
    
}
