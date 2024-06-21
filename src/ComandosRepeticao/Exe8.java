package ComandosRepeticao;

public class Exe8 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for(int i = 0; i <= 50; i++) {
			
			if(i % 2 == 0) {
				
				soma +=i;
			}
		}

		System.out.printf("A soma dos 50 primeiros números pares: %d%n", soma);
	}

}
