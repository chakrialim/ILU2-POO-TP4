package villagegaulois;

import Produit.Poisson;
import Produit.Produit;
import personnages.Gaulois;

public class Etal <P extends Produit> implements IEtal {
	private Gaulois vendeur;
	private P produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;

	@Override
	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	@Override
	public int getQuantite() {
		return quantite;
	}
	
	@Override
	public int getQuantiteDebutMarche() {
		return quantiteDebutMarche;
	}
	
	@Override
	public Produit getProduit() {
		return produit;
	}

	@Override
	public void occuperEtal(Gaulois vendeur, Produit produit, int quantite) {
		this.vendeur = vendeur;
		this.produit = (P) produit;
		this.quantite = quantite;
		
	}
	

	

}
