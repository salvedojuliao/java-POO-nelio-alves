package exercises;

import java.util.Scanner;

public class soma_de_dois_valores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma_result;
		
		soma_result = x + y;
		System.out.printf("SOMA = %d",soma_result);

		sc.close();
		
	}

}