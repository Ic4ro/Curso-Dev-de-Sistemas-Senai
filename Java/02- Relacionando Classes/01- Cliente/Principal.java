package com.mycompany.separando;

public class Principal {

    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        
         cliente.setNome("Marta");
         cliente.setIdade(20);
            
         System.out.println("Nome: " + cliente.getNome());
         System.out.println("Idade: " + cliente.getIdade());
    }
}