
package com.mycompany.teste;

public class Interface {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        Galo fowl = new Galo();
        Pato duck = new Pato();
                
        System.out.println(dog.emitirSom() + "\n" + dog.comer() + "\n");
        System.out.println(cat.emitirSom() + "\n" + cat.comer() + "\n");
        System.out.println(fowl.emitirSom() + "\n" + fowl.comer() + "\n");
        System.out.println(duck.emitirSom() + "\n" + duck.comer());
        
    }
}
