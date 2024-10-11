package array;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[6];
		
		for(int i = 0; i < 6; i++) {
			
			System.out.printf("Digite o número: %d%n", i + 1);
			
			vetor[i] = sc.nextInt();
		}
		
		for(int valor : vetor) {
			
			System.out.println(valor);
		}
		
		sc.close();

	}

}
