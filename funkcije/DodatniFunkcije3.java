/*
 * -> spojena prva dva zadatka sa malo izmenjenim zahtevima -> Napisati program koji ce procitati 3 cela broja sa 
 * standardnog ulaza i poziva i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca najveci 
 * od unetih brojeva.
 */



package funkcije;

import java.util.Scanner;

public class DodatniFunkcije3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		int prvi=sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		int drugi=sc.nextInt();
		System.out.println("Unesite treci broj: ");
		int treci=sc.nextInt();
		
		int rez= zbir(prvi,drugi,treci);
		System.out.println("Zbir ova tri broja je: "+rez);
		
		int najveci= max(prvi,drugi,treci);
		System.out.println("Najveci od ova tri broja je: "+najveci);

	}
	
	
	
	public static int zbir(int a, int b, int c) {
		
		return a+b+c;
	}
	
	public static int max(int a, int b, int c) {
		int max=a;
		 if(b>max){
			max=b;
		} 
		if (c>max) {
			max=c;
		} return max;
	}

}
