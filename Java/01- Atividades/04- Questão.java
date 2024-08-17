package com.example;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String aluno = keyb.next();

        System.out.println("Digite a 1ª nota: ");
        Double primeiraNota = keyb.nextDouble();

        System.out.println("Digite a 2ª nota: ");
        Double segundaNota = keyb.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        System.out.println("Média do aluno: " + media);
    }
}