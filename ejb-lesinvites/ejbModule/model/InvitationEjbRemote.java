package model;

import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface InvitationEjbRemote
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Invitation persistInvitation(Invitation invitation);

    /**
     * @generated DT_ID=none
     */
    public Invitation mergeInvitation(Invitation invitation);

    /**
     * @generated DT_ID=none
     */
    public void removeInvitation(Invitation invitation);

    /**
     * @generated DT_ID=none
     */
    public List<Invitation> getInvitationFindAll();

}
