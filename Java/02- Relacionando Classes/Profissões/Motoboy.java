
package com.mycompany.mavenproject4;


public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String cnh, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "\nDados do Motoboy: " + 
                super.toString() +
               "\nCNH: " + cnh;
    }
    
    
}
