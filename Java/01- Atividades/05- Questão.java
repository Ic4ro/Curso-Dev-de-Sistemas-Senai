package com.example;

import java.util.Scanner;

public class Exercise05 {
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

            if (media >= 7) {
                System.out.println("Aprovado!");
            } 
            
            else if (media >=5 && media < 6.9) {
                System.out.println("Verificação Suplementar.");
            }

            else {
                System.out.println("Reprovado!");
            }
  }
}