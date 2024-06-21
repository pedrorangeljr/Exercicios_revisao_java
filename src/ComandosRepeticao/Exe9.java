package ComandosRepeticao;

import java.util.Scanner;

public class Exe9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		for(int i = 0; i <= numero; i++) {
			
			if(i % 2 == 0) {
				
				System.out.printf("%d%n", i);
			}
		}

		sc.close();
	}

}
