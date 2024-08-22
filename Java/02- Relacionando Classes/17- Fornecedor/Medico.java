
package com.mycompany.mavenproject7;

public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstadoCivil estadocivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadocivil, dataNascimento, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n=====Dados do Médico=====" +
               "\nCRM: " + crm;
    }
    
}
