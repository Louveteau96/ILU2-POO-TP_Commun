package model;

public class ReservationRestaurant implements Reservation {
	private int jour;
	private int mois;
	private int numService;
	private int numTable;
	
	//Constructeur
	public ReservationRestaurant(int jour,int mois,int numService,int numTable) {
		this.jour = jour;
		this.mois = mois;
		this.numService=numService;
		this.numTable=numTable;
	}
	
	//Méthodes
	public String toString() {
		String service;
		if(numService==1) {
			service = "premier service.\n";
		}
		else {
			service="deuxième service.\n";
		}
		return("Le "+jour+"/"+mois+" : table n°"+numTable+" pour le "+service);
	}
}
