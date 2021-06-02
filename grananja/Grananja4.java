/*
 * Dodatni (neobavezni) zadatak Grananja4: 
 * Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana. 
 * (Vodite racuna o prestupnoj godini!)


Uzela sam definiciju prestupne godine po gregorijanskom kalendaru, tj da je na svakih 400 godina 97 prestupnih :)
 * 
 */
package grananja;

import java.util.Scanner;

public class Grananja4 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        System.out.println("Unesite godinu.");
	        int god = sc.nextInt();
	        
	        System.out.println("Unesite broj meseca u godini");
	        int mesec = sc.nextInt();
	        if (mesec < 1) System.out.println("greska");
	        else {
	            switch (mesec) {
	                case 1: 
	                case 3:
	                case 5:
	                case 7:
	                case 8:
	                case 10:
	                case 12:
	                    System.out.println("Mesec ima 31 dan.");
	                    break;
	                case 4:
	                case 6:
	                case 9:
	                case 11: 
	                    System.out.println("Mesec ima 30 dana");
	                    break;
	                case 2:
	                    if (god % 4 == 0 && god % 100 != 0 || god % 400 == 0) { 
	                        System.out.println("Godina je prestupna");
	                        System.out.println("Mesec ima 29 dana");
	                    } else System.out.println("Mesec ima 28 dana.");
	                    break;
	                default:
	                    System.out.println("Takav mesec ne postoji");
	            }

	        }
	    }
	}