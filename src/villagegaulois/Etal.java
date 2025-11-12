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
        int quantiteDisponible = 0;
        for (P p : produits) {
            if (p.getNom().equals(produit)) {
                quantiteDisponible++;
            }
        }
        if(quantiteDisponible > quantiteSouhaitee) {
        	return quantiteSouhaitee;
        } else {
        	return quantiteDisponible;
        }
    }

    @Override
    public int acheterProduit(int quantiteSouhaitee) {
        if (quantiteSouhaitee <= nbProduit) {
            nbProduit -= quantiteSouhaitee;
            return quantiteSouhaitee;
        } else {
            int quantiteVendue = nbProduit;
            nbProduit = 0;
            return quantiteVendue;
        }
    }

    @Override
    public String etatEtal() {
        StringBuilder etat = new StringBuilder(vendeur.getNom() + "vend " + nbProduit + "produits :" + "\n");
        for (P p : produits) {
            etat.append(" - " + p.decrireProduit() + "\n");
        }
        etat.append("Quantite disponible : " + nbProduit + "\n");
        etat.append("Prix par produit : " + prix + " sous\n");
        return etat.toString();
    }
}
