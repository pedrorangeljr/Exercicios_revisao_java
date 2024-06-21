package ComandosRepeticao;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		
		for(int i = 0; i <= numero; i++) {
			
			System.out.printf("%d%n", i);
		}
		sc.close();
	}

}
