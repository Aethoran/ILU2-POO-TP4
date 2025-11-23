package calendrier;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	protected static class Mois {
		private JourMois mois;
		private boolean[] jour;
		
		public Mois(JourMois mois) {
			jour = new boolean[mois.getJour()];
			this.mois = mois;
			for (int i = 0; i < mois.getJour(); i++) {
				jour[i] = false;
			}
		}
		
		private boolean estLibre(int jour) {
			return !this.jour[jour-1];
		}
		
		private void reserver(int jour) {
			if (!estLibre(jour)){
				throw new IllegalStateException("Jour deja reserve");
			}
			this.jour[jour-1] = true;
		}
		
	}
	
	public CalendrierAnnuel() {
		calendrier = new Mois[12] ;
		
		JourMois[] mois = JourMois.values();
		for (int i = 0; i<12; i++) {
			calendrier[i] = mois[i].toMois();
		}
	}

	public boolean estLibre(int jour, int mois) {
		return calendrier[mois - 1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		try {
			calendrier[mois - 1].reserver(jour);
			return true;
		} catch (IllegalStateException e) {
			return false;
		}
	}

	
	
	
}
