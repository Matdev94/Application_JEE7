package ejb;

import java.util.List;
import javax.ejb.Remote;
import model.Client;


/**
 * @generated DT_ID=none
 */
@Remote
public interface EjbClientRemote
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Client persistClient(Client client);

    /**
     * @generated DT_ID=none
     */
    public Client mergeClient(Client client);

    /**
     * @generated DT_ID=none
     */
    public void removeClient(Client client);

    /**
     * @generated DT_ID=none
     */
    public List<Client> getClientFindAll();

}
