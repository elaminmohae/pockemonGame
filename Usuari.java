package pockemon;

import java.util.ArrayList;
import java.util.List;

public class Usuari {
	private String alies;
	private List<Pokemon> equip;
	
	public Usuari(String alies) {
		super();
		this.alies = alies;
		this.equip = new ArrayList(); 
	}

	public String getAlies() {
		return alies;
	}

	public void setAlies(String alies) {
		this.alies = alies;
	}

	public List<Pokemon> getEquip() {
		return equip;
	}

	public void setEquip(List<Pokemon> equip) {
		this.equip = equip;
	}
	
	public boolean addPokemon(Pokemon pokemon) {
		if (this.equip.size() <= 6) {
			this.equip.add(pokemon);
			return true;
		}
		return false;
	}
	
	
	
}
