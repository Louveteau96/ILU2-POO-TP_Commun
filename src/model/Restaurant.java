package model;

public class Restaurant implements IEtablissement {
	private Table[] tables = new Table[100];
	
	public void ajouterTable(int nbrChaise) {
		
	}
	
	public int[] donnerPossibilitees(FormulaireRestaurant formulaire) {
		return null;
	}
	
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		return null;
	}
	
	
	
	//Classe Interne Table
	
	public class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbrChaises;
		private CalendrierAnnuel carnetReservation;
		private int identifiant;
		private FormulaireRestaurant formulaire;
		private CalendrierAnnuel calendrierDeuxiemeService;
		private CentraleReservation<EntiteReservable<FormulaireRestaurant>, FormulaireRestaurant> centraleReservation;
		

		public Table(CalendrierAnnuel carnetReservation, int identifiant, FormulaireRestaurant formulaire, int nbrChaises) {
			super(carnetReservation, identifiant, formulaire);
			this.nbrChaises=nbrChaises;
		}
		

		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			return (formulaire.getNombrePersonnes() == nbrChaises);
		}


	}


}
