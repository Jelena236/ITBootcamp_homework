/*
 * Drugi zadatak
Napisati program na programskom jeziku Java koji sluzi za evidenciju i kombinovanje obuce i garderobe.
Stvar  ima cenu, naziv, velicinu i oznaku za kolekciju (m – muska, z – zenska, u - unisex). Tekstulani opis je naziv – cena.
Obuca je stvar koja ima materijal. Tekstualni opis je naziv – velicina/materijal - cena.
Odeca je stvar koja ima dezen. Tekstualni opis je naziv - velicina/dezen – cena.
Stajling sadrzi ime kreatora, jedan par obuce i jedan ili vise odevnih predmeta. Prilikom kreiranja stajlinga prosledjuje 
se samo ime kreatora. Moguce je postaviti, dohvatiti i izbaciti obucu, kao i dohvatiti sve odevne predmete, dodati neki odevni predmet, 
kao i ukloniti odevni predmet sa neke pozicije. Odevni predmeti dodaju se pojedinacno, a ne vise njih odjednom. 
Tekstualni opis je kreator - oznaka stajlinga – ukupna cena stajlinga. Oznaka stajling je “z” ukoliko ima vise zenskih stvari, “m” ukoliko ima
 vise muskih stvari ili “u” ukoliko ima jednak broj muskih I zenskih stvari ili su sve stvari unisex

 */

package zadatak2;

public class Stvar {
	
	private double cena;
	private String naziv;
	private int velicina;
	private char kolekcija;
	
	public Stvar(double cena, String naziv, int velicina, char kolekcija) {
		super();
		this.cena = cena;
		this.naziv = naziv;
		this.velicina = velicina;
		this.kolekcija = kolekcija;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getVelicina() {
		return velicina;
	}

	public void setVelicina(int velicina) {
		this.velicina = velicina;
	}

	public char getKolekcija() {
		return kolekcija;
	}

	public void setKolekcija(char kolekcija) {
		this.kolekcija = kolekcija;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(naziv);
		sb.append("-");
		sb.append(cena);
		return sb.toString();
	}
	
	
	
	
	
	

}
