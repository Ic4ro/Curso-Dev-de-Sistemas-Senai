
package com.mycompany.mavenproject5;

public class Diretor extends Funcionario implements Contratacao { 
   private final double PREMIO = 0.2; // Constante.

    public Diretor(String dataNacimento, String nome, double salarioBase, Setor setor, Sexo sexo) {
        super(dataNacimento, nome, salarioBase, setor, sexo);
    }
   
   @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salarioBase + PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
    }
    
    public double getPREMIO() {
        return PREMIO;
        
    }
   
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("=== Admitindo Funcionário ===");
        System.out.println("Dados do funcionário: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("=== Demitindo Funcionário ===");
        System.out.println("Dados do Funcionário: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPRÊMIO: " + PREMIO;
    }

    
     
}
