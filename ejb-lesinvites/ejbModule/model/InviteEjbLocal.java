package model;

import java.util.List;
import javax.ejb.Local;


/**
 * @generated DT_ID=none
 */
@Local
public interface InviteEjbLocal
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Invite persistInvite(Invite invite);

    /**
     * @generated DT_ID=none
     */
    public Invite mergeInvite(Invite invite);

    /**
     * @generated DT_ID=none
     */
    public void removeInvite(Invite invite);

    /**
     * @generated DT_ID=none
     */
    public List<Invite> getInviteFindAll();

}
