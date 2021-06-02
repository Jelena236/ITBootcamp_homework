/*
 * Napisati program koji izracunava proizvod elemenata niza tipa int,  koji su veci od njihovog indeksa. Za unos niza i
 * za proizvod koristiti zasebno metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza.
Primer ucitanog niza: 3 7 1 4 2 5
Primer izracunatog proizvoda: 84
 */



package nizovi;

import java.util.Scanner;

public class Nizovi2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzina = sc.nextInt();
		
		int[]niz=new int[duzina];
		
		unos(niz);
		
		int p=proizvod(niz);
		System.out.println("Proizvod je: "+p);
		
		
		
		
		
	}
	
	public static void unos(int[]niz) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<niz.length; i++) {
			System.out.println("Unesite "+(i+1)+".element niza:");
			niz[i]=sc.nextInt();
		}
	}
	
	public static int proizvod(int[]niz) {
		int proizvod=1;
		for(int i=0; i<niz.length; i++) {
        if(niz[i]>i) {
        	proizvod*=niz[i];
        }
	}return proizvod;
		
}
}