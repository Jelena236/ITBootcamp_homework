/*
 * Napraviti program koji ce odstampati na standardnom izlazu trougao od zvezdica. 
 * Ako je unet broj 5 (korisnik unosi broj), trougao ce izgledati ovako:
 */

package forDomaci;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj:");
		int b=sc.nextInt();
		
		for(int i=b; i>=1; i-- ) {
			
			for(int j=b;j>i; j--)
			{System.out.print(" ");
		}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
	}
	}
		
}