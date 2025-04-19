package array;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];
		int contadorPares = 0;

		System.out.println("Digite 10 números inteiros:");

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Número " + (i + 1) + ": ");
			vetor[i] = sc.nextInt();

			if (vetor[i] % 2 == 0) {

				contadorPares++;
			}
		}

		System.out.println("Quantidade de números pares: " + contadorPares);

		sc.close();
	}

}
