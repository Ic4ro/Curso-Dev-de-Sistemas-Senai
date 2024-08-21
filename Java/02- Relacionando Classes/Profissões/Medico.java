
package com.mycompany.mavenproject4;


public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
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
        return "\nDados do Médico: " +
                super.toString() +
               "\nCRM: " + crm;
    }

   
    
    
    
}
