//Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

package zivotinje;

public class Sisari extends Kicmenjaci{

	private String bojaDlake;
	private int brojNogu;
	
	
	public Sisari(String vrsta, String naziv, String hrana, String bojaDlake, int brojNogu) {
		super(vrsta, naziv, hrana);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public int getBrojNogu() {
		return brojNogu;
	}

	
	public String toString() {
		StringBuilder si = new StringBuilder();
		si.append("Sisar: ");
		si.append(naziv);
		si.append(" pripada vrsti ");
		si.append(vrsta);
		si.append(" i omiljena hrana mu je ");
		si.append(hrana);
		si.append(" .Boja dlake mu je ");
		si.append(bojaDlake);
		si.append(" i ukupno ima udova ");
		si.append(brojNogu);
		
		return si.toString();
	}
	
	
	
	
}
