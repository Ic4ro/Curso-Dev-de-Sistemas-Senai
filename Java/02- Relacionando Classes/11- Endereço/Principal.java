
package com.mycompany.mavenproject1;


public class Principal {

    public static void main(String[] args) {      
        Endereco endereco = null;
        Pessoa  pessoa1 = new Pessoa(998857, "Icaro", 19, "0718998975", "icaro123@gmail.com", Sexo.MASCULINO, endereco);
        Endereco endereco1 = new Endereco("Rua A", "255", "1 Andar", "9888787", "Salvador", UnidadeFederativa.BAHIA);
        
        System.out.println("\nDados da pessoa: ");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade() + " Anos");
        System.out.println("Sexo: " + pessoa1.getSexo().getTexto());
        System.out.println("Email: " + pessoa1.getEmail());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        System.out.println("Id: " + pessoa1.getId());
        
        System.out.println("\nEndereço: ");
        System.out.println("Logradouro: " + endereco1.getLogradouro());
        System.out.println("Número: " + endereco1.getNumero());
        System.out.println("Complemento: " + endereco1.getComplemento());
        System.out.println("Cep: " + endereco1.getCep());
        System.out.println("Cidade: " + endereco1.getCidade());
        System.out.println("Uf: " + endereco1.getUf().getNome());
        
    }
}
