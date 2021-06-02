//Napisati glavni program, gde cete testirati kako ove klase funkcionisu.Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)

package firma;

public class Kompanija {

	public static void main(String[] args) {

		Zaposleni z1 = new Zaposleni("Marko", "Ponjevic", "junior QA", 300);
		Zaposleni z2 = new Zaposleni("Ema", "Stojic", "medior QA", 600);
		Zaposleni z3 = new Zaposleni("Stefan", "Milutinovic", "SD", 950);
		Zaposleni z4 = new Zaposleni("Mila", "Markovic", "SD", 1300);
		Zaposleni z5 = new Zaposleni("Mihajlo", "Trifunovic", "DevOps Engineer", 1200);

		Zaposleni[] firma1 = { z1, z2, z3 };
		Zaposleni[] firma2 = { z4, z5 };

		Firma f1 = new Firma("VegaIT", "Novi Sad", 105723766, firma1);
		Firma f2 = new Firma("Levi9", "Beograd", 103941306, firma2);

		System.out.println(z1.toString());

		System.out.print("Zaposleni u " + f1.getNaziv() + " su: ");

		Prezimena(firma1);

	}

	private static void Prezimena(Zaposleni[] firma1) {
		for (int i = 0; i < firma1.length; i++) {
			System.out.print(firma1[i].getPrezime() + " ");
		}
	}

}
