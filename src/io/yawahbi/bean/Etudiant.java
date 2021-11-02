package io.yawahbi.bean;

public class Etudiant {
	
//	Attributes
	String numApogee;
	String nom;
	String prenom;
	String numTel;
	String adresseMail;
	String filiere;
	
//	Constructors
	public Etudiant() {
		super();
	}
	
	public Etudiant(String numApogee, String nom, String prenom, String numTel, String adresseMail, String filiere) {
		super();
		this.numApogee = numApogee;
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.adresseMail = adresseMail;
		this.filiere = filiere;
	}

//	Setters & Getters
	public String getNumApogee() {
		return numApogee;
	}
	public void setNumApogee(String numApogee) {
		this.numApogee = numApogee;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getAdresseMail() {
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	
}
