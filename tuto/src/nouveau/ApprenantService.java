package nouveau;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
//import nouveau.Apprenant;

public class ApprenantService implements Icrud  {

	ArrayList listeApprenants = new ArrayList();
	boolean fail = false;
	ConnectionaSQL c = new ConnectionaSQL();
	ResultSet r = null;
	// ArrayList la = new ArrayList();

	@Override
	public void ajouter() throws ParseException, SQLException {
		// TODO Auto-generated method stub

			//Statement st = conn.createStatement();
			
			System.out.println("Entrez le nom");
			Scanner sc1 = new Scanner(System.in);
			String nom = sc1.nextLine();

			System.out.println("Entrez le prenom");
			Scanner sc2 = new Scanner(System.in);
			String prenom = sc2.nextLine();

			String dateNaissanceS = "00/00/0000";
			Date dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissanceS);
			do {
				try {
					fail = false;
					System.out.println("entrez date de naissance");
					Scanner sc3 = new Scanner(System.in);
					dateNaissanceS = sc3.nextLine();
					dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissanceS);
				} catch (java.text.ParseException eP) {
					System.out.println(
							"Date au mauvais format, veuillez recommencer l'ajout avec le format de date suivant jj/mm/aaaa");
					fail = true;
				}
			} while (fail == true);

			SimpleDateFormat formatSQL = new SimpleDateFormat("yyyy-MM-dd");
			String dateSQL = formatSQL.format(dateNaissance);
			
			System.out.println("Entrez le diplôme");
			Scanner sc4 = new Scanner(System.in);
			String diplome = sc4.nextLine();

			System.out.println("Entrez le cv");
			Scanner sc5 = new Scanner(System.in);
			String cvS = sc5.nextLine();
			Path cv = Paths.get(cvS);

			System.out.println("Entrez le cycle de formation");
			Scanner sc6 = new Scanner(System.in);
			String cycleFormation = sc6.nextLine();

			c.requestSQL("insert into apprenant (nom, prenom, dateNaissance, diplome, cv, cycleFormation) values ('" + nom + "', '" + prenom + "','" + dateSQL + "','"+ diplome + "', '" + cv + "','" + cycleFormation + "')");
		
	}

	@Override
    public void supprimer() throws SQLException {
        // TODO Auto-generated method stub

        System.out.println("Indiquez le nom de famille de l'apprenant que vous souhaitez supprimer : \n");
        Scanner sc5 = new Scanner(System.in);
        String recherche = sc5.nextLine();
        int match=0;
        

        r = c.resultSQL("select * from apprenant where nom like ('%"+recherche+"%') ;");
        while (r.next()) {
            match=match+1;
        }   
        
        if (match>1)
        {
        	 r = c.resultSQL("select * from apprenant where nom like ('%"+recherche+"%') ;");
            System.out.println("il y a "+match+ " apprenants qui correspondent au nom que vous avez spécifié, vous allez donc nous aider à déterminer lequel vous souhaitez supprimer :)");
            
            while (r.next()) {
                
                System.out.println("Dites moi, est ce que c'est l'apprenant ci-dessous que vous souhaitez supprimer ?\n press 1 si oui ou press 2 si non");
                String lenom = r.getString("nom");
                String leprenom = r.getString("prenom");
                Date ledateN = r.getDate("dateNaissance");
                String lediplome = r.getString("diplome");
                String lecv = r.getString("cv");
                String lecycleFormation = r.getString("cycleFormation");
                System.out.println("[Nom : " + lenom + ", Prénom : " + leprenom + ", Date de naissance : " + ledateN + " Diplôme : " + lediplome + " Lien du CV : " + lecv + " Cycle de formation : " + lecycleFormation + "]");
                Scanner sc44 = new Scanner(System.in);
                int trouve = sc44.nextInt();
                if (trouve==1)
                    {
                    
                    c.requestSQL("delete from apprenant where nom ='" + lenom + "' AND prenom='" + leprenom + "'AND dateNaissance='" + ledateN + "'AND diplome='" + lediplome + "'AND cv='" + lecv + "'AND cycleFormation='" + lecycleFormation + "';");
                    break;
                    }
                
            }
        }
        else if (match==1)
        {
        String lenom=""	;
        r = c.resultSQL("select * from apprenant where nom like ('%"+recherche+"%') ;");
        while(r.next()) {
            lenom = r.getString("nom");
        }
        
        c.requestSQL("delete from apprenant where nom ='" + lenom + "';");
        
        }
        
    else
        {
        System.out.println("Désolé je ne trouve pas l'apprenant que vous souhaitez supprimer ... verifiez que vous avez correctement indiqué le nom de famille d'un apprenant qui existe dans la liste. Si nécessaire allez checker la liste et revenez me voir plus tard");
        }
        
    }

	@Override
	public void consulter() throws SQLException{
		// TODO Auto-generated method stub

		r = c.resultSQL("select * from apprenant;");
		
		while (r.next()) {
			// imprime les éléments du tuple
			String lenom = r.getString("nom");
			String leprenom = r.getString("prenom");
			Date ledateN = r.getDate("dateNaissance");
			String lediplome = r.getString("diplome");
			String lecv = r.getString("cv");
			String lecycleFormation = r.getString("cycleFormation");
			System.out.println("[Nom : " + lenom + ", Prénom : " + leprenom + ", Date de naissance : " + ledateN + " Diplôme : " + lediplome + " Lien du CV : " + lecv + " Cycle de formation : " + lecycleFormation + "]");
		}
	}

	@Override
	public void rechercher() throws SQLException {
		
		System.out.println("Recherche un apprenant par son nom de famille : \nQuel nom de famille rechercher ? \n");
        Scanner sc5 = new Scanner(System.in);
        String recherche = sc5.nextLine();
        int match = 0;
       
        r = c.resultSQL("select * from apprenant where nom like ('%"+recherche+"%') ;");
        while (r.next()) {
            match=match+1;
        }

        if (match>=1) {
        	System.out.println("Trouvé dans la liste " + match
                    + " fois (nombre d'apprenants qui contiennent le terme recherché)");
        	
        	 r = c.resultSQL("select * from apprenant where nom like ('%"+recherche+"%') ;");
             
             System.out.println("Voici le résultat de votre recherche :");

             while (r.next()) {
                 
                 String lenom = r.getString("nom");
                 String leprenom = r.getString("prenom");
                 Date ledateN = r.getDate("dateNaissance");
                 String lediplome = r.getString("diplome");
                 String lecv = r.getString("cv");
                 String lecycleFormation = r.getString("cycleFormation");
                 System.out.println("[Nom : " + lenom + ", Prénom : " + leprenom + ", Date de naissance : " + ledateN + " Diplôme : " + lediplome + " Lien du CV : " + lecv + " Cycle de formation : " + lecycleFormation + "]");
                  
             }
        }
        
        else {
            System.out.println("Desole je trouve pas");
        }
        
}
	
}
