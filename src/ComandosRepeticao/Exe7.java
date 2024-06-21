package ComandosRepeticao;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int cont = 0;
		
		for(int i = 0; i < 5; i++) {
			
			int j = sc.nextInt();
			
			if(i % 2 == 0) {
				
				soma += j;
				cont +=i;
			}
		}
		
		System.out.printf("A media dos Números paraes %.1f%n", (double) soma / cont);
		
		sc.close();
	}

}
