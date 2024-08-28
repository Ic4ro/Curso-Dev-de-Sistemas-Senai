
package com.mycompany.mavenproject9;

public class Principal {

    public static void main(String[] args) {
       Diretor diretor = new Diretor("17/07/2017", "Icaro", 1500, Setor.FINANCEIRO, Sexo.MASCULINO);
       Motoboy motoboy = new Motoboy("585959", "17/07/2017", "Marta", 1700, Setor.FINANCEIRO, Sexo.FEMININO);
    
        System.out.println(diretor);
        System.out.println(motoboy);
        
        //Uso do metódo de acesso apenas ao diretor.
        diretor.demitir(motoboy);
    }
}
