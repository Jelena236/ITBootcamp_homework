/*
 * Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza koji su tipa int.
Zatim niz proslediti metodi koja treba da proveri da li je niz palindrom ili nije. Na standradnom izlazu obavestiti krajnjeg korisnika njemu razumljivim tekstom da li je unesen niz palindrom.
Primer ucitanog niza koji je palindrom: 12 46 17 46 12
Primer ucitanog niza koji nije palindrom: 12 46 17 12 64
 */

package nizovi;

import java.util.Scanner;

public class Nizovi1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Unesite duzinu niza: ");
		int duzina=sc.nextInt();
		
		int []a=new int[duzina];
		
		for(int i=0; i<duzina; i++) {
			System.out.println("Unesite "+i+".clan niza:");
			a[i]=sc.nextInt();
		}
		
		boolean rezultatFunkcije= palindrom(a);
		System.out.println("Ako je niz palindrom -- ispisace se true, a ako nije -- ispisace se false");
		System.out.println(rezultatFunkcije);
	
	}
	
	public static boolean palindrom(int[]niz) {
		for(int i=0; i<niz.length/2; i++) {
			if(niz[i]!=niz[niz.length-1-i]) {
				return false;
			}
		} return true;
	}

}
