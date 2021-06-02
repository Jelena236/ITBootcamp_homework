
/*
 *Napisati program koji ce racunati povrsinu okrecene prostorije, tako sto se ivice prostorije ucitavaju 
 *preko konzole. (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika 
 *i da nema prozora i vrata). *
 */

package sintaksa1;

import java.util.Scanner;

public class Sintaksa1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite duzinu prostorije u metrima: ");
		double a = sc.nextDouble();
		
		System.out.println("Unesite sirinu prostorije u metrima: ");
		double b = sc.nextDouble();
		
		System.out.println("Unesite visinu prostorije u metrima: ");
		double c = sc.nextDouble();
		
		double pOkreceneProstorije = 2 * (b * c + a * c) + a * b;
		
		System.out.println("Povrsina okrecene prostorije je " + pOkreceneProstorije);
		
	
		
		
				
	}

}
