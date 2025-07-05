package ComandosRepeticao;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia um número inteiro positivo N e imprima todos os
		 * números naturais de 0 até N em ordem decrescente.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		for (int i = numero; i > 0; i--) {

			System.out.printf("%d%n", i);
		}

		sc.close();
	}

}
