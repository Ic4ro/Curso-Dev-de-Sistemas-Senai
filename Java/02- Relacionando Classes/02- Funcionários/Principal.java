package com.mycompany.separando2;

public class Principal {

    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        
        funcionario.setNome("José");
        funcionario.setIdade(20);
        funcionario.setSalario(3000);
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Sálario: " + funcionario.getSalario());
    }
}