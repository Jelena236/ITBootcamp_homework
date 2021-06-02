/*
 * Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu putnika. Putnici imaju ime, prezime i broj pasosa.
U glavnom programu se igrati i testirati napisane klase.
 */


package aranzmani;

import java.util.List;

public class Putovanja {
	
	private String destinacija;
	private int cena;
	private List<Putnici>putnici;
	
	public Putovanja(String destinacija, int cena, List<Putnici> putnici) {
		super();
		this.destinacija = destinacija;
		this.cena = cena;
		this.putnici = putnici;
	}

	public String getDestinacija() {
		return destinacija;
	}

	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public List<Putnici> getPutnici() {
		return putnici;
	}

	public void setPutnici(List<Putnici> putnici) {
		this.putnici = putnici;
	}
	
	
	
	

}
