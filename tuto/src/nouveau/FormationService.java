package nouveau;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FormationService implements Icrud {

	ArrayList listeFormations = new ArrayList();
	boolean fail = false;
	ConnectionaSQL c = new ConnectionaSQL();
	ResultSet r = null;

	public void ajouter() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Entrez le titre");
		Scanner sc1 = new Scanner(System.in);
		String titre = sc1.nextLine();

		System.out.println("Entrez la description");
		Scanner sc2 = new Scanner(System.in);
		String description = sc2.nextLine();

		String dateNaissanceS = "00/00/0000";
		Date dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissanceS);
		do {
			try {
				fail = false;
				System.out.println("Entrez la date de début au format jj/mm/aaaa");
				Scanner sc3 = new Scanner(System.in);
				dateNaissanceS = sc3.nextLine();
				dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissanceS);
			} catch (java.text.ParseException eP) {
				System.out.println(
						"Date au mauvais format");
				fail = true;
			}
		} while (fail == true);
		
		SimpleDateFormat formatSQL = new SimpleDateFormat("yyyy-MM-dd");
		String dateSQL = formatSQL.format(dateNaissance);

		// arraylist listeApprenants;

		Formation a1 = new Formation(titre, description, dateNaissance);

		c.requestSQL("insert into cycleformation (titre, descriptio, dateFormation) values ('" + titre + "', '" + description + "','" + dateSQL + "')");
	}

	@Override
	public void supprimer() throws SQLException {
		// TODO Auto-generated method stub

		System.out.println("Indiquez le titre du cycle de formation que vous souhaitez supprimer : \n");
		Scanner sc5 = new Scanner(System.in);
		String recherche = sc5.nextLine();

		 r = c.resultSQL("select * from cycleformation where titre like ('%"+recherche+"%') ;");
		 
		int match = 0;
		   while (r.next()) {
	            match=match+1;
	        }   
		   
		if (match > 1) {

			 r = c.resultSQL("select * from cycleformation where titre like ('%"+recherche+"%') ;");
			
			 System.out.println("Il y a " + match
					+ " cycles de formation qui correspondent au nom que vous avez spécifié, vous allez donc nous aider à déterminer lequel vous souhaitez supprimer :)");

			 while (r.next())  {
				System.out.println("Dites moi, est ce que c'est le cycle de formation ci-dessous que vous souhaitez supprimer ?\n Appuyez 1 si oui ou 2 sinon");
				String letitre = r.getString("titre");
                String ledescription = r.getString("descriptio");
                Date ledateF = r.getDate("dateFormation");
                System.out.println("[Titre : " + letitre + ", Description : " + ledescription+ ", Date de début de formation : " + ledateF + "]");
				Scanner sc44 = new Scanner(System.in);
				int trouve = sc44.nextInt();
				if (trouve == 1) {

                    c.requestSQL("delete from cycleformation where titre ='" + letitre + "' AND descriptio ='" + ledescription + "'AND dateFormation='" + ledateF +  "';");

					break;
				}

			}

		} else if (match == 1) {

			 String letitre=""	;
		        r = c.resultSQL("select * from cycleformation where titre like ('%"+recherche+"%') ;");
		        while(r.next()) {
		            letitre = r.getString("titre");
		        }
		        
		 c.requestSQL("delete from consultant where titre ='" + letitre + "';");
		 
		}
		        else {
			System.out.println(
					"Désolé je ne trouve pas le cycle de formation que vous souhaitez supprimer ... verifiez que vous avez correctement indiqué le titre du cycle de formation qui existe dans la liste. Si nécessaire allez checker la liste et revenez me voir plus tard");
		}

	}

	@Override
	public void consulter() throws SQLException {
		// TODO Auto-generated method stub

		r = c.resultSQL("select * from cycleformation");
		
		while (r.next()) {
			// imprime les éléments du tuple
			String letitre = r.getString("titre");
			String ledescription = r.getString("descriptio");
			Date ledateD = r.getDate("dateFormation");
			System.out.println("[Titre : " + letitre + ", Description : " + ledescription + ", Date de début : " + ledateD + "]");
		}

	}

	@Override
	public void rechercher() throws SQLException {
		// TODO Auto-generated method stub

		System.out.println("Recherche un cycle de formation par son titre : \nQuel nom de famille rechercher ? \n");
        Scanner sc5 = new Scanner(System.in);
        String recherche = sc5.nextLine();
        int match = 0;
       
        r = c.resultSQL("select * from cycleformation where titre like ('%"+recherche+"%') ;");
        while (r.next()) {
            match=match+1;
        }

        if (match>=1) {
        	System.out.println("Trouvé dans la liste " + match
                    + " fois (nombre de cycle de formation qui contiennent le terme recherché)");
        	
        	 r = c.resultSQL("select * from cycleformation where titre like ('%"+recherche+"%') ;");
             
             System.out.println("Voici le résultat de votre recherche :");

             while (r.next()) {
                 
            	String letitre = r.getString("titre");
     			String ledescription = r.getString("descriptio");
     			Date ledateD = r.getDate("dateFormation");
     			System.out.println("[Titre : " + letitre + ", Description : " + ledescription + ", Date de début : " + ledateD + "]");
     		}
        }
        
        else {
            System.out.println("Désolé je ne trouve pas");
        }
        
	}

}
