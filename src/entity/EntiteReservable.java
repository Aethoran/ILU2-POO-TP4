package entity;

import calendrier.CalendrierAnnuel;

public abstract class EntiteReservable<T extends Formulaire> {

	private int numEntite;
	private CalendrierAnnuel calendrier;

	public EntiteReservable(int numEntite) {
		this.numEntite = numEntite;
		this.calendrier = new CalendrierAnnuel();
	}

	public int getNumEntite() {
		return numEntite;
	}

	public void setNumEntite(int numEntite) {
		this.numEntite = numEntite;
	}

	public CalendrierAnnuel getCalendrier() {
		return calendrier;
	}

	public boolean estLibre(T formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}

	public abstract boolean compatible(T formulaire);

	public abstract Reservation reserver(T formulaire);
}
