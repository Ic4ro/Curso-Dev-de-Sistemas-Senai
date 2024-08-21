
package com.mycompany.mavenproject2;


public class Principal {

    public static void main(String[] args) {
        Fisica fisica1 = new Fisica("575.547.565.51", "88874-548", "17/07/2017", "Icaro", "07197877874");
        Juridica juridica1 = new Juridica("87587589", "ikadias", "Icaro", "07198758598");
                       
        
        System.out.println(fisica1.toString());
        System.out.println(juridica1.toString());
    }
}
