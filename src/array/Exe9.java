package array;

import java.util.Scanner;

public class Exe9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] vetor = new double[5];

		double media, soma = 0.0;

		for (int i = 0; i < 5; i++) {

			System.out.print("Número " + (i + 1) + ": ");
			vetor[i] = sc.nextInt();
			soma +=vetor[i];
		}

		media = soma / 5;
		
		System.out.printf("A media das notas é: %.1f%n", media);
		
		sc.close();
	}

}
