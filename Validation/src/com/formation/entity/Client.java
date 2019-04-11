package com.formation.entity;

import java.io.Serializable;

public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nom;
	private String prenom;
	private boolean editable;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", editable=" + editable + "]";
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		
	}
	

}
