package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poid;
	private Gaulois chasseur;
	
	public Sanglier(Gaulois chasseur, int poid) {
		super("sanglier", Unite.KILOGRAMME);
		this.chasseur = chasseur;
		this.poid = poid;
	}

	@Override
	public String decrireProduit() {
		return nom + " de " + poid + " " + unite + " chasse par " + chasseur.getNom(); 
	}

    @Override
    public int calculerPrix(int prixFixe) {
        return poid * prixFixe;
    }
}
