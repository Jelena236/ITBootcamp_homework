/*
 * Prvi zadatak
Napisati program na programskom jeziku Java koji sluzi za pronalazenje niza sa vecim prosecnim elementom. Korisnik
 na standardniu ulaz unosi duzniu prvog niza, a zatim i sve njegove elemente. Nakon toga unosi duzinu drugog niza i
  sve njegove elemente. Ukoliko korisnik unese nevalidnu vrednost za duzinu niza ispisati poruku o tome i prekinuti 
  izvrsavanje programa. Pretpostaviti da ce korisnik uneti cele brojeve za elemente niza. Ucitavanje niza izvrsiti u 
  zasebnoj funkciji. Napisati funkciju pronadji kojoj se proslednjuju oba niza. Funkcija pronadji racuna prosecnu 
  vrednost elementa za oba niza i kao rezultat vreca vecu od te dve prosecne vrednosti. Na stendardni izlaz ispisati
   rezultat funkcije.

 */

package zadatak1;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu prvog niza: ");
		int duzina1 = sc.nextInt();

		if (duzina1 <= 0) {
			System.out.println("Nevalidna vrednost!");
		} else {
			int[] niz1 = new int[duzina1];

			upis(niz1);

			System.out.println("Unesite duzinu drugog niza: ");
			int duzina2 = sc.nextInt();

			int[] niz2 = new int[duzina2];

			if (duzina2 <= 0) {
				System.out.println("Nevalidna vrednost");
			} else {

				upis(niz2);
				
				pronadji(niz1, niz2);
				int max= pronadji(niz1,niz2);
				System.out.println("Najveca prosecna vrednost je: "+max);

			}
		}
	}

	public static void upis(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesite " + (i + 1) + ".element niza");
			a[i] = sc.nextInt();
		}
	}
	public static int pronadji(int[]a, int[]b) {
		int max1=0;
		int max2=0;
		int zbir1=0;
		int zbir2=0;
		int prosecnaVrednost=0;
		for(int i=0; i<a.length;i++) {
			zbir1+=a[i];
			prosecnaVrednost=zbir1/a.length;
			max1=prosecnaVrednost;
		}
		for(int i=0;i<b.length;i++) {
			zbir2+=b[i];
			prosecnaVrednost=zbir2/b.length;
			max2=prosecnaVrednost;	
		}
		if(max1>max2) {
			return max1;
		} return max2;
	}

}
