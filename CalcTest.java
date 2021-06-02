package calc;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalcTest {

	@BeforeClass
	public void preKlase() {
		System.out.println("Ovo je test klasa za klasu Calc. Testiracemo sve njene metode. Pocinjemo!");
	}

	@BeforeMethod
	public void preMetode() {
		System.out.println("Novi test!");
	}

	@Test(priority = 0)
	public void proba() {
		System.out.println("123");
	}

	@Test(priority = 1)
	public void povrsinaKruga() {
		Double rez = Calc.aCircle(2);
		Assert.assertEquals(rez, 12.56);

	}

	@Test(priority = 2)
	public void povrsinaKvadrata() {
		Double rez = Calc.aSquare(2);
		Assert.assertEquals(rez, 4.0);
	}

	@Test(priority = 3)
	public void povrsinaPravougaonika() {
		double rez = Calc.aRectangle(2, 3);
		Assert.assertEquals(rez, 6.0);
	}

}
