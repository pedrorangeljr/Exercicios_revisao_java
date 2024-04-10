package comandosCondicionais;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero > 0) {
			
			System.out.printf("A raiz quadrada: %.1f", Math.sqrt(numero));
			
		}else {
			
			System.out.println("Número invalido");
		}
		
		sc.close();

	}

}
