package entity;

public class ReservationSpectacle extends Reservation{
	int numZone;
	int numChaise;

	
	public ReservationSpectacle(int jour, int mois, int numZone, int numChaise){
		super(jour, mois);
		this.numZone = numZone;
		this.numChaise = numChaise;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(	"Le " + jour + "/" + mois + "\nLa chaise n°" + numChaise
					+ " dans la zone n°" + numZone + ".");
		return sb.toString();
	}
}
