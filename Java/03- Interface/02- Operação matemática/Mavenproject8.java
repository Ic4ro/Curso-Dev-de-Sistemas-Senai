
package com.mycompany.mavenproject8;

public class Mavenproject8 {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        System.out.println("Resultado da Soma: " + soma.calcular(4, 5));
        System.out.println("Resultado da Subtração: " + subtracao.calcular(9, 5));
        System.out.println("Resultado da Multiplicação: " + multiplicacao.calcular(3, 2));
        System.out.println("Resultado da Divisão: " + divisao.calcular(10, 2));
    }
}
