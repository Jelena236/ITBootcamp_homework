/*
 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, 
 * i ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11

 */


package whilePaket;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int broj= 1;
	int zbir=0;

	
	while (broj>0) {
		System.out.println("Unesi broj veci od 0: ");
		broj=sc.nextInt();
		
		if(broj>0) {
			zbir=zbir+broj;}
			
			

}
			System.out.println("Zbir je: "+zbir);


	}
	}


