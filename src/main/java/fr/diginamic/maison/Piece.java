package fr.diginamic.maison;

public abstract class Piece {
	private int superficie;
	private int etage;
	
	public Piece(int superficie, int etage) {
		if (etage < 0 || superficie < 0)
			System.err.println("Veuillez rentrer des donn�es valides!\n -- ERREUR : valeur n�gative");
		else {
			this.superficie = superficie;
			this.etage = etage;
		}
	}

	public int getSuperficie() {
		return superficie;
	}

	public int getEtage() {
		return etage;
	}
	
	public abstract String getType();
	
}
