package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal {
	Gaulois getVendeur();

	int contientProduit(String produit, int quantiteSouhaitee);

	int acheterProduit(int quantiteSouhaitee);

	String etatEtal();

	boolean installerVendeur(Gaulois obelix, Produit[] sangliersObelix, int i);

}
