package invites;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
@Path("/hellos")
public class HelloInvites {
	/*
@Path("/{nominvite}")
@GET
@Produces("text/html")
public String sayHtmlHello(@PathParam("nominvite") String nomInvite) {
String nom = nomInvite;
return "<html> " + "<title>" + "Site des invit&eacute;s" + "</title>"
+ "<body><h1>" + "Bonjour "+ nom + "</body></h1>" + "</html> ";
}
*/
@GET
@Produces(MediaType.TEXT_HTML)
public String sayHtmlHello() {
 return "<?xml version=\"1.0\"?>" + "<hello> Hello les invités bis" + "</hello>";
}

@Path("/detailinvite")
@GET
@Produces("text/html")
public String detailinvite(
@DefaultValue("inconnu") @QueryParam("nom") String nomInvite,
@DefaultValue("inconnu") @QueryParam("prenom") String prenomInvite,
@DefaultValue("99") @QueryParam("age") int ageInvite,
@DefaultValue("false") @QueryParam("vip") boolean isVip
){
String vip = "" ;
if (isVip==true)
vip="vip" ;
String details = prenomInvite+" "+nomInvite +" "+ageInvite +" ans "+vip ;
return "<html> " + "<title>" + "Hello les invit&eacute;s" + "</title>"
+ "<body><h1>" + details + "</body></h1>" + "</html> ";
}
}