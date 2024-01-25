package pockemon;

import java.util.Random;

public class Electric implements Atacable, Defensable {
	
	private static final String BOLA_VOLTIO = "BOLA_VOLTIO";
	private static final String XISPA = "XISPA";
	
	private static final String[] atacs = new String[] {BOLA_VOLTIO, XISPA};
	
	private String nom;
	private  int vida;
	private int danyBase;
	private int defensa;
	private int precisio;
	
	public Electric(String nom, int vida) {
		super();
		this.nom = nom;
		this.vida = vida;
		this.danyBase = 25;
		this.defensa = 15;
		this.precisio = 63;	
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
		
		if(atac.equals(BOLA_VOLTIO)) {
			return danyBase +   (int) Math.floor(Math.random() * (30 - 90 +1) + 30) + 12;
		}else {
			return danyBase +   (int) Math.floor(Math.random() * (30 - 90 +1) + 30) + 7;
		}
	}
	
	
	
}
