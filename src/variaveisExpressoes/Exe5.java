package variaveisExpressoes;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double numeroReal = sc.nextDouble();
		
		System.out.printf("A quinta parte no número: %.1f%n", numeroReal / 5);
		
		sc.close();
	}

}
