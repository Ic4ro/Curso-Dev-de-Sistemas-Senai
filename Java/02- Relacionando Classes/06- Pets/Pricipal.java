package com.mycompany.mavenproject1;

public class Main {

    public static void main(String[] args) {
        Clientes cliente = new Clientes("Rafa", 23,
                           new Pets("Rex", 3, "Pastor Alemão"));
        
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Pet: " + cliente.getPet());
        
        System.out.println("Nome: " + cliente.getPet().getNome());
        System.out.println("Idade: " + cliente.getPet().getIdade());
        System.out.println("Raça: " + cliente.getPet().getRaca());
    }
}