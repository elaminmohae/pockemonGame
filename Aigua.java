package pockemon;

import java.util.Random;

public class Aigua implements Atacable, Defensable {
	
	private static final String PISTOLA_AIGUA = "PISTOLA DE AIGUA";
	private static final String HIDROBOMBA = "HIDROBOMBA";
	private static final String RAIG_BOMBOLLA = "RAIG_BOMBOLLA";
	
	private static final String[] atacs = new String[] { PISTOLA_AIGUA, HIDROBOMBA, RAIG_BOMBOLLA };
	
	private String nom;
	private  int vida;
	private int danyBase;
	private int defensa;
	private int precisio;
	
	public Aigua(String nom, int vida) {
		super();
		this.nom = nom;
		this.vida = vida;
		this.danyBase = 15;
		this.defensa = 10;
		this.precisio = 80;	
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
		
		if(atac.equals(HIDROBOMBA)) {
			return danyBase +   (int) Math.floor(Math.random() * (30 - 90 +1) + 30) + 13;
		}else if(atac.equals(PISTOLA_AIGUA)) {
			return danyBase +   (int) Math.floor(Math.random() * (30 - 90 +1) + 30) + 7;
		}else {
			return danyBase +   (int) Math.floor(Math.random() * (30 - 90 +1) + 30) + 5;
		}
	}

	public String getDefensa(Pokemon enemic, int atacEnemic) {
		int presicioAtac = enemic.getPrecisio() * 10;
		
	}
	
	
	
}
