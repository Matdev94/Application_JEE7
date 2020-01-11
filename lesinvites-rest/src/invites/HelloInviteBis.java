package invites;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hellobis")
public class HelloInviteBis {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
	return "<html> " + "<title>" + "Hello les invités" + "</title>"
	+ "<body><h1>" + "Hello les invit&eacute;s bis" + "</body></h1>" + "</html> ";
	}
	}


