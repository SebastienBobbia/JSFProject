package nouveau;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsultantService implements Icrud {

	boolean fail = false;
	ConnectionaSQL c = new ConnectionaSQL();
	ResultSet r = null;

	public void ajouter() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Entrez nom");
		Scanner sc1 = new Scanner(System.in);
		String nom = sc1.nextLine();

		System.out.println("Entrez prenom");
		Scanner sc2 = new Scanner(System.in);
		String prenom = sc2.nextLine();

		String dateNaissanceS = "00/00/0000";
		Date dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissanceS);
		do {
			try {
				fail = false;
		System.out.println("Entrez la date de naissance au format jj/mm/aaaa");
		Scanner sc3 = new Scanner(System.in);
		dateNaissanceS = sc3.nextLine();
		dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissanceS);
			}
		 catch (java.text.ParseException eP) {
				System.out.println("Date au mauvais format");
				fail = true;
			}
		} while (fail == true);
		
		SimpleDateFormat formatSQL = new SimpleDateFormat("yyyy-MM-dd");
		String dateSQL = formatSQL.format(dateNaissance);
		
		System.out.println("Entrez la spécialité");
		Scanner sc4 = new Scanner(System.in);
		String specialiT = sc4.nextLine();

		boolean fail;
		int disponibiliT = -1;
		do {
			try {
				System.out.println("Entrez le nombre de jour disponible");
				Scanner sc5 = new Scanner(System.in);
				disponibiliT = sc5.nextInt();
				fail = false;
			} catch (InputMismatchException e1) {
				System.out.println("Vous n'avez pas rentré un nombre entier ... reessayez ce n'est pourtant pas compliqué !");
				fail = true;
			}
		} while (fail == true);

		c.requestSQL("insert into consultant (nom, prenom, dateNaissance, specialite, disponibilite) values ('"  + nom + "', '" + prenom + "','" + dateSQL + "','"+ specialiT +  "','" + disponibiliT + "')");
		
	}

	@Override
	public void supprimer() throws SQLException{
		// TODO Auto-generated method stub
		
		System.out.println("Indiquez le nom de famille du consultant que vous souhaitez supprimer stp: \n");
		Scanner sc5 = new Scanner(System.in);
		String recherche = sc5.nextLine();

		 r = c.resultSQL("select * from consultant where nom like ('%"+recherche+"%') ;");
		 
		int match = 0;
		   while (r.next()) {
	            match=match+1;
	        }   
		   
		if (match > 1) {

			 r = c.resultSQL("select * from consultant where nom like ('%"+recherche+"%') ;");
			
			 System.out.println("il y a " + match
					+ " consultants qui correspondent au nom que vous avez spécifié, vous allez donc nous aider à déterminer lequel vous souhaitez supprimer :)");

			 while (r.next())  {
				System.out.println("Dites moi, est ce que c'est le consultant ci-dessous que vous souhaitez supprimer ?\n Appuyez 1 si oui ou 2 sinon");
				String lenom = r.getString("nom");
                String leprenom = r.getString("prenom");
                Date ledateN = r.getDate("dateNaissance");
                String lespecialite = r.getString("specialite");
                String ledisponibilite = r.getString("disponibilite");
                System.out.println("[Nom : " + lenom + ", Prénom : " + leprenom + ", Date de naissance : " + ledateN + " Spécialité : " + lespecialite + " Disponibilité : " + ledisponibilite + "]");
				Scanner sc44 = new Scanner(System.in);
				int trouve = sc44.nextInt();
				if (trouve == 1) {

                    c.requestSQL("delete from apprenant where nom ='" + lenom + "' AND prenom='" + leprenom + "'AND dateNaissance='" + ledateN + "'AND specialite='" + lespecialite+ "'AND disponibilite='" + ledisponibilite +  "';");

					break;
				}

			}

		} else if (match == 1) {

			 String lenom=""	;
		        r = c.resultSQL("select * from consultant where nom like ('%"+recherche+"%') ;");
		        while(r.next()) {
		            lenom = r.getString("nom");
		        }
		        
		 c.requestSQL("delete from consultant where nom ='" + lenom + "';");
		 
		}
		        else {
			System.out.println(
					"Désolé je ne trouve pas le consultant que vous souhaitez supprimer ... verifiez que vous avez correctement indiqué le nom de famille d'un consultant qui existe dans la liste. Si nécessaire allez checker la liste et revenez me voir plus tard");
		}

	}

	@Override
	public void consulter() throws SQLException {
		// TODO Auto-generated method stub

		r = c.resultSQL("select * from consultant");
		
		while (r.next()) {
			// imprime les éléments du tuple
			String lenom = r.getString("nom");
			String leprenom = r.getString("prenom");
			Date ledateN = r.getDate("dateNaissance");
			String lespecialite = r.getString("specialite");
			String ledisponibilite = r.getString("disponibilite");
			System.out.println("[Nom : " + lenom + ", Prénom : " + leprenom + ", Date de naissance : " + ledateN + " Jours disponibles : " + ledisponibilite + " Spécialité : " + lespecialite + "]");
		}

	}

	@Override
	public void rechercher() throws SQLException {
		// TODO Auto-generated method stub

		System.out.println("Recherche un consultant par son nom de famille : \nQuel nom de famille rechercher ? \n");
        Scanner sc5 = new Scanner(System.in);
        String recherche = sc5.nextLine();
        int match = 0;
       
        r = c.resultSQL("select * from consultant where nom like ('%"+recherche+"%') ;");
        while (r.next()) {
            match=match+1;
        }

        if (match>=1) {
        	System.out.println("Trouvé dans la liste " + match
                    + " fois (nombre de consultant qui contiennent le terme recherché)");
        	
        	 r = c.resultSQL("select * from consultant where nom like ('%"+recherche+"%') ;");
             
             System.out.println("Voici le résultat de votre recherche :");

             while (r.next()) {
                 
                 String lenom = r.getString("nom");
                 String leprenom = r.getString("prenom");
                 Date ledateN = r.getDate("dateNaissance");
                 String lespecialite = r.getString("specialite");
     			String ledisponibilite = r.getString("disponibilite");
     			System.out.println("[Nom : " + lenom + ", Prénom : " + leprenom + ", Date de naissance : " + ledateN + " Jours disponibles : " + ledisponibilite + " Spécialité : " + lespecialite + "]");
     		}
        }
        
        else {
            System.out.println("Désolé je ne trouve pas");
        }
        
}

}
