package array;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior, menor;

        // Entrada dos valores do vetor
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // Inicializa maior e menor com o primeiro elemento
        maior = menor = vetor[0];

        // Encontrando o maior e o menor elemento
        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        // Exibição dos resultados
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        sc.close();
	}

}
