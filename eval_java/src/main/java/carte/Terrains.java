package carte;

import jeu.Cout;

public class Terrains extends Cout {
	
	private Couleurs couleurs;
	
	public Couleurs getCouleurs() {
		return couleurs;
	}
	
	public void setCouleur(Couleurs couleurs) {
		this.couleurs = couleurs;
	}
	
	public String toString() {
		String value = "Terrain";
		value += "- cout :" + this.cout;
		value += "- couleur :" + this.couleurs;
		return value;
	}

	public Terrains(Couleurs couleurs) {
		this.couleurs = couleurs;
		super.cout = 0;
		System.out.println("Terrains");
	}

}
