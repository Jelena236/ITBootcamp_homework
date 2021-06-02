/*Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta) 
sve tipove metoda napisanih u klasi Sportista.
*/

package sport;

public class Igraci {

	public static void main(String[] args) {

		Sportista s1=new Sportista("Nikola Jokic", "kosarka", "Denver Nuggets", 15);
		Sportista s2=new Sportista("Mirko Maric", "rukomet");
		Sportista s3=new Sportista("Sofija Tomic", "odbojka");
	
		
		s1.getSport();

		s2.setKlub("Partizan");
		s2.setDres(23);
	
		System.out.println("Igrac "+s2.getImeIPrezime()+" igra u klubu "+s2.getKlub());
		
		s3.setKlub("OK Vracar");
		s3.setDres(15);
		
		s1.setDres(19);
	}
	
	
	

}
