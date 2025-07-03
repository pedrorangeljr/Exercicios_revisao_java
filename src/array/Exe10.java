package array;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que preencha um vetor com 10 números reais, calcule e mostre
		 * a quantidade de números negativos e a soma dos números positivos desse vetor.
		 */
		Scanner sc = new Scanner(System.in);

		double[] numeros = new double[10];

		int somaPositovo = 0;
		int quantidadeNegativos = 0;

		for (int i = 0; i < 10; i++) {

			numeros[i] = sc.nextDouble();
			if (numeros[i] < 0) {

				quantidadeNegativos++;

			} else {

				somaPositovo += numeros[i];
			}
		}

		System.out.printf("A quantidade de números negativos %d%n", quantidadeNegativos);
		System.out.printf("Soma dos números positivos: %d%n", somaPositovo);

		sc.close();
	}

}
