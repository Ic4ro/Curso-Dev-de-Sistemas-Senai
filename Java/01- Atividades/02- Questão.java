package com.mycompany.exercise02;

import java.util.Scanner;

public class Exercise02 {
    
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra: ");
        Double valor = keyb.nextDouble();
        
        System.out.println("Quantas prestações: ");
        int prestacoes = keyb.nextInt();
        
        double valorFinal =  valor / prestacoes;
        
        System.out.println("Valor da compra:" + valor);
        System.out.println("Prestações: " + prestacoes);
        System.out.println("Valor das prestações: " + valorFinal);
        
        keyb.close();
    }
}