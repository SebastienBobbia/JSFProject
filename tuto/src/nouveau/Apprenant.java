package nouveau;

import java.nio.file.Path;
import java.util.Date;

public class Apprenant extends Personnes {

	private String diplome;
	private Path cv;
	private String cycleFormation;

	public Apprenant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apprenant(String nom, String prenom, Date dateNaissance, String diplome, Path cv, String cycleFormation) {
		super(nom, prenom, dateNaissance);
		this.diplome = diplome;
		this.cv = cv;
		this.cycleFormation = cycleFormation;
	}

	public Apprenant(String diplome, Path cv, String cycleFormation) {
		super();
		this.diplome = diplome;
		this.cv = cv;
		this.cycleFormation = cycleFormation;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public Path getCv() {
		return cv;
	}

	public void setCv(Path cv) {
		this.cv = cv;
	}

	public String getCycleFormation() {
		return cycleFormation;
	}

	public void setCycleFormation(String cycleFormation) {
		this.cycleFormation = cycleFormation;
	}

	@Override
	public String toString() {
		return "Apprenant [ Nom =" + getNom() + ", Prenom=" + getPrenom() + ", Date de Naissance()="
				+ getDateNaissance() + "cv=" + cv + ", cycleFormation=" + cycleFormation + "]";
	}

}
