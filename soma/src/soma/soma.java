package soma;
import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
		int A,B,soma;
		
		Scanner sc = new Scanner (System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		
		soma = A + B;
		
		System.out.println("SOMA = "+ soma);
		sc.close();
	}

}
