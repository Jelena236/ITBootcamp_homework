/*
 * Grananja2: Prvi domaci zadatak od 15.4.2021. uraditi ponovo, koristeci grananja kako bismo se ogradili
 *  od nemogucih izracunavanja povrsina (kakvi celi brojevi moraju da budu visina, sirina i duzina?)
 */



package grananja;

import java.util.Scanner;

public class Grananja2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite duzinu prostorije u metrima: ");
		double a = sc.nextDouble();
		
		System.out.println("Unesite sirinu prostorije u metrima: ");
		double b = sc.nextDouble();
		
		System.out.println("Unesite visinu prostorije u metrima: ");
		double c = sc.nextDouble();
		
		double povrsinaKrecenja = 2 * (b * c + a * c) + a * b;

		if (a<= 0 || b<=0 || c<=0) {
			
			System.out.println("Nepravilno unete dimenzije");
		}
		
		else {
			
			System.out.println("Povrsina okrecene prostorije je " + povrsinaKrecenja);
		}

	}

}
