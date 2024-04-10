package comandosCondicionais;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		if(numero > 0) {
			
			System.out.printf("A Rariz quadrada é: %.1f", Math.sqrt(numero));
			
		}else {
			
			System.out.printf("O número ao quadrado: %.1f", Math.pow(numero, 2));
		}
  
		sc.close();
	}
}
