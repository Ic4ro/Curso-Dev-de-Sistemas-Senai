package com.mycompany.exercise03;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        int menor = 0;

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = keyb.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = keyb.nextInt();

        if (primeiroNumero > segundoNumero) { 
            menor = segundoNumero;
        } 
        
        else {
            menor = primeiroNumero;
        }

        System.out.println("Menor número: " + menor);
    }
}