package invites;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello/{nominvite}")
public class HelloInvite {
	
@GET
@Produces("text/html")
public String bonjourHtmlInvite(@PathParam("nominvite") String nomInvite) {
	String nom= "durand";
	
return "<html> " + "<title>" + "Site des invit&eacute;s" + "</title>"
+ "<body><h1>" + "Bonjour" +nom+ "</body></h1>" + "</html> ";
}

@Path("/hello/invites")
@GET
@Produces("text/html")
public String sayHtmlHello() {
	
	
return "<html> " + "<title>" + "Site des invit&eacute;s" + "</title>"
+ "<body><h1>" + "Hello les invités" + "</body></h1>" + "</html> ";
}
@GET
@Produces(MediaType.TEXT_XML)
public String sayXMLHello() {
return "<?xml version=\"1.0\"?>" + "<hello> Hello les invités bis" + "</hello>";
}
}