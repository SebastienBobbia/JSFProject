package com.fr.adaming.Domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.fr.adaming.Domain.Pays;

@ManagedBean
@ViewScoped
public class DecisionBean implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	
	public String nomPays ="France";
	
	ArrayList<Hotel> listHotel = new ArrayList<Hotel>();
	ArrayList<Pays> listPays= new ArrayList<Pays>();

	@PostConstruct
	public void init(){
		
			listHotel.add(new Hotel("Belle Vue ***", "France","Lannion",60,false,true,true, "http://localhost:8080/AgenceVoyages/photo4.jpg"));
			listHotel.add(new Hotel("Hotel des Bains **","France","La Ciotat",59.99,false,true,true, "http://localhost:8080/AgenceVoyages/photo2.jpg"));
			listHotel.add(new Hotel("Camping des Pins ***","France","Trebeurden",25,false,true,true,"http://localhost:8080/AgenceVoyages/camping1.jpg"));
			listHotel.add(new Hotel("Le Victoria ***","France","Cassis",72.50,false,true,true,"http://localhost:8080/AgenceVoyages/photo0.jpg"));
			listHotel.add(new Hotel("Le Golden Oak ****","France","Aubagne",80,true,false,true, "http://localhost:8080/AgenceVoyages/photo1.jpg"));
			listHotel.add(new Hotel("Grand Hotel du parc ***","France","Marseille",75.50,false,false,true, "http://localhost:8080/AgenceVoyages/photo5.jpg"));
			listHotel.add(new Hotel("Le Graziela ***","France","Doizieux",38,false,true,true,"http://localhost:8080/AgenceVoyages/photo6.jpg"));
			listHotel.add(new Hotel("Le Longchamp ****","France","Biscarosse",45,false,false,true,"http://localhost:8080/AgenceVoyages/photo7.jpg"));
			listHotel.add(new Hotel("Hotel de l'Océan ***","France","Martigues",28,false,true,true, "http://localhost:8080/AgenceVoyages/photo3.jpg"));
			listHotel.add(new Hotel("Camping Les vagues ***","France","Bayonne",22,true,true,true,"http://localhost:8080/AgenceVoyages/camping0.jpg"));
			
			listHotel.add(new Hotel("Les flots bleus ***","Tahiti","To'ahotu",45,false,true,true,"http://localhost:8080/AgenceVoyages/photo3.jpg"));
			listHotel.add(new Hotel("Camping des cocotiers ***","Tahiti","Mahina",35,true,true,true,"http://localhost:8080/AgenceVoyages/camping2.jpg"));
			listHotel.add(new Hotel("Village des cabanons ****","Tahiti","Mahina",75.5,true,true,true,"http://localhost:8080/AgenceVoyages/camping1.jpg"));
			listHotel.add(new Hotel("Camping Chez Lou **","Tahiti","Mahaena",30,false,true,false, "http://localhost:8080/AgenceVoyages/photo2.jpg"));
			listHotel.add(new Hotel("Le Marina ****","Tahiti","Mahina",89.90,true,true,true,"http://localhost:8080/AgenceVoyages/photo4.jpg"));
			listHotel.add(new Hotel("Club Mediterranée***","Tahiti","Papeete",50,true,true,true,"http://localhost:8080/AgenceVoyages/photo5.jpg"));
			listHotel.add(new Hotel("Tetiaroa****","Tahiti","Faaone",80,true,true,true,"http://localhost:8080/AgenceVoyages/photo6.jpg"));
			listHotel.add(new Hotel("L'Hibiscus***","Tahiti","Papeete",48.90,false,true,true, "http://localhost:8080/AgenceVoyages/photo0.jpg"));
			listHotel.add(new Hotel("Camping les tiarés***","Tahiti","Papeete",37.90,true,true,true,"http://localhost:8080/AgenceVoyages/camping0.jpg"));
			listHotel.add(new Hotel("Manava***","Tahiti","Mahaena",53.2,false,true,true, "http://localhost:8080/AgenceVoyages/photo1.jpg"));
			
			listHotel.add(new Hotel("Tianzi ***","Chine","Shangai",80.2,false,true,true, "http://localhost:8080/AgenceVoyages/photo4.jpg"));
			listHotel.add(new Hotel("Love Hotel ****","Chine","Shangai",90.5,true,true,true,"http://localhost:8080/AgenceVoyages/photo6.jpg"));
			listHotel.add(new Hotel("Batman ***","Chine","Taiwan",110,false,true,true,"http://localhost:8080/AgenceVoyages/photo3.jpg"));
			listHotel.add(new Hotel("Royal View ****", "Chine","Taizhou",85,true,true,true,"http://localhost:8080/AgenceVoyages/photo7.jpg"));
			listHotel.add(new Hotel("L'empereur **","Chine","Taizhou",60,false,true,true, "http://localhost:8080/AgenceVoyages/photo0.jpg"));
			listHotel.add(new Hotel("Village vacances ***","Chine","Taiwan",70,false,true,true,"http://localhost:8080/AgenceVoyages/camping0.jpg"));
			listHotel.add(new Hotel("Le Shenzen ***","Chine","Hong-Kong",55.5,false,true,true, "http://localhost:8080/AgenceVoyages/photo1.jpg"));
			listHotel.add(new Hotel("Bonham Hotel ***","Chine","Hong-Kong",66,false,true,true, "http://localhost:8080/AgenceVoyages/photo2.jpg"));
			listHotel.add(new Hotel("Shūshì de ji�? **","Chine","Hong-Kong",55,false,true,true,"http://localhost:8080/AgenceVoyages/photo5.jpg"));
			listHotel.add(new Hotel("Lǜsè l�?ngyù ***","Chine","Hong-Kong",65.9,false,true,true,"http://localhost:8080/AgenceVoyages/campingchine.jpg"));
			
			listHotel.add(new Hotel("Kényelmes otthon ***","Autriche","Thumersbach",75,false,true,true,"http://localhost:8080/AgenceVoyages/photo1.jpg"));
			listHotel.add(new Hotel("Fenyők ***","Autriche","Oggau am Neusiedler See",70,false,true,true,"http://localhost:8080/AgenceVoyages/photo3.jpg"));
			listHotel.add(new Hotel("Le Rissman ****","Autriche","Oggau am Neusiedler See",85.50,false,true,true, "http://localhost:8080/AgenceVoyages/photo5.jpg"));
			listHotel.add(new Hotel("Faház ***","Autriche","Salzbourg",55,true,true,true, "http://localhost:8080/AgenceVoyages/photo2.jpg"));
			listHotel.add(new Hotel("A Homan ****","Autriche","Salzbourg",89.9,true,true,true, "http://localhost:8080/AgenceVoyages/photo4.jpg"));
			listHotel.add(new Hotel("A Wagner ****","Autriche","Salzbourg",90.5,true,true,true,"http://localhost:8080/AgenceVoyages/photo6.jpg"));
			listHotel.add(new Hotel("Camping des Sapins ***","Autriche","Vienne",55,false,true,true,"http://localhost:8080/AgenceVoyages/camping3.jpg"));
			listHotel.add(new Hotel("Camping Zell am See **","Autriche","Zell am See",53.2,true,true,true,"http://localhost:8080/AgenceVoyages/camping0.jpg"));
			listHotel.add(new Hotel("St Georg***","Autriche","Thumersbach",65,false,true,true, "http://localhost:8080/AgenceVoyages/photo0.jpg"));
			listHotel.add(new Hotel("Seevilla****","Autriche","Vienne",80,false,true,true,"http://localhost:8080/AgenceVoyages/photo7.jpg"));
			
			listHotel.add(new Hotel("L'Aguirre ****","Espagne","Bilbao",75,true,true,true,"http://localhost:8080/AgenceVoyages/photo3.jpg"));
			listHotel.add(new Hotel("En Alcaraz ***","Espagne","Bilbao",62,true,false,true,"http://localhost:8080/AgenceVoyages/photo4.jpg"));
			listHotel.add(new Hotel("La Casa di Mama ***","Espagne","Getxo",55.50,false,true,true, "http://localhost:8080/AgenceVoyages/photo2.jpg"));
			listHotel.add(new Hotel("Camping Granada ***","Espagne","Torrent",45,true,true,true, "http://localhost:8080/AgenceVoyages/camping2.jpg"));
			listHotel.add(new Hotel("Palatio de Ines ****","Espagne","Torrent",53.2,true,true,true,"http://localhost:8080/AgenceVoyages/photo6.jpg"));
			listHotel.add(new Hotel("Torre del Toro **","Espagne","Port de Sagunt",42.5,false,true,true,"http://localhost:8080/AgenceVoyages/photo5.jpg"));
			listHotel.add(new Hotel("Aparto di Jardines ***","Espagne","Cullera",58,true,true,true,"http://localhost:8080/AgenceVoyages/photo7.jpg"));
			listHotel.add(new Hotel("Bahia di Maria ***","Espagne","Monte Faro",53.2,false,true,true,"http://localhost:8080/AgenceVoyages/camping0.jpg"));
			listHotel.add(new Hotel("Madison ****","Espagne","Almeria",72.50,true,true,true, "http://localhost:8080/AgenceVoyages/photo0.jpg"));
			listHotel.add(new Hotel("Camping Adriano **","Espagne","Getxo",30.2,false,true,true, "http://localhost:8080/AgenceVoyages/camping1.jpg"));
			
			listPays.add(new Pays("France", "La France est la première destination touristique au monde, et ce n'est pas pour rien ! Découvrez le charme des marées le long des immenses plages de Bretagne. La Provence offre une multitude de facettes qui n'attendent que vous. Entre terre et mer, "
					+ "				le Pays basque sastisfait toutes les envies", "image3.jpg" ));
			listPays.add(new Pays("Tahiti", "La Polynésie Française est un véritable paradis où vous pourrez plonger dans les eaux transparentes de l'océan pacifique et vous prélassez au pied des cocotiers.","image0.jpg"));
			listPays.add(new Pays("Chine","Découvrez les paysages spéctaculaires et les incontournables de la Chine !","image1.jpg"));
			listPays.add(new Pays("Autriche","L'Autriche est un pays séduisant par son offre de loisirs sportifs, ses nombreux monuments et musées, sans oublier ses paysages somptueux.","image2.jpg"));
			listPays.add(new Pays("Espagne", "L'Espagne possède une diversité de sites à visiter ! ","image4.jpg"));
			

	}


	public String getNomPays() {
		return nomPays;
	}

	public void showHotel(){
		System.out.println(data);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}


	private String data;
	  public String getData() {
	      return data;
	   }

	   public void setData(String data) {
	      this.data = data;
	   }

	
		   List<Hotel> result = new ArrayList<Hotel>();
			
			public List<Hotel> test() {
				for (Hotel hotel : listHotel) 	{		
				if ((hotel.getPays()).equals(data))  {
			        result.add(hotel);
				}
			    }
				
		return result;
			}		
		
//Animaux
			List<Hotel> result2 = new ArrayList<Hotel>();
			String logoAnimal = "";
			public String animaux() {
				for (Hotel hotel : listHotel) 	{		
				if (hotel.isAnimal()==true)  {
				String logoAnimal = "http://localhost:8080/AgenceVoyages/animalOK.jpg";} //Si animaux acceptés, afficher logo animalOK
				else { String logoAnimal = "http://localhost:8080/AgenceVoyages/animalKO.jpg";} //Sinon afficher logo animalKO
			    }
			return logoAnimal;}
				
// Pareil pour piscine 
				List<Hotel> result3 = new ArrayList<Hotel>();
				String logoPool = " ";
				public String pool() {
					for (Hotel hotel : listHotel) 	{		
					if (hotel.isPool()==true)  {
					String logoPool = "lhttp://localhost:8080/AgenceVoyages/poolOK.jpg";}
					else { String logoPool = "http://localhost:8080/AgenceVoyages/poolKO.jpg";} }
				return logoPool;}
				
//Pareil pour wifi
				List<Hotel> result4 = new ArrayList<Hotel>();
				String logoWIfi = " ";
				public String wifi() {
					for (Hotel hotel : listHotel) 	{		
					if (hotel.isWifi()==true)  {
					String logoWifi = "lhttp://localhost:8080/AgenceVoyages/wifiOK.jpg";}
					else { String logoWifi = "http://localhost:8080/AgenceVoyages/wifiKO.jpg";} }
				return logoPool;}
				
			
			}
				
				
		
			



