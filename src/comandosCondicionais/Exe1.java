package comandosCondicionais;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			
			System.out.printf("Número Maior: %d%n", n1);
		}else {
			
			System.out.printf("Número Maior: %d%n", n2);
		}
		
		sc.close();

	}

}
