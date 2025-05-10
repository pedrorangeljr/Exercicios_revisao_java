package array;

import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[6];

		for (int i = 0; i < 6; i++) {

			System.out.print("Número " + (i + 1) + ": ");
			vetor[i] = sc.nextInt();
		}
		// Imprimindo o vetor na ordem inversa
		System.out.println("\nValores na ordem inversa:");
		for (int i = 5; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}

		sc.close();
	}

}
