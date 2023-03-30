package model;

public class ReservationHotel extends Reservation{
	private int jour;
	private int mois;
	private int nbrLitSimple;
	private int nbrLitDouble;
	private int numChambre;

	public ReservationHotel(int jour, int mois,int nbrLitSimple,int nbrLitDouble,int numChambre) {
		super(jour, mois);
		this.nbrLitSimple=nbrLitSimple;
		this.nbrLitDouble=nbrLitDouble;
		this.numChambre=numChambre;
	}
	

}
