package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("How many rooms will be rented? ");
		n=sc.nextInt();
		
		while(n>10 || n < 0) {
			System.out.println(""
					+ "We have a total of 10 rooms numbered from 0 to 9. "
					+ "\nPlease enter a valid value greater than 0 and less than or equal to 10, "
					+ "\nindicating the number of people who will be renting");
			
			
			System.out.print("How many rooms will be rented? ");
			n=sc.nextInt();
		}
		
		
		sc.close();

	}

}
