package ComandosRepeticao;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia um número inteiro positivo par N e imprima todos os
		 * números pares de 0 até N em ordem crescente.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {

			if (i % 2 == 0) {

				System.out.printf("%d%n", i);
			}
		}

		sc.close();
	}

}
