
package com.mycompany.mavenproject5;

public class Principal {

    public static void main(String[] args) {
       Motoboy motoboy = new Motoboy("585959", "17/07/2017", "Marta", 1700, Setor.FINANCEIRO, Sexo.FEMININO);
       Diretor diretor = new Diretor("17/07/2017", "Icaro", 1500, Setor.FINANCEIRO, Sexo.MASCULINO);
      
        System.out.println(diretor);
        System.out.println(motoboy);
        
        //Uso do metódo de acesso apenas ao diretor.
        diretor.demitir(motoboy);
    }
}
