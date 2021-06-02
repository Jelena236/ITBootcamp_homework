/*
 * Grananja3: Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima meseci u godini 
 * koji pocinju na to slovo(na taj glas) - za resavanje ovog zadatka koristiti switch
 */


package grananja;

import java.util.Scanner;

public class Grananja3 {

	public static void main(String[] args) {

		System.out.println("Unesite naziv meseca: ");

		Scanner sc= new Scanner(System.in);
		String mesec = sc.next();

		
switch(mesec) {

case "januar":
case "jun":
case "jul":
	System.out.println("Pocetno slovo unetog meseca se pojavljuje u 3 naziva meseca na prvom mestu.");
	break;
case "mart":
case "maj":
case "april":
case "avgust":
	System.out.println("Pocetno slovo unetog meseca se pojavljuje u 2 naziva meseca na prvom mestu.");
	break;
case "februar":
case "septembar":
case "oktobar":
case "novembar":
case "decembar":
	System.out.println("Pocetno slovo unetog meseca se pojavljuje u 1 nazivu meseca na prvom mestu.");
	break;
	default: 
		System.out.println("Nepravilno uneta vrednost");

}

	
		
	}

}
