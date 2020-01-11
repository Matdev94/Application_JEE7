
import java.sql.*;
public class LireTable {
public static void main(String[] args){
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
Statement stmt = null;
ResultSet rs = null;
try {
stmt = connection.createStatement();
rs = stmt.executeQuery("SELECT * FROM etudiant");
while (rs.next()) {
String nom = rs.getString("nom");
String prenom = rs.getString("prenom");
int age = rs.getInt(3);
System.out.println(nom + " " + prenom + " " + age );
}
}
catch (SQLException ex){
System.out.println("SQLException: " + ex.getMessage());
System.out.println("SQLState: " + ex.getSQLState());
System.out.println("VendorError: " + ex.getErrorCode());
}
finally {
if (rs != null) {
try {
rs.close();
} catch (SQLException sqlEx) { }



rs = null;
}
if (stmt != null) {
try {
stmt.close();
} catch (SQLException sqlEx) { }
stmt = null;
}
if (connection != null ){
try {
connection.close();
} catch(SQLException sqlEx) { }
}
}
}
}