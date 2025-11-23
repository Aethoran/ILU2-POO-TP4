package entity;

public class ReservationHotel extends Reservation{
	int litSimple;
	int litDouble;
	int numChambre;
	
	public ReservationHotel(int jour, int mois, int litSimple, int litDouble, int numChambre){
		super(jour, mois);
		this.litSimple = litSimple;
		this.litDouble = litDouble;
		this.numChambre = numChambre;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(	"Le " + jour + "/" + mois + "\nChambre n°" + numChambre
					+ " avec " + litSimple + " lits simples et " + litDouble +
					" lits doubles.");
		return sb.toString();
	}
}
