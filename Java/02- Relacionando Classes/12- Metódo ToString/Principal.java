
package com.mycompany.mavenproject1;


public class Principal {

    public static void main(String[] args) {       
        Funcionario funcionario1 = new Funcionario(788979, "Icaro", "66898745-81", "5659-54", "5959595", "17/07/2017", Sexo.MASCULINO, Setor.SAUDE, 1500, "0719888758", "icaro123@gmail.com",
                                   new Endereco("Rua A", "277", "1 Andar", "548787-454", "Salvador", UnidadeFederativa.BAHIA));
    
          
        System.out.println("\nDados do Funcionário: ");
        System.out.println(funcionario1.toString());
        
     
        
    }   
}
