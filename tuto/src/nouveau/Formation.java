package nouveau;

import java.util.Date;
import java.util.List;

public class Formation {

	private String titre;
	private String description;
	private Date dateFormation;
	private List listeApprenants;

	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formation(String titre, String description, Date dateFormation) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateFormation = dateFormation;

	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateFormation() {
		return dateFormation;
	}

	public void setDateFormation(Date dateFormation) {
		this.dateFormation = dateFormation;
	}

	@Override
	public String toString() {
		return "Formation [titre=" + titre + ", description=" + description + ", dateFormation=" + dateFormation + "]";
	}

}
