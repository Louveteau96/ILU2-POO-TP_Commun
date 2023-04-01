package model;

public class ReservationSpectacle implements Reservation{
	private int jour;
	private int mois;
	private int numZone;
	private int numChaise;

	public ReservationSpectacle(int jour, int mois,int numZone,int numChaise) {
		this.jour = jour;
		this.mois = mois;
		this.numZone=numZone;
		this.numChaise=numChaise;
	}
	
	//Méthodes
		public String toString() {
			return(jour+"/"+mois+" : Zone "+numZone+" chaise n°"+numChaise);
		}

}
