package villagegaulois;

import Produit.Produit;
import personnages.Gaulois;

public interface IEtal {

	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	int getQuantiteDebutMarche();

	Produit getProduit();

	void occuperEtal(Gaulois vendeur,Produit produit, int quantite);
	
	

}