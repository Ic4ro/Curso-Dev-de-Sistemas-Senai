
package com.mycompany.mavenproject5;

public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String dataNacimento, String nome, double salarioBase, Setor setor, Sexo sexo) {
        super(dataNacimento, nome, salarioBase, setor, sexo);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

   
    @Override
    public String toString() {
        return super.toString() + 
               "\nCarteira de Habilitação: " + carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }
}