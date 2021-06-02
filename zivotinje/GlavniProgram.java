/*
 * Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
Ispisati bar jedno staniste.
Jednom sisaru zameniti boju dlake.
 */


package zivotinje;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		
		Zivotinje z1 = new Zivotinje ("ptica", "labud", "zitarica i insekti");
		Zivotinje z2 = new Zivotinje ("gmizavac", "guster", "insekti");
		
		
		
		Ribe r1 = new Ribe ("kicmenjaci","pastrmka" , "insekti", "reka");
		Ribe r2 = new Ribe ("kicmenjaci", "saran", "biljke", "slatka voda");
		
		Sisari s1 = new Sisari ("kicmenjaci", "vidra", "riba", "smedja", 4);
		Sisari s2 = new Sisari ("kicmenjaci", "medved", "riba", "smejda", 4);
		
		
		s2.setBojaDlake("bela");
		
		List<Zivotinje> reka = new ArrayList<Zivotinje>();
		reka.add(z1);
		reka.add(r1);
		reka.add(s1);
		
		Staniste st1 = new Staniste ("reka", reka);
		
		System.out.println (z1.toString());
		System.out.println(r1.toString());
		System.out.println(st1.toString());
		
		Zivotinje an = reka.get(1);
		
		if(an instanceof Ribe) {
			Ribe riba = (Ribe) an;
			riba.setHrana("insekti i biljke");
			}
		
		Zivotinje vid = reka.get(2);
		
		if(vid instanceof Sisari) {
			Sisari vid1 = (Sisari) vid;
			vid1.setBojaDlake("siva");
		}
		
		System.out.println(s1.getBojaDlake());

		
		
		

	}

}
