/*
 * Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja. 
 * Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)
 */


package firma;

public class Zaposleni {

	private String ime;
	private String prezime;
	private String pozicija;
	private int mesecnaPrimanja;
	
	public Zaposleni(String ime, String prezime, String pozicija, int mesecnaPrimanja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.mesecnaPrimanja = mesecnaPrimanja;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public int getMesecnaPrimanja() {
		return mesecnaPrimanja;
	}

	public void setMesecnaPrimanja(int mesecnaPrimanja) {
		this.mesecnaPrimanja = mesecnaPrimanja;
	}
	
	@Override
    public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime);
		sb.append("_");
		sb.append(prezime);
		sb.append(":");
		sb.append(pozicija.toUpperCase());
		sb.append("(");
		sb.append(mesecnaPrimanja);
		sb.append(")");
		
        return sb.toString();
    }
	
	
	
}
