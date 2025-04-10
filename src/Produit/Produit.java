package Produit;

public abstract class Produit {
	protected String nom;
	protected Unite unite;
	
	protected Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public abstract String decrireProduit();
	
		
}