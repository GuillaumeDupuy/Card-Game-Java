package carte;

import jeu.Cout;

public class Guerriers extends Cout {

	private String name;
	private int degats;
	private int hp;

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDegats() {
		return degats;
	}
	
	public void setDegats(int degats) {
		this.degats = degats;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String toString() {
		String value = "Soigneurs";
		value += "- coût :" + this.cout;
		value += "- nom :" + this.name;
		value += "- point de vie :" + this.hp;
		value += "- degats :" + this.degats;
		
		return value;
	}

	public Guerriers(String name, int degats, int hp, int cout) {
		this.name =  name;
		this.degats = degats;
		this.hp = hp;
		super.cout = cout;
		System.out.println("Guerriers");
	}

}
