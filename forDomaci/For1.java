/*
 * Napisati program koji omoguciti korisniku da unosi recii, sve dok ne unese rec “stop”,
 *  nebitno da li je koristio mala, velika slova ili kombinaciju. Mozete pri radu koristiti petlju po izboru.
 */



package forDomaci;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite rec:");
		String rec=sc.nextLine();
		String obrada=rec.toLowerCase();
		String stop ="stop";
		
		while(!obrada.equals(stop)) {
			System.out.println("Unesite novu rec");
			rec=sc.nextLine();
			obrada=rec.toLowerCase();
			
			if(obrada.equals(stop)) {
				break;
			}
			
		}
		
		
		System.out.println("Uneli ste rec stop!");

		 }

		}
			

	



