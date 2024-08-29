
package com.mycompany.mavenproject10;

public class Principal {

    public static void main(String[] args) {
   Endereco endereco1 = new Endereco("Rua A ", "290", "1 Andar", "131231", "Salvador", UnidadeFederativa.BAHIA);
   Diretor diretor1 = new Diretor(Bonificacao.DIRETOR, "Icaro", "1231312", "1231312", Setor.MARKETING, Sexo.MASCULINO, 1500, "17/07/2000", endereco1);
   
   Endereco endereco2 = new Endereco("Rua B", "131231", "2 Andar", "1312312", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO);
   Gerente gerente1 = new Gerente(Bonificacao.GERENTE, "Rafa", "2131", "31312", Setor.MARKETING, Sexo.FEMININO, 1000, "171819", endereco2);
    
   Endereco endereco3 = new Endereco("Rua C", "312", "3 Andar", "31312", "São paulo", UnidadeFederativa.SAO_PAULO);
   Motorista motorista1 = new Motorista("Tipo C", "Jonas", "3123123", "131312", Setor.OPERADOCOES, Sexo.MASCULINO, 3000, "17/17/17", endereco3);
   
   
   
   
        System.out.println(diretor1);
        System.out.println(gerente1);
        System.out.println(motorista1);
        
        
        
        
  //Uso do metódo de acesso apenas ao diretor.
        diretor1.demitir(motorista1);
    }
    
}