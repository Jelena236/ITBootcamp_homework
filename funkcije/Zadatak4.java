/*
 * Da li u nasoj klasi mozemo da imamo sledece funkcije i zasto?

public static void vrati() {
	System.out.println(“Vrati mi olovku”);
}
	
	
	public static String vrati() {
		return “Vrati mi svesku”;
}

Obrazlozenje predati kao Zadatak4 u Google doc-u

 */





package funkcije;

public class Zadatak4 {

	public static void main(String[] args) {
		
		String s1 = "Treba mi da pisem.";
		
		vratiOlovku(s1);
		
		String s2= vratiSvesku(s1);
		System.out.println(s2);

		

	}
	
	public static void vratiOlovku(String s) {
		System.out.println("Vrati mi olovku.");
		System.out.println(s);}
		
		
		public static String vratiSvesku(String s) {
			String vrati="Vrati mi svesku.";
			return vrati;
	}


}
