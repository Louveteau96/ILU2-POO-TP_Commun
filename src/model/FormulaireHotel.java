package model;

public class FormulaireHotel extends Formulaire{
	private int jour;
	private int mois;
	private int numChambre;
	private int nbrLitSimple;
	private int nbrLitDouble;
	

	public FormulaireHotel(int jour, int mois,int nbrLitSimple,int nbrLitDouble,int numChambre) {
		super(jour, mois);
		this.nbrLitSimple=nbrLitSimple;
		this.nbrLitDouble=nbrLitDouble;
		this.numChambre=numChambre;
	}

}
