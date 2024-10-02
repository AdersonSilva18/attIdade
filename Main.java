package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer quantidadeMenor18 = 0;
        Integer quantidadeEntre18e59 = 0;
        Integer quantidadeMais60 = 0;
        Integer idade;

        System.out.println("Insira a quantidade de pessoas a serem cadastradas");
        Integer quantPessoas = scanner.nextInt();
        Integer[] idadePessoas = new Integer[quantPessoas];

        for (int i = 0; i < quantPessoas; i++) {
            System.out.println("Insira a idade da pessoa " + (i + 1) + ":");
            idade =  scanner.nextInt();
            idadePessoas[i] = idade;

            if (idade < 18) quantidadeMenor18++;
            if (idade >= 18 || idade <59) quantidadeEntre18e59++;
            if (idade >= 60) quantidadeMais60++;
        }

        System.out.println("Quantidade de pessoas são menores de 18 anos: "+quantidadeMenor18);
        System.out.println("Quantidade pessoas têm entre 18 e 59 anos: "+ quantidadeEntre18e59);
        System.out.println("Quantidade  pessoas têm 60 anos ou mais: "+ quantidadeMais60);

        scanner.close();
    }
}
