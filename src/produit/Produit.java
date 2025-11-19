package produit;

public abstract class Produit implements IProduit {
	protected String nom;
	protected String unite;
	
	protected Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite.getSymbole();
	}

	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public int calculerPrix(int prixFixe) {
	    return prixFixe;
	}

}
