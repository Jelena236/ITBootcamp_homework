/*
 * Zivotinje

U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica, poklasa.. Moze biti kicmenjak/beskicmenjak, moze biti i neko blize odredjivanje…), 
konkretan naziv i omiljenu hranu.

 */


package zivotinje;

public class Zivotinje {
	
	
	protected String vrsta;
	protected String naziv;
	protected String hrana;
	
	public Zivotinje(String vrsta, String naziv, String hrana) {
		super();
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.hrana = hrana;
	}

	public String getHrana() {
		return hrana;
	}

	public void setHrana(String hrana) {
		this.hrana = hrana;
	}

	public String getVrsta() {
		return vrsta;
	}

	public String getNaziv() {
		return naziv;
	}

	@Override
	public String toString() {
		StringBuilder ziv = new StringBuilder();
		ziv.append("Zivotinja ");
		ziv.append(naziv);
		ziv.append(" pripada vrsti ");
		ziv.append(vrsta);
		ziv.append(" i omiljena hrana joj je ");
		ziv.append(hrana);
		
		return ziv.toString();
	}
	
	
	
}
