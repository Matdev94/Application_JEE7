package application;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Invite;



public class DaoInvites {
private EntityManager em ;
public DaoInvites() {
EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa1-lesinvites");
em = factory.createEntityManager();
}
public void stocker(Invite invite){
em.getTransaction().begin();
em.persist(invite);
em.getTransaction().commit();
}
public List<Invite> voirlesinvites() {
TypedQuery<Invite> query = em.createNamedQuery("Invite.findALL", Invite.class);
List<Invite> liste = query.getResultList();
return liste;
}
public void supprimer(Invite invite){
em.getTransaction().begin();
em.remove(invite);
em.getTransaction().commit();
}
}