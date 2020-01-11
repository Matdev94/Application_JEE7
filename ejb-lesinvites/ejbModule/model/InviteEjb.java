package model;

import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 * @generated DT_ID=none
 */
@Stateless(name = "InviteEjb", mappedName = "ejb-lesinvites-InviteEjb")
public class InviteEjb
        implements InviteEjbLocal, InviteEjbRemote
{

    /**
     * @generated DT_ID=none
     */
	@Resource
	SessionContext sessionContext;

    /**
     * @generated DT_ID=none
     */
	    @PersistenceContext(unitName="ejb-lesinvites")
        private EntityManager em;

    /**
     * @generated DT_ID=none
     */
    public InviteEjb() {
    }
    
    

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Object queryByRange(String jpqlStmt, int firstResult,
                               int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }

        return query.getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public Invite persistInvite(Invite invite) {
        em.persist(invite);
        return invite;
    }

    /**
     * @generated DT_ID=none
     */
    public Invite mergeInvite(Invite invite) {
        return em.merge(invite);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeInvite(Invite invite) {
        invite = em.find(Invite.class, invite.getIdinvite());
        em.remove(invite);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Invite> getInviteFindAll() {
        return em.createNamedQuery("Invite.findAll").getResultList();
    }

}
