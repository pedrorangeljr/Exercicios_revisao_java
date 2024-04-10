package comandosCondicionais;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			
			System.out.println("Número Par");
			
		}else {
			
			System.out.println("Número Ímpar");
		}
		
		sc.close();

	}

}
