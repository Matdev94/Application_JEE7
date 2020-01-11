import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AjoutEtudiantTable {
	public static void main (String [] args) {
	Connection connection =null;
	
	try{
	Class.forName("com.mysql.jdbc.Driver");
	connection =
	DriverManager.getConnection("jdbc:mysql://127.0.0.1/cdi4","root","");
	}
	catch(ClassNotFoundException err){
	System.err.println("Pilote non trouvé..");
	System.err.println(err);
	System.exit(1) ;
	}
	catch(SQLException err){
	System.err.println("Connexion impossible");
	System.err.println(err);
	System.exit(1) ;
	}
/*	Statement stmt = null;
	ResultSet rs = null;
*/
		Statement stat=null;
		try {
			stat = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ret = 0;
		try {
			ret = stat.executeUpdate("insert into etudiant(nom, prenom,age,sport) " +
			"values ('Aimar', 'Jean',25,'baseball')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// exploitation du resultat
		if (ret > 0) {
			System.out.println(ret);
		
		}
	
}
}