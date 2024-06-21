package ComandosRepeticao;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i = 0; i < 10; i++) {
			
			int j = sc.nextInt();
			
			soma += j;
		}
		
		System.out.printf("Soma dos Números: %d%n", soma);

		sc.close();
	}

}
