package bankaDom;

public class BankaKod {
	
	   private String ziroRacun;
	   private String ime;
	   private Double iznos;
	  
	   public BankaKod(String ime, String ziroRacun){
	       this.ziroRacun=ziroRacun;
	       this.ime = ime;
	       this.iznos=0d;
	   }

	   public String dohvatiZiroRacun() {
	       return ziroRacun;
	   }
	   public String dohvatiIme() {
	       return ime; //posto su u prvom krugu oba testa pala zbog koda (return "ime") promenila sam kod. Oba testa su prosla u drugom krugu testiranja.
	   }
	   public Double dohvatiIznos() {
	       return iznos;
	   }



}
