package calendrier;

import calendrier.CalendrierAnnuel.Mois;

public enum JourMois {
	JANVIER(31),
	FEVRIER(28),
	MARS(31),
	AVRIL(30),
	MAI(31),
	JUIN(30),
	JUILLET(31),
	AOUT(31),
	SEPTEMBRE(30),
	OCTOBRE(31),
	NOVEMBRE(30),
	DECEMBRE(31);
	
	private final int jour;
	
    private JourMois(int jour) {
        this.jour = jour;
    }

    public int getJour() {
        return jour;
    }
    
    public Mois toMois() {
    	return new Mois(this);
    }
}
