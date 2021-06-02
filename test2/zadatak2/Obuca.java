//Obuca je stvar koja ima materijal. Tekstualni opis je naziv – velicina/materijal - cena.

package zadatak2;

public class Obuca extends Stvar{

	private String materijal;

	public Obuca(double cena, String naziv, int velicina, char kolekcija, String materijal) {
		super(cena, naziv, velicina, kolekcija);
		this.materijal = materijal;
	}

	public String getMaterijal() {
		return materijal;
	}

	public void setMaterijal(String materijal) {
		this.materijal = materijal;
	}

	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		sb.append(getNaziv());
		sb.append("-");
		sb.append(getVelicina());
		sb.append("/");
		sb.append(materijal);
		sb.append("-");
		sb.append(getCena());
		return sb.toString();
	}
	
	
}
