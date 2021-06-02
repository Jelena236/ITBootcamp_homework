// Napraviti klasu Dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se nalazi i kapacitetu (broju mesta).

package dogadjaj;

public class Dvorana {

	private String naziv;
	private String grad;
	private int kapacitet;
	
	public Dvorana(String naziv, String grad, int kapacitet) {
		super();
		this.naziv = naziv;
		this.grad = grad;
		this.kapacitet = kapacitet;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	
	
	

	
}
