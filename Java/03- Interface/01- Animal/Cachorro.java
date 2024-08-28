
package com.mycompany.teste;

public class Cachorro implements Animal {

    // Sobrescrever.
    // Sobrescrita.
    @Override
    public String emitirSom() {
        return "Auau!";
    }

    @Override
    public String comer() {
        return "Ração!";
    }
    
}
