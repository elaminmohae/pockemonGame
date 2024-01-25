package pockemon;

import java.util.Random;

public class Foc implements Atacable, Defensable {
	
	private static final String ASQUES = "ASQUES";
	private static final String LLANZALLAMES = "LLANZALLAMES";
	
	
	private static final String[] atacs = new String[] { ASQUES, LLANZALLAMES };
	
	private String nom;
	private  int vida;
	private int danyBase;
	private int defensa;
	private int precisio;
	
	public Foc(String nom, int vida) {
		super();
		this.nom = nom;
		this.vida = vida;
		this.danyBase = 20;
		this.defensa = 15;
		this.precisio = 72;	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public int getDefensa() {
		return defensa;
	}

	public int getPrecisio() {
		return precisio;
	}

	public int getAtac() {
		int rnd = new Random().nextInt(atacs.length);
		String atac = atacs[rnd];
		
		if(atac.equals(ASQUES)) {
			return danyBase +   (int) Math.floor(Math.random() * (30 - 90 +1) + 30) + 12;
		}else {
			return danyBase +   (int) Math.floor(Math.random() * (30 - 90 +1) + 30) + 4;
		}
	}
	
	
	
}
