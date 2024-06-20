package variaveisExpressoes;

import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		double desconto = valor * 0.12;
		
		System.out.printf("O valor produto com desconto de 12%% R$: %.2f%n", desconto);

		sc.close();
	}

}
