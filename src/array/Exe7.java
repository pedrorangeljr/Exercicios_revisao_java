package array;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		/*
		 *  Escreva um programa que leia 10 números inteiros e os armazene em um vetor. Imprima
         *  o vetor, o maior elemento e a posição que ele se encontra.
         *  
        */

		Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior, posicao;
        
        // Entrada dos valores do vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // Inicializa maior e posição com o primeiro elemento
        maior = vetor[0];
        posicao = 0;

        // Encontrando o maior elemento e sua posição
        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        // Imprimindo o vetor
        System.out.println("\nVetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Exibição do maior elemento e sua posição
        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Posição: " + posicao);
        
        sc.close();
		
	}

}
