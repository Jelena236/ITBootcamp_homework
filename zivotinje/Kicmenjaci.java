package zivotinje;

public class Kicmenjaci extends Zivotinje {

	public Kicmenjaci(String vrsta, String naziv, String hrana) {
		super(vrsta, naziv, hrana);
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\n");
		return sb.toString();
	}

}
