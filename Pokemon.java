package pockemon;

public abstract class Pokemon {
	private String nomPokemon;
	private int energiaAtac;
	private int vida;
	private int danyBase;
	private int defensa;
	private int precisio;
	
	public Pokemon(String nomPokemon, int danyBase, int defensa, int precisio) {
		super();
		this.nomPokemon = nomPokemon;
		this.energiaAtac = 100;
		this.vida = (int) Math.floor(Math.random() * (250 - 400 + 1) + 250);
		this.danyBase = danyBase;
		this.defensa = defensa;
		this.precisio = precisio;
	}

	public String getNomPokemon() {
		return nomPokemon;
	}

	public void setNomPokemon(String nomPokemon) {
		this.nomPokemon = nomPokemon;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDanyBase() {
		return danyBase;
	}

	public void setDanyBase(int danyBase) {
		this.danyBase = danyBase;
	}

	public int getPrecisio() {
		return precisio;
	}

	public void setPrecisio(int precisio) {
		this.precisio = precisio;
	}

	public int getEnergiaAtac() {
		return energiaAtac;
	}

	public int getDefensa() {
		return defensa;
	}
	
	public void resetStats() {
		this.energiaAtac = 100;
		this.vida = (int) Math.floor(Math.random() * (250 - 400 + 1) + 250);
	}
	@Override
	public String toString() {
		return "Pokemon nomPokemon=" + nomPokemon + "\nenergiaAtac=" + energiaAtac + "\nvida=" + vida + "\ndanyBase="
				+ danyBase + "\ndefensa=" + defensa + "\nprecisio=" + precisio;
	}
	
	
	
	
}
