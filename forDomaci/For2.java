/*Napisati program koji ce na standardnom izlazu ispisati zbir prirodnih brojeva do n na sledeci nacin:
1) u zbir nece ulaziti brojevi deljivi brojem 5
2) ako se naidje na broj 13, sabiranje ce se zavrsiti i ispisace se zbir brojeva do tog trenutka.
*/

package forDomaci;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {

		System.out.println("Unesite broj: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int zbir = 0;

		for (int x = 0; x <= n; x++) {

			if (x % 5 == 0) {
				continue;
			}

			if (x == 13) {

				break;
			}

			zbir = zbir + x;
		}

		System.out.println("Zbir prirodnih brojeva do broja " + n + " je " + zbir);
	}

}
