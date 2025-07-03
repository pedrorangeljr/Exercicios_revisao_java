package array;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores
		 * lidos juntamente com o maior, o menor e a média dos valores.
		 */
		Scanner sc = new Scanner(System.in);

		double[] numeros = new double[5];
		double soma = 0.0;
		double maior, menor;

		// Leitura dos valores
		for (int i = 0; i < numeros.length; i++) {

			System.out.print("Digite o valor " + (i + 1) + ": ");
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}

		maior = numeros[0];
		menor = numeros[0];

		// Verifica maior e menor
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

		// Calcula a média
		double media = soma / numeros.length;

		// Exibe os valores
		System.out.println("\nValores lidos:");
		for (double valor : numeros) {
			System.out.println(valor);
		}

		// Exibe estatísticas
		System.out.println("\nMaior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("Média dos valores: " + media);

		sc.close();
	}

}
