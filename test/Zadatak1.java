/*
 * Napisati program na programskom jeziku Java koji sluzi kao kviz za pogadjanje zemalja iz kojih dolaze teniseri.
 *  Korisnik moze da odgovara sve dok ne izabere opciju za izlaz. Korisniku se na standardni izlaz ispisuje sledecui
 *   meni:
1. Djokovic
2. Nadal
3. Federer
4. Izlaz

Korisnik bira redni broj tesnisera za koga ce pogadjati zemlju porekla. Nakon toga mu se ispisuje poruka sa pitanjem.
Npr. ukoliko je korisnik izablao opciju jedan ispisuje se poruka:
"Iz koje zemlje dolazi Djokovic?". Ukoliko korisnik unese tacan odgovor ispisuje se poruka "Tacno!".
Ukoliko korisnik unese netacan odgovor ispisuje se poruka "Netacno!".
Nakon toga opet se ispisuje isti meni sa istim funkcionalnostima.
Ukoliko korisnik izabere opciju 4 izlazi se iz programa.  
Ukoliko korisnik unese neki nevalidan broj kao opciju ponovo ispisati meni.
Prilikom provere tacnosti odgovora ne treba voditi racuna o velikim i malim slovima.
Tacni odgovori su: Djokovic - Srbija, Nadal - Spanija, Federer - Svajcarska.


 */



package test;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int izbor;
		
		do{
			System.out.println(""
					+ "Treba da pogodite iz kojih zemalja dolaze poznati teniseri.");
		System.out.println("Izaberite jednu od opcija:");
		System.out.println("1. Djokovic");
		System.out.println("2. Nadal");
		System.out.println("3. Federer");
		System.out.println("4. Izlaz");
		izbor=sc.nextInt();
		
		switch(izbor) {
		case 1:
			
			System.out.println("Izabrali ste Djokovica. Upisite iz koje zemlje dolazi:");
			String s1=sc.next();
			
			String s2=s1.toUpperCase();
			String tacan="SRBIJA";

			do { 
				System.out.println("Netacno!");
			 s1=sc.next();
			 s2=s1.toUpperCase();
			}
			while(!s2.equals(tacan));
			if(s2.equals(tacan)) {
				System.out.println("Tacno!");
			}
			break;
		case 2:
			
			System.out.println("Izabrali ste Nadala. Upisite iz koje zemlje dolazi: ");
			String r1=sc.next();
			
			String r2=r1.toUpperCase();
			String tacan2="SPANIJA";

			do { 
				System.out.println("Netacno!");
			 r1=sc.next();
			 r2=r1.toUpperCase();
			}
			while(!r2.equals(tacan2));
			if(r2.equals(tacan2)) {
				System.out.println("Tacno!");
			}
			break;
		case 3:
			
			System.out.println("Izabrali ste Federera. Upisite iz koje zemlje dolazi:");
			String f1=sc.next();
			
			String f2=f1.toUpperCase();
			String tacan3="Svajcarska";

			do { 
				System.out.println("Netacno!");
			 f1=sc.next();
			 f2=f1.toUpperCase();
			}
			while(!f2.equals(tacan3));
			if(f2.equals(tacan3)) {
				System.out.println("Tacno!");
			}
			break;
		case 4:
			System.out.println("Izlazite iz programa.");
			break;
		default: 
			System.out.println("Uneli ste nevalidan broj. Izaberite ponovo:");	
			
		}
		
		}while(izbor!=4);
		

		
	}

}
