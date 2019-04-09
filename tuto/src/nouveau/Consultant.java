package nouveau;

import java.util.Date;

public class Consultant extends Personnes {

	private String specialiT;
	private int disponibiliT;

	public Consultant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consultant(String nom, String prenom, Date dateNaissance) {
		super(nom, prenom, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	public Consultant(String specialiT, int disponibiliT) {
		super();
		this.specialiT = specialiT;
		this.disponibiliT = disponibiliT;
	}

	public Consultant(String nom, String prenom, Date dateNaissance, String specialiT, int disponibiliT) {
		super(nom, prenom, dateNaissance);
		this.specialiT = specialiT;
		this.disponibiliT = disponibiliT;
	}

	public String getSpecialiT() {
		return specialiT;
	}

	public void setSpecialiT(String specialiT) {
		this.specialiT = specialiT;
	}

	public int getDisponibiliT() {
		return disponibiliT;
	}

	public void setDisponibiliT(int disponibiliT) {
		this.disponibiliT = disponibiliT;
	}

	@Override
	public String toString() {
		return "Consultant  [" + " Prenom =" + getPrenom() + ", Nom =" + getNom() + ", Date de Naissance ="
				+ getDateNaissance() + ", specialité =" + specialiT + ", disponibilité =" + disponibiliT + "]";
	}

}
