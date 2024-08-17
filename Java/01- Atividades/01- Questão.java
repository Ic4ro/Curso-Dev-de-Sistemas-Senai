package com.mycompany.exercise01;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = user.next();
        
        System.out.println("Digite sua idade: ");
        int idade = user.nextInt();
        
        System.out.println("Digite seu peso: ");
        double peso = user.nextDouble();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}