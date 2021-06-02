//Uvezati ove klase i u glavnom programu se igrati sa njima.


package dogadjaj;

public class Dogadjaj {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		Dvorana d1 = new Dvorana ("Stark Arena", "Beograd", 11000);
		Dvorana d2 = new Dvorana ("Kombank dvorana", "Beograd", 3600);
		Dvorana d3 = new Dvorana ("Spens", "Novi Sad", 7500);
		
		Event e1 = new Event ("28.5.2021.", d1, "koncert");
		Event e2 = new Event ("7.jun 2021.", d2, "premijera filma");
		Event e3 = new Event ("9.VI 2021.", d3, "utakmica");
		
		e1.getMesto().setNaziv("Kombank arena");
		
		e2.getMesto().setKapacitet(3850);
		


		




		

	}

}
