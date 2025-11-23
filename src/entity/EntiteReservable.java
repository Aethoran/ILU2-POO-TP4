package entity;

import calendrier.CalendrierAnnuel;

public class EntiteReservable<T extends Formulaire> {

	private int numEntite; // 0 : Table; 1 : place spectacle; 2 : chambre
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

	public boolean compatible(T formulaire) {
		return formulaire.getIdentificationEntite() == numEntite;
	}

	public Reservation reserver(T formulaire) {
		if (!compatible(formulaire)) {
			return null;
		} else if (!estLibre(formulaire)) {
			return null;
		}
		calendrier.reserver(formulaire.getJour(), formulaire.getMois());
		switch (numEntite) {
			case 0: //Restaurant
				FormulaireRestaurant fr = (FormulaireRestaurant) formulaire;
				int table = 1;
				return new ReservationRestaurant(fr.getJour(), fr.getMois(), fr.getNumService(), table);
				break;
			case 1: //Spectacle
				break;
			case 2: //Chambre
				break;
			}
		}
	}
}
