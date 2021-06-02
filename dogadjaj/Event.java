/* Napraviti klasu Event koja sadrzi podatke o vremenu, dvorani u kojoj se dogadjaj organizuje i tip 
 * (koncert, utakmica, vencanje…)
 */


package dogadjaj;

public class Event {
	
	private String datum;
	private Dvorana mesto;
	private String tip;
	
	public Event(String datum, Dvorana mesto, String tip) {
		super();
		this.datum = datum;
		this.mesto = mesto;
		this.tip = tip;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public Dvorana getMesto() {
		return mesto;
	}

	public void setMesto(Dvorana mesto) {
		this.mesto = mesto;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	
	
	

}
