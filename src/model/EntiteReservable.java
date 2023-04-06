package model;

public abstract class EntiteReservable <P extends Formulaire> {
	private CalendrierAnnuel carnetReservation;
	private int identifiant;
	private P formulaire;
	
	public EntiteReservable(CalendrierAnnuel carnetReservation, int identifiant, P formulaire) {
		this.carnetReservation=carnetReservation;
		this.identifiant=identifiant;
		this.formulaire=formulaire;
	}
	
	
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	
	public boolean estLibre(P formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return this.carnetReservation.estLibre(jour, mois);
	}

	public abstract Reservation reserver(P formulaire);
	
	public abstract boolean compatible(P formulaire);

}
