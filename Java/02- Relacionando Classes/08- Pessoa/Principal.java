package com.mycompany.atividade;

public class Main {

    public static void main(String[] args) {
        Clientes cliente = new Clientes("25/05/2024", "Cartão de crédito", "Enzo", 22);
        Funcionarios funcionario = new Funcionarios("444", "Adm", 3000, "Lucas", 25);
        
        System.out.println("Cliente.");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Data da compra: " + cliente.getDataCompra());
        System.out.println("Forma de pagamento: " + cliente.getFormaPagamento());
        
        System.out.println("\nFuncionario.");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}