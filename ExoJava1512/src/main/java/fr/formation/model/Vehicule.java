package fr.formation.model;

public abstract class Vehicule {
	private String couleur;
	private double poid;
	
	public Vehicule(String couleur,double poid) {
		this.couleur = couleur;
		this.poid = poid;
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public double getPoid() {
		return poid;
	}
	public void setPoid(double poid) {
		this.poid = poid;
	}
}
