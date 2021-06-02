//Odeca je stvar koja ima dezen. Tekstualni opis je naziv - velicina/dezen – cena.

package zadatak2;

public class Odeca extends Stvar{
	
	private String dezen;

	public Odeca(double cena, String naziv, int velicina, char kolekcija, String dezen) {
		super(cena, naziv, velicina, kolekcija);
		this.dezen = dezen;
	}

	public String getDezen() {
		return dezen;
	}

	public void setDezen(String dezen) {
		this.dezen = dezen;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		sb.append(getNaziv());
		sb.append("-");
		sb.append(getVelicina());
		sb.append("/");
		sb.append(dezen);
		sb.append("-");
		sb.append(getCena());
		return sb.toString();
	}
	

}
