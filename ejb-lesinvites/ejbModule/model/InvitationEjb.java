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
@Stateless(name = "InvitationEjb", mappedName = "ejb-lesinvites-InvitationEjb")
public class InvitationEjb
        implements InvitationEjbLocal, InvitationEjbRemote
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
    public InvitationEjb() {
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
    public Invitation persistInvitation(Invitation invitation) {
        em.persist(invitation);
        return invitation;
    }

    /**
     * @generated DT_ID=none
     */
    public Invitation mergeInvitation(Invitation invitation) {
        return em.merge(invitation);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeInvitation(Invitation invitation) {
        invitation = em.find(Invitation.class, invitation.getId());
        em.remove(invitation);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Invitation> getInvitationFindAll() {
        return em.createNamedQuery("Invitation.findAll").getResultList();
    }

}
