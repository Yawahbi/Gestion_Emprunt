package io.yawahbi.bean;

public class Emprunt {
	
//	Attributes
	String reference;
	String date;
	String periode;
	
//	Constructors
	public Emprunt() {
		super();
	}
	
	public Emprunt(String reference, String date, String periode) {
		super();
		this.reference = reference;
		this.date = date;
		this.periode = periode;
	}
	
//	Setters & Getters
	

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}


	
}
