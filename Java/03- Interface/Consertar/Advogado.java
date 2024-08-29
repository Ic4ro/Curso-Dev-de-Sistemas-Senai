
package com.mycompany.mavenproject10;

public class Advogado extends Funcionario{
    private String crb;

    public Advogado(String crb, String nome, String cpf, String rg, Setor setor, Sexo sexo, double salario, String dataNascimento, Endereco endereco) {
        super(nome, cpf, rg, setor, sexo, salario, dataNascimento, endereco);
        this.crb = crb;
    }

    
    public String getCrb() {
        return crb;
    }

    public void setCrb(String crb) {
        this.crb = crb;
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n===Advogado===" + 
                "\nCRB: " + crb;
    }
    
    
    
}
