package entity;

public class ReservationRestaurant extends Reservation{
	private int service;
	private int table;

	public ReservationRestaurant(int jour, int mois, int service, int table){
		super(jour, mois);
		this.service = service;
		this.table = table;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Le " + jour + "/" + mois + "\nTable " + table + " pour le ");
		switch (service){
			case 1:
				sb.append("premier");
				break;
			case 2:
				sb.append("deuxième");
				break;
			case 3:
				sb.append("troisième");
				break;
			default:
				sb.append(service + "ième");
		}
		sb.append(" service.");
		return sb.toString();
	}
}
