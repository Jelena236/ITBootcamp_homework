/*
 * Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta 

 */


package whilePaket;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		System.out.println("Unesite broj: ");
		Scanner sc=new Scanner(System.in);
		int brojPonavljanja= sc.nextInt();
		int brojac =0;
		
		while(brojac<brojPonavljanja) {
			System.out.println("Laku noc!");
			brojac++;
		}

	}

}
