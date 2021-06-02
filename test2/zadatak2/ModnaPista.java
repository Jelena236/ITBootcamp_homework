package zadatak2;

import java.util.ArrayList;
import java.util.List;

public class ModnaPista {

	public static void main(String[] args) {

		
		Stvar s1= new Stvar(750, "marama", 0, 'u');
		System.out.println(s1);
		
		Obuca ob1 = new Obuca(2500, "patike", 37, 'z', "koza");
		System.out.println(ob1);
		
		Odeca od1 = new Odeca(3000, "pantalone", 32, 'm', "prugaste");
		System.out.println(od1);
		Odeca od2 = new Odeca(3500, "haljina", 30, 'z', "tufnice");
		Odeca od3= new Odeca(1500, "majica", 25, 'u', "bela");
		
		Stajling ss1 = new Stajling("Gucci");
		
		ss1.setObuca(ob1);
		
		System.out.println(ss1.getObuca());
		
		List<Odeca>odeca=new ArrayList<Odeca>();
		
		ss1.setOdevniPredmet(odeca);
		
		System.out.println(odeca.size());
		
		ss1.dodajOdevniPredmet(od1);
		
		System.out.println(odeca.size());
		
		System.out.println(ss1);
		
	
		System.out.println(oznaka(ss1));
		
		
		
	}
	
	//napravila sam ovu funkciju u mainu, ali ne znam kako da je pravilno pokrenem u Stajling klasi 
	public static char oznaka(Stajling s) {
		
	int brojac1=0;
	int brojac2=0;
	
	if(s.getObuca().getKolekcija()!='z') {
		brojac1++;
	}else {brojac2++;}
	
	for (int i=0; i<s.getOdevniPredmet().size();i++) {
		if(s.getOdevniPredmet().get(i).getKolekcija()!='z') {
			brojac1++;
		}else {brojac2++;}
	}
	if(brojac1==brojac2) { return  'u';}
			
	if(brojac1>brojac2) {return 'z';}
	else {return 'm';}
}
	
	
		
		
	}
	
	
				
				
			
		
		
	


