package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClubDao implements DAO<Club> {

	@Override
	public Club trouver(Object critere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList selectionner(Object critere) {
		// TODO Auto-generated method stub
		return null;
	}
/*
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
	@Override
	public Object trouver(Object critere) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList selectionner(Object critere) {
		// TODO Auto-generated method stub
		return null;
	}
}
*/

}
	