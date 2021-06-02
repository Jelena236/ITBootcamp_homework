/*
 * Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
 * (znaci da korisnik unosi tri broja) i taj program treba da pozove i ispise (u mainu) najmanji od ta tri 
 * unesena broja.
 */



package funkcije;

import java.util.Scanner;

public class Funkcije1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite prvi celi broj: ");
		int a = sc.nextInt();
		
		System.out.println("Unesite drugi celi broj: ");
		int b = sc.nextInt();
		
		System.out.println("Unesite treci celi broj: ");
		int c = sc.nextInt();
		
		int d = najmanji(a,b,c);
		System.out.println("Najmanji je "+d);
				
			
		}
	public static int najmanji (int a, int b, int c) {
		int min=a;
		if(b<min) {
			min=b;
		}
		if(c<min) {
			min=c;
		} return min;
	}
}


