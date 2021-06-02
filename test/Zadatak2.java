/*Drugi zadatak
Napisati program koji racuna razliku izmedju visine najviseg i najnizeg igraca kosarkaskog tima kao
i prosecnu visinu igraca.
Korisnik na standardni ulaz unosi visinu svih pet igraca kosarkskog tima. Visina je izrazena u metrima.
Po zavrsetku unosa ispisuje se prosecna visina clana ekipe, visina najviseg igraca, visina najnizeg igraca i razlika
 u visini ta dva igraca.
Ukoliko korisnik unese nevalidnu vrednost kao visinu ispisati poruku o
gresci i omoguciti mu da ponovi unos. Smatrati da ne postoji kosarkas visi od 2,5 metara.
*/



package test;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int n=5;
		double max=0;
		double min=2.4;
		double zbir=0;
		double razlika=0;
		
		Scanner sc=new Scanner(System.in);
		double visina;
		
		for (int x=1; x<=n; x++) {
			System.out.println("Unesi visinu "+x+". igraca u metrima:");
			visina=sc.nextDouble();
			
			while(visina>=2.5 || visina<=0.1) {
				System.out.println("Greska! Nevalidna vrednost za "+x+" .igraca. Probajte ponovo");
				visina=sc.nextDouble();
			}
			
			zbir+=visina;
			
			if(visina>max) {
				max=visina;}
			
			if(visina<min) {
			min=visina;	
			}
			
			
		}System.out.println("Prosecna visina igraca je: "+(zbir/5) +" metara.");
		System.out.println("Najvisi igrac je: "+max+ "metara");
		System.out.println("Najnizi igrac je: "+min+ "metara");
		System.out.println("Razlika izmedju najviseg i najnizeg igraca je: "+(max-min)+"metara");


	}

}
