package entity;

public abstract class Reservation {
	protected int mois;
	protected int jour;
	
	protected Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
	public abstract String toString();
}
