package comandosCondicionais;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			
			System.out.printf("%d%n", n1);
			
		}else if(n2 > n1) {
			
			System.out.printf("%d%n", n2);
			
		}else {
			
			System.out.println("Números iguais");
		}
		
		sc.close();
	}

}
