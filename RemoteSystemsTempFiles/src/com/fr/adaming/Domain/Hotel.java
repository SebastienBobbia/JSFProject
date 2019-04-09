package com.fr.adaming.Domain;

	

	import java.util.ArrayList;
	import java.util.List;

import javax.faces.event.ValueChangeEvent;

	public class Hotel {

		public String nom;
		public String pays;
		public String city;
		public double price;
		public boolean pool;
		public boolean animal;
		public boolean wifi;
		
		//Hotel france
		Hotel hotel1 = new Hotel("Belle Vue ***", "France","Lannion",60,false,true,true);
		Hotel hotel2 = new Hotel("Hotel des Bains **","France","La Ciotat",59.99,false,true,true);
		Hotel hotel3 = new Hotel("Camping des Pins ***","France","Trebeurden",25,false,true,true);
		Hotel hotel4 = new Hotel("Le Victoria ***","France","Cassis",72.50,false,true,true);
		Hotel hotel5 = new Hotel("Le Golden Oak ****","France","Aubagne",80,true,false,true);
		Hotel hotel6 = new Hotel("Grand Hotel du parc ***","France","Marseille",75.50,false,false,true);
		Hotel hotel7 = new Hotel("Le Graziela ***","France","Doizieux",38,false,true,true);
		Hotel hotel8 = new Hotel("Le Longchamp ****","France","Biscarosse",45,false,false,true);
		Hotel hotel9 = new Hotel("Hotel de l'Océan ***","France","Martigues",28,false,true,true);
		Hotel hotel10 = new Hotel("Camping Les vagues ***","France","Bayonne",22,true,true,true);
		
		//Hotel Tahiti
		Hotel hotel11 = new Hotel("Les flots bleus ***","Tahiti","To'ahotu",45,false,true,true);
		Hotel hotel12= new Hotel("Camping des cocotiers ***","Tahiti","Mahina",35,true,true,true);
		Hotel hotel13 = new Hotel("Village des cabanons ****","Tahiti","Mahina",75.5,true,true,true);
		Hotel hotel14 = new Hotel("Camping Chez Lou **","Tahiti","Mahaena",30,false,true,false);
		Hotel hotel15 = new Hotel("Le Marina ****","Tahiti","Mahina",89.90,true,true,true);
		Hotel hotel16 = new Hotel("Club Mediterranée***","Tahiti","Papeete",50,true,true,true);
		Hotel hotel17 = new Hotel("Tetiaroa****","Tahiti","Faaone",80,true,true,true);
		Hotel hotel18 = new Hotel("L'Hibiscus***","Tahiti","Papeete",48.90,false,true,true);
		Hotel hotel19 = new Hotel("Camping les tiarés***","Tahiti","Papeete",37.90,true,true,true);
		Hotel hotel20 = new Hotel("Manava***","Tahiti","Mahaena",53.2,false,true,true);
		
		//Hotel Chine
		Hotel hotel21= new Hotel("Tianzi ***","Chine","Shangai",80.2,false,true,true);
		Hotel hotel22= new Hotel("Love Hotel ****","Chine","Shangai",90.5,true,true,true);
		Hotel hotel23 = new Hotel("Batman ***","Chine","Taiwan",110,false,true,true);
		Hotel hotel24 = new Hotel("Royal View ****", "Chine","Taizhou",85,true,true,true);
		Hotel hotel25= new Hotel("L'empereur **","Chine","Taizhou",60,false,true,true);
		Hotel hotel26= new Hotel("Village vacances ***","Chine","Taiwan",70,false,true,true);
		Hotel hotel27= new Hotel("Le Shenzen ***","Chine","Hong-Kong",55.5,false,true,true);
		Hotel hotel28= new Hotel("Bonham Hotel ***","Chine","Hong-Kong",66,false,true,true);
		Hotel hotel29= new Hotel("Shūshì de jiā **","Chine","Hong-Kong",55,false,true,true);
		Hotel hotel30 = new Hotel("Lǜsè lǐngyù ***","Chine","Hong-Kong",65.9,false,true,true);

		//Hotel Autriche
		Hotel hotel31= new Hotel("Kényelmes otthon ***","Autriche","Thumersbach",75,false,true,true);
		Hotel hotel32= new Hotel("Fenyők ***","Autriche","Oggau am Neusiedler See",70,false,true,true);
		Hotel hotel33 = new Hotel("Le Rissman ****","Autriche","Oggau am Neusiedler See",85.50,false,true,true);
		Hotel hotel34 = new Hotel("Faház ***","Autriche","Salzbourg",55,true,true,true);
		Hotel hotel35= new Hotel("A Homan ****","Autriche","Salzbourg",89.9,true,true,true);
		Hotel hotel36= new Hotel("A Wagner ****","Autriche","Salzbourg",90.5,true,true,true);
		Hotel hotel37= new Hotel("Camping des Sapins ***","Autriche","Vienne",55,false,true,true);
		Hotel hotel38= new Hotel("Camping Zell am See **","Autriche","Zell am See",53.2,true,true,true);
		Hotel hotel39= new Hotel("St Georg***","Autriche","Thumersbach",65,false,true,true);
		Hotel hotel40 = new Hotel("Seevilla****","Autriche","Vienne",80,false,true,true);
		
		//Hotel Espagne
		Hotel hotel41= new Hotel("L'Aguirre ****","Espagne","Bilbao",75,true,true,true);
		Hotel hotel42= new Hotel("En Alcaraz ***","Espagne","Bilbao",62,true,false,true);
		Hotel hotel43 = new Hotel("La Casa di Mama ***","Espagne","Getxo",55.50,false,true,true);
		Hotel hotel44 = new Hotel("Camping Granada ***","Espagne","Torrent",45,true,true,true);
		Hotel hotel45= new Hotel("Palatio de Ines ****","Espagne","Torrent",53.2,true,true,true);
		Hotel hotel46= new Hotel("Torre del Toro **","Espagne","Port de Sagunt",42.5,false,true,true);
		Hotel hotel47= new Hotel("Aparto di Jardines ***","Espagne","Cullera",58,true,true,true);
		Hotel hotel48= new Hotel("Bahia di Maria ***","Espagne","Monte Faro",53.2,false,true,true);
		Hotel hotel49= new Hotel("Madison","Espagne","Almeria ****",72.50,true,true,true);
		Hotel hotel50 = new Hotel("Camping Adriano **","Espagne","Getxo",30.2,false,true,true);
		
		

		public Hotel(String pays, String city, String string, double price, boolean pool, boolean animal, boolean b) {
			super();
			this.pays = pays;
			this.city = city;
			this.price = price;
			this.pool = pool;
			this.animal = animal;
		}

		
		public Hotel(String string, String string2, double d, boolean b, boolean c, boolean e) {
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

	}


		
	
	
	
	

