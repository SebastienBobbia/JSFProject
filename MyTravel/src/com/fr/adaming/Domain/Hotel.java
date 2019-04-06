package com.fr.adaming.Domain;

	

	import java.io.Serializable;

	public class Hotel implements Serializable {

		public String nom;
		public String pays;
		public String city;
		public double price;
		public boolean pool;
		public boolean animal;
		public boolean wifi;
		public String image;

		public Hotel(String nom, String pays, String city, double price,
				boolean pool, boolean animal, boolean wifi, String image) {
			super();
			this.nom = nom;
			this.pays = pays;
			this.city = city;
			this.price = price;
			this.pool = pool;
			this.animal = animal;
			this.wifi = wifi;
			this.image = image;
		}


		public Hotel() {
			super();
			// TODO Auto-generated constructor stub
		}


		public String getPays() {
			return pays;
		}


		public void setPays(String pays) {
			this.pays = pays;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public boolean isPool() {
			return pool;
		}


		public void setPool(boolean pool) {
			this.pool = pool;
		}


		public boolean isAnimal() {
			return animal;
		}


		public void setAnimal(boolean animal) {
			this.animal = animal;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public boolean isWifi() {
			return wifi;
		}


		public void setWifi(boolean wifi) {
			this.wifi = wifi;
		}


		public String getImage() {
			return image;
		}


		public void setImage(String image) {
			this.image = image;
		}

		
	}


		
	
	
	
	

