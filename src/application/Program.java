package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Tenant;

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
			
			System.out.println("----------*----------");
			System.out.print("How many rooms will be rented? ");
			n=sc.nextInt();
		}
		System.out.println();
		Tenant[] vetor = new Tenant[10];
		sc.nextLine();
		for(int i =0; i < n; i++) {
			System.out.printf("Rent #%d:%n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			System.out.println();
			vetor[room] = new Tenant(name,email,room);
		}
		
		System.out.println("Busy rooms: ");
		for(int i =0; i< vetor.length; i++) {
			if(vetor[i] !=null) {
				System.out.printf("%d: %s, %s%n", vetor[i].getRoom(), vetor[i].getName(), vetor[i].getEmail());
			}
		}
		
		sc.close();

	}

}
