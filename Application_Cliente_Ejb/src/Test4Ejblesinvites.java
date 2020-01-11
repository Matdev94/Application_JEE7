import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import model.Invite;
import model.InviteEjbRemote;
public class Test4Ejblesinvites {
public static void main(String [] argvs){
InitialContext context;
InviteEjbRemote lesinvitesbean=null ;
try {
context = new InitialContext();
lesinvitesbean= (InviteEjbRemote) context.lookup("ejb-lesinvites-InviteEjb");
} catch (NamingException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
Invite recherche = new Invite("malouk","lucie");
String jpqlStmt = "select x from Invite x where x.email = ";
jpqlStmt = jpqlStmt +"'" ;



List<Invite> liste = (List<Invite>)lesinvitesbean.queryByRange(jpqlStmt, 0, 0);
if (liste.size()==1) {
System.out.println("trouvé");
for (Invite user : liste){
String oneuser = user.getNom()+" "+ user.getPrenom()
;
System.out.println(oneuser);

lesinvitesbean.mergeInvite(user);
}
}
else System.out.println("pas trouvé");
}
}