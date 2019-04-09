package nouveau;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ConnectionaSQL   {

	static Connection  conn;
	static Statement st;
	static ResultSet r;
	// Ouverture de la connexion vers la DB
	public  static void connecter() throws SQLException {
	
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_formation", "root", "root");
	
	}

	//Fermeture de la DB
	public static void deconnecter() throws SQLException {
		conn.close();
	}
	
	//Envoie de requête pour manipulation de données
	public static void requestSQL(String request) throws SQLException {
		Statement st = conn.createStatement();
		st.executeUpdate(request);
	}

	//Envoie de requete pour interrogation de données
	public static ResultSet resultSQL(String request) throws SQLException {
		Statement st = conn.createStatement();
		
		return st.executeQuery(request);
	}
}
