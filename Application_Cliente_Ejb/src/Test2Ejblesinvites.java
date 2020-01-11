
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import model.Invitation;
import model.InvitationEjbRemote;
import model.Invite;
import model.InviteEjbRemote;
public class Test2Ejblesinvites {
public static void main(String [] argvs){
InitialContext context;
InviteEjbRemote lesinvitesbean=null ;
InvitationEjbRemote lesinvitationsbean = null ;
try {
context = new InitialContext();
lesinvitesbean= (InviteEjbRemote) context.lookup("ejb-lesinvites-InviteEjb");
lesinvitationsbean = (InvitationEjbRemote)context.
lookup("ejb-lesinvites-InvitationEjb");
} catch (NamingException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
LocalDate dateevenement = LocalDate.of(2015, 6, 15);
Date date = new Date(24*3600*1000*dateevenement.toEpochDay());
Invitation invitation = new Invitation("fête du cinéma","bordeaux");
Invite recherche = new Invite("renard","max");



String jpqlStmt = "select x from Invite x where x.nom = ";
jpqlStmt = jpqlStmt +"'" + recherche.getNom()+"'"+ "and "+ "x.prenom = ";
jpqlStmt = jpqlStmt +"'" + recherche.getPrenom()+"'";
List<Invite> liste = (List<Invite>)lesinvitesbean.queryByRange(jpqlStmt, 0, 1);
if (liste.size()==1) {
System.out.println("trouvé");
for (Invite invite : liste){
String uninvite = invite.getNom()+" "+ invite.getPrenom();
System.out.println(uninvite);
invitation.setInvite(invite);
lesinvitationsbean.persistInvitation(invitation);
}
}
else System.out.println("pas trouvé");
}
}