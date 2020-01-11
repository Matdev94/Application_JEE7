import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import model.Invite;
import model.InviteEjbRemote;
public class TestEjblesinvites {
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
List<Invite> liste = lesinvitesbean.getInviteFindAll();
for (Invite uninvite: liste){
String param = uninvite.getNom()+" "+ uninvite.getPrenom()+"";
System.out.println(param);
}
}
}