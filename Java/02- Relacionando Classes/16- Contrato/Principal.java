
package com.mycompany.mavenproject6;

public class Principal {

    public static void main(String[] args) {
     Cliente pessoa1 = new Cliente("151515", Sexo.MASCULINO, EstadoCivil.CASADO, "05/05/2005", "Icaro", "07198774478", "icaro@gmail.com",
             new Endereco("Rua A", "123", "1 Andar", "58886-41", "Salvador", UnidadeFederativa.BAHIA));
     PrestacaoServico pessoa2 = new PrestacaoServico("17/07/2010", "17/07/2020", "999998", "9898989", "Amanda", "0719887887", "Amanda@gmail.com", 
             new Endereco("Rua B", "988", "2 Andar", "55578-555", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
             
             System.out.println(pessoa1.toString());
             System.out.println(pessoa2.toString());
    }
}
