/*
 * Stajling sadrzi ime kreatora, jedan par obuce i jedan ili vise odevnih predmeta. Prilikom kreiranja stajlinga prosledjuje 
se samo ime kreatora. Moguce je postaviti, dohvatiti i izbaciti obucu, kao i dohvatiti sve odevne predmete, dodati neki odevni predmet, 
kao i ukloniti odevni predmet sa neke pozicije. Odevni predmeti dodaju se pojedinacno, a ne vise njih odjednom. 
Tekstualni opis je kreator - oznaka stajlinga – ukupna cena stajlinga. Oznaka stajling je “z” ukoliko ima vise zenskih stvari, “m” ukoliko ima
 vise muskih stvari ili “u” ukoliko ima jednak broj muskih I zenskih stvari ili su sve stvari unisex
 */


package zadatak2;

import java.util.List;

public class Stajling {
	
	private String imeKreatora;
	private Obuca obuca;
	private List<Odeca> odevniPredmet;
	
	public Stajling(String imeKreatora) {
		super();
		this.imeKreatora = imeKreatora;
	}

	public String getImeKreatora() {
		return imeKreatora;
	}

	public void setImeKreatora(String imeKreatora) {
		this.imeKreatora = imeKreatora;
	}

	public Obuca getObuca() {
		return obuca;
	}

	public void setObuca(Obuca obuca) {
		this.obuca = obuca;
	}
	
	public void izbaciObucu(Obuca obuca) {
		this.obuca=null;
	}

	public List<Odeca> getOdevniPredmet() {
		return odevniPredmet;
	}
	

	public void setOdevniPredmet(List<Odeca> odevniPredmet) {
		this.odevniPredmet = odevniPredmet;
	}

	public void dodajOdevniPredmet(Odeca o) {
		odevniPredmet.add(o);
		
	}
	
	public void ukloniOdevniPredmet(int pozicija) {
		odevniPredmet.remove(pozicija);
		
	}
			

	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		
		double cenaOdece=0;
		for(int i=0; i<odevniPredmet.size();i++) {
		cenaOdece+=odevniPredmet.get(i).getCena();
		}
		double ukupnaCena=cenaOdece+obuca.getCena();
		
		sb.append(imeKreatora);
		sb.append(" -oznaka- ");//napravila sam u main funkciju za oznaku, nisam uspela ovde
		sb.append(ukupnaCena);
		
		return sb.toString();
	}
	
	
	
	

}
