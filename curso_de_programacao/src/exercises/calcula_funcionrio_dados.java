package exercises;
import java.util.Locale;
import java.util.Scanner;

public class calcula_funcionrio_dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id_employe, hoursW;
		double wageH, income;
		
		id_employe = sc.nextInt();
		hoursW = sc.nextInt();
		wageH = sc.nextDouble();
		
		income = (hoursW * wageH);
		
		System.out.printf("NUMBER = %d%n", id_employe);
		System.out.printf("SALARY = U$ %.2f", income);
		
		sc.close();

	}

}