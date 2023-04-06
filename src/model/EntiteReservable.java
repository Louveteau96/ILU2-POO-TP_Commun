package model;

public abstract class EntiteReservable <F extends Formulaire> {
	private CalendrierAnnuel carnetReservation;
	private int identifiant;
	private F formulaire;
	
	public EntiteReservable(CalendrierAnnuel carnetReservation, int identifiant, F formulaire) {
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
	
	public boolean estLibre(F formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return this.carnetReservation.estLibre(jour, mois);
	}

	public abstract Reservation reserver(F formulaire);
	
	public abstract boolean compatible(F formulaire);

}
