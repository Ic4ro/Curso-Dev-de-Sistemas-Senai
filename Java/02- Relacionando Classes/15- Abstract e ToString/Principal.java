
package com.mycompany.mavenproject5;

public class Principal {

    public static void main(String[] args) {
        Juridica pessoa1 = new Juridica("6569", "12312", "Kaio", "07190997877", "icas@gmail.com", 
        new Endereco("Rua A", "422", "1 Andar", "4141-211", "Salvador", UnidadeFederativa.BAHIA));
        Fisica pessoa2 = new Fisica(Sexo.MASCULINO, "17/07/1971", "João", "07198777887", "joao123@gmail.com", 
        new Endereco("Rua B", "366", "2 Andar", "65598-544", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}
