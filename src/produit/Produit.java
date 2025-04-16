package produit;

public abstract class Produit implements IProduit {
	protected String nom;
	protected Unite unite;
	protected int prix;

	protected Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}

	@Override
	public String getNom() {
		return nom;
	}

	public int calculerPrix(int prix) {
		return prix;
	}

}