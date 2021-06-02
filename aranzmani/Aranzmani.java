/*
 * Obavezni deo: napraviti bar 3 razlicita putovanja. Po zelji staviti putovanja u listu koja se zove ponuda. Jednom putovanju bar promeniti cenu aranzmana. 
Izbaciti jedno putovanje iz ponude.
Sa putovanja izbaciti jednog od putnika.
Neobavezni: vas slobodan izbor u skladu sa tekstom zadatka
 */


package aranzmani;

import java.util.ArrayList;
import java.util.List;

public class Aranzmani {

	public static void main(String[] args) {

		Putnici p1 = new Putnici ("Milica", "Jotovic", 9846312);
		Putnici p2 = new Putnici ("Vladan", "Jotovic", 8937462);
		Putnici p3 = new Putnici ("Ivana", "Mirotic", 7382649);
		Putnici p4 = new Putnici ("Danijela", "Kleut", 2378509);
		Putnici p5 = new Putnici ("Milos", "Vukovic", 3758902);
		Putnici p6 = new Putnici ("Aleksandra", "Bajic", 2367402);
		
		List<Putnici>lista1 = new ArrayList<Putnici>();
		lista1.add(p1);
		lista1.add(p2);
		lista1.add(p5);
		
		List<Putnici>lista2 = new ArrayList<Putnici>();
		lista2.add(p3);
		lista2.add(p4);
		
		List<Putnici>lista3 = new ArrayList<Putnici>();
		lista3.add(p1);
		lista3.add(p3);
		lista3.add(p4);
		lista3.add(p6);
		
		Putovanja a1 = new Putovanja("Rim", 350, lista1);
		Putovanja a2 = new Putovanja("Veneceija", 250, lista2);
		Putovanja a3 = new Putovanja("Pariz", 450, lista3);
		Putovanja a4 = new Putovanja("Sicilija", 700, lista1);
		
		List<Putovanja> ponuda = new ArrayList<Putovanja>();
		ponuda.add(a1);
		ponuda.add(a2);
		ponuda.add(a3);
		ponuda.add(a4);
		
		ponuda.get(0).setCena(300);
		System.out.println(ponuda.get(0).getCena());
		
		ponuda.remove(2);
		
		ponuda.get(0).getPutnici().get(1).getIme();
		System.out.println(lista1.get(1).getIme());
		
		ponuda.remove(0).getPutnici().remove(1);
		System.out.println(lista1.get(1).getIme());
		
		StringBuilder sb = new StringBuilder();
		sb.append("Grad ");
		sb.append(a1.getDestinacija());
		sb.append(" posetice ");
		sb.append(a1.getPutnici().get(0).getIme());
		
	
		
		System.out.println(sb.toString());
		
		System.out.println("Prezimena putnika za "+a3.getDestinacija()+" su: ");
		for(int i=0; i<lista3.size(); i++ ) {
			System.out.println(lista3.get(i).getPrezime()+" ");	
		}
		



		
		
	}

}
