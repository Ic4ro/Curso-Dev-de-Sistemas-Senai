package com.mycompany.atividade02;

public class Atividade02 {

    public static void main(String[] args) {
        Clientes cliente = new Clientes("Ana", 30, "Rua");
        Enderecos endereco = new Enderecos("Rua", 23, "Salvador");
        
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Edereço: " + cliente.getEndereço());
        
        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Número: " + endereco.getNumero());
        System.out.println("Cidade: " + endereco.getCidade());
    }
}