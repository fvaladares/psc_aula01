package org.example;


import java.util.Scanner; // Biblioteca para leitura de dados

// github.com/fvaladares
// Comentário de única linha

/*
    Comentário de múltiplas linhas
    Comentário de múltiplas linhas
 */

/**
 * Inteiro: int
 * Ponto flutuante: *double* ou float
 * Charactere: char
 * Lógico: boolean
 * "Palavra": String
 * Java é case sensitive
 */

/*
    Solicite um número de ponto flutuante (possui casas decimais),
    e, em seguida,
    exiba o valor deste número e o dobro do mesmo;
 */
public class Main {
    public static void main(String[] args) {
        // Declaração de variáveis
        double numeroBase = 0; // declaração e inicialização da variável
        double dobroNumeroBase = 0;
        Scanner entrada = new Scanner(System.in);

        // Solicitar o valor à pessoa utilizadora
        System.out.print("Digite um número: ");
        numeroBase = entrada.nextDouble();

        // Calculando o dobro do número
        dobroNumeroBase = numeroBase * 2;

        System.out.println("\n\nO valor informado foi: "
                + numeroBase);

        System.out.printf("O dobro de %f é %.2f",
                numeroBase,
                dobroNumeroBase);

    }
}