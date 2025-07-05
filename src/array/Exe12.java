package array;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler 5 valores e, em seguida, mostrar a posição onde se
		 * encon- tram o maior e o menor valor.
		 */

		Scanner sc = new Scanner(System.in);

		int[] valores = new int[5];

		for (int i = 0; i < valores.length; i++) {

			System.out.print("Digite o valor " + (i + 1) + ": ");
			valores[i] = sc.nextInt();
		}

		int maior = valores[0];
		int menor = valores[0];
		int posMaior = 0;
		int posMenor = 0;

		for (int i = 1; i < valores.length; i++) {

			if (valores[i] > maior) {

				maior = valores[i];
				posMaior = i+1;
			}
			if (valores[i] < menor) {

				menor = valores[i];
				posMenor = i+1;
			}
		}

		System.out.println("\nMaior valor: " + maior + " na posição " + posMaior);
		System.out.println("Menor valor: " + menor + " na posição " + posMenor);

		sc.close();
	}

}
