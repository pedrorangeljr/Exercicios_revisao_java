package array;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[8];

		System.out.println("Digite 8 valores inteiros:");
		for (int i = 0; i < 8; i++) {

			System.out.print("Valor" + (i + 1) + ":");
			vetor[i] = sc.nextInt();
		}

		System.out.print("Digite a posição X (0 a 7");
		int x = sc.nextInt();
		System.out.print("Digite a posição Y (0 a 7");
		int y = sc.nextInt();

		if (x < 0 || x >= 8 || y < 0 || y >= 8) {

			System.out.println("Posição inválidas. Deve estar entre 0 e 7.");

		} else {

			int soma = vetor[x] + vetor[y];
			System.out.printf("A soma dos valores nas posições X e Y: %d%n", soma);
		}

		sc.close();

	}

}
