package io.yawahbi.bean;

public class Emprunt {
	
//	Attributes
	String reference;
	String date;
	int periode;
	
//	Constructors
	public Emprunt() {
		super();
	}
	
	public Emprunt(String reference, String date, int periode) {
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

	public int getPeriode() {
		return periode;
	}

	public void setPeriode(int periode) {
		this.periode = periode;
	}


	
}
