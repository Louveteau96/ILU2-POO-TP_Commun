package model;

public abstract class FormulaireRestaurant extends Formulaire{
	private int jour;
	private int mois;
	private int numTable;
	private int nbrPersonnes;
	private int numService;
	

	public FormulaireRestaurant(int jour, int mois,int numTable,int nbrPersonnes,int numService) {
		super(jour, mois);
		this.numTable=numTable;
		this.nbrPersonnes=nbrPersonnes;
		this.numService=numService;
	}
	

}
