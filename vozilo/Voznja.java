/*
        
Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila. 
Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.

 */


package vozilo;

public class Voznja {

	public static void main(String[] args) {

	Automobil a1=new Automobil("Fiat", "Grande punto", 10236, "Jelena Milosevic");
	Automobil a2=new Automobil("Audi", "RS6", 34567);
	Automobil a3=new Automobil("BMW", "M5", 85712);
	
	a1.getMarka();
	System.out.println(a1.getMarka());
	
	System.out.println(a1.getModel()+" "+a1.getSerijskiBroj());
	
	a2.setVlasnik("Milica Jovic");
	System.out.println(a2.getVlasnik());
	
	a1.setVlasnik("Ivan Milosevic");
	System.out.println(a1.getVlasnik());
	
	a3.setVlasnik("Marko Petrovic");
	System.out.println(a3.getVlasnik());
			
	System.out.println(a3.getVlasnik()+" je vlasnik automobila marke "+a3.getMarka());
		
	}

}
