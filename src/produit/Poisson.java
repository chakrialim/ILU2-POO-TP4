package produit;

public class Poisson extends Produit {
	private String dateDePeche;
	
	public Poisson(String dateDePeche) {
		super("poisson", Unite.PIECE);
		this.dateDePeche = dateDePeche;
	
	}

	@Override
	public String decrireProduit() {
		StringBuilder texte = new StringBuilder();
		texte.append("poisson peches " + dateDePeche);
		return texte.toString();
	}
	
	

}
