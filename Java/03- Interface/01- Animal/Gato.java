
package com.mycompany.teste;

public class Gato implements Animal {

    @Override
    public String emitirSom() {
        return "Miauu!";
    }

    @Override
    public String comer() {
        return "whiskas";
    }
    
}
