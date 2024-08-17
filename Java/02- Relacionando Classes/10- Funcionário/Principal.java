
package com.mycompany.mavenproject1;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("8b979", "Marta", 1500, Setor.VENDAS, 22, Sexo.FEMININO);
        Funcionario funcionario2 = new Funcionario("312312", "Icaro", 2500, Setor.MARKETING, 19, Sexo.MASCULINO);
        
        System.out.println("\nDados do Cliente: ");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Sexo: " + funcionario1.getSexo().getTexto());
        System.out.println("Id: " + funcionario1.getId());
        System.out.println("Setor: " + funcionario1.getSetor());
        System.out.println("Salário: " + funcionario1.getSalario());
        
        System.out.println("\nDados do Cliente: ");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Idade: " + funcionario2.getIdade());
        //System.out.println("Sexo: " + funcionario2.getSexo().getTexto());
        System.out.println("Sexo: " + funcionario2.getSexo().getCaractere());
        System.out.println("Id: " + funcionario2.getId());
        System.out.println("Setor: " + funcionario2.getSetor());
        System.out.println("Salário: " + funcionario2.getSalario());
    }
}