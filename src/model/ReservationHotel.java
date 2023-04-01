package model;

public class ReservationHotel implements Reservation{
	private int jour;
	private int mois;
	private int nbrLitSimple;
	private int nbrLitDouble;
	private int numChambre;

	public ReservationHotel(int jour, int mois,int nbrLitSimple,int nbrLitDouble,int numChambre) {
		this.jour = jour;
		this.mois = mois;
		this.nbrLitSimple=nbrLitSimple;
		this.nbrLitDouble=nbrLitDouble;
		this.numChambre=numChambre;
	}
	
	//Méthodes
		public String toString() {
			return("Le "+jour+"/"+mois+" : chambre n°"+numChambre+"\n- "+nbrLitSimple+" Lits simple\n- "+nbrLitDouble+"Lits double.");
		}
	

}
