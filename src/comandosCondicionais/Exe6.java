package comandosCondicionais;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			
			System.out.printf("O maior é: %d%n", n1);
			System.out.printf("A diferença entre ele é: %d%n", n1 - n2);
			
		}else {
			
			System.out.printf("O maior é: %d%n", n2);
			System.out.printf("A diferença entre ele é: %d%n", n2 - n1);
		}
		
		sc.close();

	}

}
