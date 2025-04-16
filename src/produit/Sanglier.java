package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;

	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;

	}

	@Override
	public String decrireProduit() {
		StringBuilder texte = new StringBuilder();
		texte.append("sanglier de " + poids + " " + unite + " chasse par " + chasseur.getNom());
		return texte.toString();
	}

	@Override
	public int calculerPrix(int prix) {
		return prix * poids / 1000;
	}

}