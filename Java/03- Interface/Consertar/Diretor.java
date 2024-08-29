
package com.mycompany.mavenproject10;

public class Diretor extends CargoDeConfiaca implements Contratacao { 
    private final double PREMIO = 0.5;
    final double valorBonicifacao = (salario * bonificacao.getValor());
    final double valorPremio = (salario * PREMIO);

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Setor setor, Sexo sexo, double salario, String dataNascimento, Endereco endereco) {
        super(bonificacao, nome, cpf, rg, setor, sexo, salario, dataNascimento, endereco);
    }

   

    @Override
    public double getSalarioFinal() {
        return (salario + valorBonicifacao + valorPremio);
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
                "\n===Prêmio de 50%===" +
                "\nPrêmio: " + PREMIO;
    }

    
     
}
