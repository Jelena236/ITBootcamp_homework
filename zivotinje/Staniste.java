//Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.


package zivotinje;

import java.util.List;

public class Staniste {
	
	private String naziv;
	private List<Zivotinje> listaZivotinja;
	
	public Staniste(String naziv, List<Zivotinje> listaZivotinja) {
		super();
		this.naziv = naziv;
		this.listaZivotinja = listaZivotinja;
	}

	public List<Zivotinje> getListaZivotinja() {
		return listaZivotinja;
	}

	public void setListaZivotinja(List<Zivotinje> listaZivotinja) {
		this.listaZivotinja = listaZivotinja;
	}

	public String getNaziv() {
		return naziv;
	}

	@Override
	public String toString() {
		
		StringBuilder stan= new StringBuilder();
		stan.append("U stanistu ");
		stan.append(naziv);
		stan.append(" zive ");
		for(int i=0; i<listaZivotinja.size();i++) {
			stan.append(listaZivotinja.get(i).getNaziv()).append(" ");
		}
		
		
		
		return stan.toString();
	}
	
	
	
	
	

}
