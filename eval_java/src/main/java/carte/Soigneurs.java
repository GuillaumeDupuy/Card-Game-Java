package carte;

import jeu.Cout;

public class Soigneurs extends Cout {

	private String name;
	private int heal;
	private String description;
	
	public Soigneurs(String name, int heal, String description, int cout) {
		this.name = name;
		this.heal = heal;
		this.description = description;
		super.cout = cout;
		System.out.println("Soigneurs");
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHeal() {
		return heal;
	}
	
	public void setHeal(int heal) {
		this.heal = heal;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		String value = "Soigneurs";
		value += "- coût :" + this.cout;
		value += "- nom :" + this.name;
		value += "- point de soin :" + this.heal;
		value += "- description :" + this.description;
		return value;
	}

}
