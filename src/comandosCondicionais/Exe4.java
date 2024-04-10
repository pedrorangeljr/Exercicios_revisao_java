package comandosCondicionais;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero > 0 ) {
			
			System.out.printf("O número digitado ao quadrado: %.1f%n", (double)Math.pow(numero, 2));
			System.out.printf("A Raiz quadrada do número digitado: %.1f%n", (double)Math.sqrt(numero)); // faz um casting.
			
		}else {
			
			System.out.println("Número Invalido");
		}

		sc.close();
	}

}
