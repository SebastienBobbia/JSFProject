package com.fr.adaming.Domain;

import java.io.Serializable;

public class Pays {

	public String nom;
	public String description;
	
	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pays(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}

	public String getNom() {
		System.out.println(nom);
		return nom;
		
	}

	public void setNom(String nom) {
		System.out.println(nom);
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", description=" + description + "]";
	}
	

}
