package variaveisExpressoes;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int soma = n1 + n3 + n2;
		
		System.out.printf("A soma: %d%n", soma);
		
		sc.close();
	}

}
