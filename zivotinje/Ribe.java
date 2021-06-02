//Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.

package zivotinje;

public class Ribe extends Kicmenjaci{
	
	private String vrstaVode;
	
	public Ribe(String vrsta, String naziv, String hrana, String vrstaVode) {
		super(vrsta, naziv, hrana);
		this.vrstaVode = vrstaVode;
	}

	public String getVrstaVode() {
		return vrstaVode;
	}

	public void setVrstaVode(String vrstaVode) {
		this.vrstaVode = vrstaVode;
	}




	@Override
	public String toString() {
		StringBuilder rib = new StringBuilder();
		rib.append("Riba: ");
		rib.append(getNaziv());
		rib.append(" pripada vrsti ");
		rib.append(getVrsta());
		rib.append(".Omiljena hrana: ");
		rib.append(getHrana());
		rib.append(".Staniste joj je ");
		rib.append(vrstaVode);
		
		
		return rib.toString();
	}
	
	
	

}
