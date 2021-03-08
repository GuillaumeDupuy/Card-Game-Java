package jeu;

import java.util.ArrayList;

public class Jeu {

	private ArrayList<Cout> main;
	private int main_nb;

	public Jeu(int main_nb) {
		this.main = new ArrayList<Cout>();
		this.main_nb = main_nb;
	}

	public ArrayList<Cout> getMain() {
		return main;
	}

	public void setMain(ArrayList<Cout> main) {
		this.main = main;
	}

	public int getMain_nb() {
		return main_nb;
	}

	public void setMain_nb(int main_nb) {
		this.main_nb = main_nb;
	}

	public void piocher(Cout cartes) throws Exception {
		if (this.main.size() < this.main_nb){
			this.main.add(cartes);
		}else {
			throw new Exception("Jeu de cartes FULL");
		}
		
	}
	
	public void jouer() {
		System.out.println("Je joue une carte....");
		System.out.println(this.main.get(0));
		this.main.remove(0);
	}

}
