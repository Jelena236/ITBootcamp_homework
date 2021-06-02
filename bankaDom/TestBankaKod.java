/*
 * Po uzoru na rad na casu (zadatak sa klasama Account i TestAccount), napraviti klasu TestBankaKod i :

proveriti da li konstruktor dobro postavlja argumente, kao i da li get metode vracaju odgovarajuce vrednosti. Kada se napravi racun, na stanju je 0 dinara.

 */

package bankaDom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBankaKod {

	@Test
	public void testKonstruktor() {

		BankaKod b = new BankaKod("Jelena", "123-567-098");

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(b.dohvatiIme(), "Jelena");
		sa.assertEquals(b.dohvatiZiroRacun(), "123-567-098");
		sa.assertEquals(b.dohvatiIznos(), 0d);

		sa.assertAll();

	}

	@Test
	public void testGet() {
		String ime = "Jelena";
		String ziroRacun = "123-567-098";
		double stanje = 0;

		BankaKod b = new BankaKod(ime, ziroRacun);

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(b.dohvatiIme(), "Jelena");
		sa.assertEquals(b.dohvatiZiroRacun(), "123-567-098");
		sa.assertEquals(b.dohvatiIznos(), 0d);
		
		sa.assertAll();

	}

}
