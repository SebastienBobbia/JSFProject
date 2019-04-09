
package com.fr.adaming.Domain;

public class Pays {
	public String NomPays;
	public String description;
	public String Image;
	

	public Pays(String nomPays, String description, String Image) {
		super();
		NomPays = nomPays;
		this.description = description;
		this.Image = Image;
	}



	public Pays(String string, String string2, String string3) {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	


	public String getImage() {
		return Image;
	}



	public void setImage(String image) {
		Image = image;
	}



	public void put(String nomPays,  String description, String Image) {
		// TODO Auto-generated method stub
		
	}

	public void add(Pays pays) {
		// TODO Auto-generated method stub
		
	}


}
