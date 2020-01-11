package model;

import java.util.List;
import javax.ejb.Local;


/**
 * @generated DT_ID=none
 */
@Local
public interface InvitationEjbLocal
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
