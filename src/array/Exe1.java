package array;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = {1,0,5,-2,-5,7};
		
		int soma = vetor[0] + vetor[1] + vetor[5];
		
		vetor[4] = 100;
		
		System.out.printf("a soma é: %d%n", soma);
		for (int i : vetor) {
			
			System.out.printf("%d%n", i);
		}
		
		sc.close();

	}

}
