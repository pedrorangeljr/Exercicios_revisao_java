package comandosCondicionais;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero < 0) {
			
			System.out.println("Numero invalido");
			
		}else {
			
			System.out.printf("O Logaritimo: %.1f%n", Math.log(numero));
		}

		sc.close();
	}

}
