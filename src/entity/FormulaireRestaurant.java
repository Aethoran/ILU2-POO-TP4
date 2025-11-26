package entity;

public class FormulaireRestaurant extends Formulaire {
	private int nbPersonnes;
	private int service;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int service) {
		super(jour, mois);
		this.nbPersonnes = nbPersonnes;
		this.service = service;
	}

	public int getNombrePersonnes() {
		return nbPersonnes;
	}

	public int getNumService() {
		return service;
	}


}
