package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;
import produit.Produit;

public class Etal<P extends IProduit> implements IEtal {
	private Gaulois vendeur;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	int prix;
	private P[] produits;
	int nbProduit = 0;

	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}

	public int getQuantiteDebutMarche() {
		return quantiteDebutMarche;
	}

	public boolean installerVendeur(Gaulois vendeur, P[] produit, int prix) {
		this.vendeur = vendeur;
		this.prix = prix;
		produits = produit;
		nbProduit = produit.length;
		etalOccupe = true;
		return etalOccupe;
	}

	public boolean installerVendeur(Gaulois vendeur, Produit[] produit, int prix) {
		return installerVendeur(vendeur, (P[]) produit, prix);

	}

	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		int quantiteAVendre = 0;
		if (nbProduit != 0 && this.produits[0].getNom().equals(produit)) {
			if (nbProduit >= quantiteSouhaitee) {
				quantiteAVendre = quantiteSouhaitee;
			} else {
				quantiteAVendre = nbProduit;
			}
		}
		return quantiteAVendre;
	}

	@Override
	public int acheterProduit(int quantiteSouhaitee) {
		int prixPaye = 0;
		for (int i = nbProduit - 1; i > nbProduit - quantiteSouhaitee - 1 || i > 1; i--) {
			prixPaye += produits[i].calculerPrix(prix);
		}
		if (nbProduit >= quantiteSouhaitee) {
			nbProduit -= quantiteSouhaitee;
		} else {
			nbProduit = 0;
		}
		return prixPaye;
	}

	@Override
	public String etatEtal() {
		StringBuilder chaine = new StringBuilder(vendeur.getNom());
		if (nbProduit > 0) {
			chaine.append(" vend ");
			chaine.append(nbProduit + " produits :");
			for (int i = 0; i < nbProduit; i++) {
				chaine.append("\n- " + produits[i].decrireProduit());
			}
		} else {
			chaine.append(" n'a plus rien a vendre.");
		}
		chaine.append("\n");
		return chaine.toString();
	}

}
