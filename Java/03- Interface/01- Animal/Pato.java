
package com.mycompany.teste;

public class Pato implements Animal {

    @Override
    public String emitirSom() {
        return "Quáqua!";
    }

    @Override
    public String comer() {
        return "Peixe!";
    }
    
}
