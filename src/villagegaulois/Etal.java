package villagegaulois;

import produit.IProduit;
import produit.Produit;
import personnages.Gaulois;

public class Etal<P extends IProduit> implements IEtal {
    private Gaulois vendeur;
    private P[] produits;
    private int nbProduit;
    private int prix;
    private boolean estOccupe;


    public void installerVendeur(Gaulois vendeur, P[] produits, int prix) {
        this.vendeur = vendeur;
        this.produits = produits;
        this.nbProduit = produits.length;
        this.prix = prix;
        this.estOccupe = true;
    }

    @Override
    public Gaulois getVendeur() {
        return vendeur;
    }

    @Override
    public int contientProduit(String produit, int quantiteSouhaitee) {
        int quantiteAVendre = 0;
        if (nbProduit != 0 && this.produits[0].getNom().equals(produit)) {
            if (nbProduit >= quantiteSouhaitee) {
                quantiteAVendre = quantiteSouhaitee;
            } else {
                quantiteAVendre = nbProduit;
            }
        }
        return quantiteAVendre;
    }

    @Override
    public int acheterProduit(int quantiteSouhaitee) {
        int prixPaye = 0;
        int quantiteAcheter = Math.min(quantiteSouhaitee, nbProduit);
        for (int i = nbProduit - 1; i >= nbProduit - quantiteAcheter; i--) {
            prixPaye += produits[i].calculerPrix(prix);
        }

        nbProduit -= quantiteAcheter;

        return prixPaye;
    }


    @Override
    public String etatEtal() {
    	StringBuilder chaine = new StringBuilder(vendeur.getNom());
    	if (nbProduit > 0) {
    		chaine.append(" vend " + nbProduit + " produits :");
    		for (int i = 0; i < nbProduit; i++) {
    			chaine.append("\n- " + produits[i].decrireProduit());
    		}
    	} else {
    		chaine.append(" n'a plus rien à vendre.");
    	}
    	chaine.append("\n");
    	return chaine.toString();
    	}
}
