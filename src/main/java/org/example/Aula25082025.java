package org.example;

import java.util.Scanner;

public class Aula25082025 {

    public void run() {


        // Todos os identificadores deve começar com uma letra,
        // seguido de outras letras
        // ou números; ex.: nomeCompleto; nomeCompleto1; (errado: 1nomeCompleto)
        int pesoA = 100; // declaração de uma variável do tipo inteiro; e inicialização
        int pesoB; // declaração de variável.
        int pesoTotal = 0;

        Scanner input = new Scanner(System.in);

        pesoB = 50;

        System.out.print("Informe o peso A: ");
        pesoA = input.nextInt();
        System.out.print("Informe o peso B: ");
        pesoB = input.nextInt();

        // Imprime uma mensagem na tela.
        System.out.println("Hello and welcome!\n");
//        System.out.println();
        System.out.println("Fabrício Valadares");

        System.out.println("Valor do peso a: " + pesoA + " kg");
        System.out.printf("Valor do peso b: %d kg\n", pesoB);

        System.out.println();

        System.out.printf("%d + %d = %d\n\n", pesoA, pesoB, pesoA + pesoB);

        pesoTotal = pesoA + pesoB;

        System.out.printf("%d + %d = %d", pesoA, pesoB, pesoTotal);


    }
}
