/*
 *  Uociti gresku u kodu, ne prebacujuci kod u Eclipse. Ispravljen kod predati kao Zatatak1 u Google doc formi.

 */


package whilePaket;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		System.out.println("Unesite poluprecnik kruga: ");

		Scanner sc = new Scanner (System.in);
		double r;
		r=sc.nextDouble();
		
		if (r>0) {
			
			System.out.println("Povrsina kruga je: " + r*r*3.14);
		}
		else{System.out.println("Greska u unosu!");}
	}

}
