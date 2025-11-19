package scenario;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
    public static void main(String[] args) {
    	Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
    	Gaulois obelix = new Gaulois("Obélix", 20);
    	Gaulois asterix = new Gaulois("Astérix", 6);
    	
    	Sanglier sanglier1 = new Sanglier(obelix, 2000);
    	Sanglier sanglier2 = new Sanglier(obelix, 1500);
    	Sanglier sanglier3 = new Sanglier(asterix, 1000);
    	Sanglier sanglier4 = new Sanglier(asterix, 500);

    	Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
    	Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

    	Poisson poisson1 = new Poisson("lundi");
    	Poisson[] poissons = { poisson1 };
    	
    	IEtal[] marche = new IEtal[3];

    	Etal<Sanglier> etalSanglier1 = new Etal<>();
    	Etal<Sanglier> etalSanglier2 = new Etal<>();
    	Etal<Poisson> etalPoisson = new Etal<>();

    	marche[0] = etalSanglier1;
    	marche[1] = etalSanglier2;
    	marche[2] = etalPoisson;

    	etalSanglier1.installerVendeur(obelix, sangliersObelix, 8);
    	etalSanglier2.installerVendeur(asterix, sangliersAsterix, 10);
    	etalPoisson.installerVendeur(ordralfabetix, poissons, 7);
    	
    	System.out.println(etalSanglier2.etatEtal());
    	System.out.println(etalSanglier1.etatEtal());
    	System.out.println(etalPoisson.etatEtal());

    	int totalAchetes = 0;

    	int achetes1 = etalSanglier2.contientProduit("sanglier", 3);
    	int prix1 = etalSanglier2.acheterProduit(achetes1);
    	System.out.println("A l'étal n° 1, j'achète " + achetes1 + " sangliers et je paye " + prix1 + " sous.");
    	totalAchetes += achetes1;

    	if (totalAchetes < 3) {
    	    int achetes2 = etalSanglier1.contientProduit("sanglier", 3 - totalAchetes);
    	    int prix2 = etalSanglier1.acheterProduit(achetes2);
    	    System.out.println("A l'étal n° 2, j'achète " + achetes2 + " sangliers et je paye " + prix2 + " sous.");
    	    totalAchetes += achetes2;
    	}

    	System.out.println("Je voulais 3 sangliers, j'en ai acheté " + totalAchetes + ".");

    	System.out.println(etalSanglier2.etatEtal());
    	System.out.println(etalSanglier1.etatEtal());
    	System.out.println(etalPoisson.etatEtal());


    }
}
