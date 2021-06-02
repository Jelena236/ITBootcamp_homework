/*Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj program treba da pozove i vrati
 *  (u mainu) proizvod unetih brojeva.
 */

package funkcije;

import java.util.Scanner;

public class Funkcije2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		int a=sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		int b=sc.nextInt();
		System.out.println("Unesite treci broj: ");
		int c=sc.nextInt();
		
		int rez=proizvod(a,b,c);
		System.out.println(rez);
		
	}
	
	public static int proizvod(int a, int b, int c) {
		int d=a*b*c;
		return d;
	}

}
