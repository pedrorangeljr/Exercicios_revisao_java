package ComandosRepeticao;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i = 0; i < 5; i++) {
			
			int j = sc.nextInt();
			
			soma += j;
		}
		
		System.out.printf("A média entre os números: %.1f%n",(double) soma / 5);

		sc.close();
	}

}
