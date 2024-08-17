package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        Processadores processador = new Processadores(399, "Ryzen", "Ryzen 7 5700x");
        Memorias memoria =  new Memorias(32, "Asus", "xxx");
        
        System.out.println("Processador.");
        System.out.println("Frequência: " + processador.getFrquencia());
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        
        System.out.println("Memória.");
        System.out.println("Armazenamento: " + memoria.getArmazenamento());
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
    }
}