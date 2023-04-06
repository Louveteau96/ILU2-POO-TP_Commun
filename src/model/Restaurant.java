package model;

public class Restaurant {
	private Table[] tables = new Table[100];
	private CentraleReservation<EntiteReservable<FormulaireRestaurant>, FormulaireRestaurant> centraleReservation;
	
	public void ajouterTable(int nbrChaise) {
		
	}
	
	public int[] donnerPossibilitees(FormulaireRestaurant formulaire) {
		return null;
	}
	
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		return tables[numEntite].reserver(formulaire);
	}
	
	
	
	//Classe Interne Table
	
	private class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbrChaises;
		private CalendrierAnnuel carnetReservation;
		private CalendrierAnnuel calendrierDeuxiemeService;
		private int identifiant;
		private FormulaireRestaurant formulaire;
		

		public Table(CalendrierAnnuel carnetReservation, int identifiant, FormulaireRestaurant formulaire, int nbrChaises) {
			super(carnetReservation, identifiant, formulaire);
			this.nbrChaises=nbrChaises;
		}
		

		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			int jour = formulaire.getJour();
			int mois = formulaire.getMois();
			int numService = formulaire.getNumService();
			if(numService==1) {
				if(!carnetReservation.estLibre(jour, mois)) {
					return null;
				}
				carnetReservation.reserver(jour,mois);
				return new ReservationRestaurant(jour, mois, numService, identifiant);
			}
			else {
				if(!calendrierDeuxiemeService.estLibre(jour, mois)) {
					return null;
				}
				calendrierDeuxiemeService.reserver(jour, mois);
				return new ReservationRestaurant(jour, mois, numService, identifiant);
			}

		}


		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			int numService = formulaire.getNumService();
			if(numService==1) {
				return (formulaire.getNombrePersonnes() == nbrChaises && estLibre(formulaire));
			}
			else {
				int jour = formulaire.getJour();
				int mois = formulaire.getMois();
				return (formulaire.getNombrePersonnes() == nbrChaises && calendrierDeuxiemeService.estLibre(jour, mois));
			}
			
		}


	}


}
