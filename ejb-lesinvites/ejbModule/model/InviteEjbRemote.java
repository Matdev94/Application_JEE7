package model;

import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface InviteEjbRemote
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
