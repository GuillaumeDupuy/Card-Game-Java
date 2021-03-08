package jeu;

import carte.Guerriers;
import carte.Soigneurs;

public class Play {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Jeu jeu = new Jeu(6);
		Cout carte_guerriers = new Guerriers("Chevalier", 8,40,20);
		Cout carte_soigneurs = new Soigneurs("Sorcier", 20,"Lance un sort de heal sur ces allies",10);
		
		jeu.piocher(carte_guerriers);
		jeu.piocher(carte_soigneurs);
		
		jeu.jouer();
		jeu.jouer();
	}

}
