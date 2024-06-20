package variaveisExpressoes;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double F = sc.nextDouble();
		
		double C = 5.0 * (F - 32.0) / 9.0;
		
		System.out.printf("A temperatura em Celsius %.1f%n", C);
		
		sc.close();
	}

}
