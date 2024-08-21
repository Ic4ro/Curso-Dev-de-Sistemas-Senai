
package com.mycompany.mavenproject4;

public class Principal {

    public static void main(String[] args) {
        Motoboy  funcionario1 = new Motoboy("78848", "rafa", "595.959.544.45", "554848", 1500);
        Medico funcionario2 = new Medico("5959", "Joao", "229.995.591-55", "6663", 2500);
        Engenheiro funcionario3 = new Engenheiro("dad669", "Marta", "595.999.999.54", "99595-59", 10000);
        
        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
    }
}
