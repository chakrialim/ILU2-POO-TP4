package produit;

public enum Unite {
	KILOGRAMME("kg"), GRAMME("g"), LITRE("l"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE("piece");
	private String nom;

	private Unite(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}

}
