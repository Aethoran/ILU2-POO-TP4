package entity;

public class FormulaireHotel extends Formulaire {
	private int litSimple;
	private int litDouble;
	
	public FormulaireHotel(int jour, int mois, int litSimple, int litDouble) {
		super(jour, mois);
		this.litSimple = litSimple;
		this.litDouble = litDouble;
		this.identificationEntite = 2;
	}

	public int getLitSimple() {
		return litSimple;
	}

	public int getLitDouble() {
		return litDouble;
	}


}
