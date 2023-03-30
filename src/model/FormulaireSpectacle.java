package model;

public class FormulaireSpectacle extends Formulaire{
	private int jour;
	private int mois;
	private int numZone;
	private int numChaise;

	public FormulaireSpectacle(int jour, int mois,int numZone,int numChaise) {
		super(jour, mois);
		this.numZone=numZone;
		this.numChaise=numChaise;
	}

}
