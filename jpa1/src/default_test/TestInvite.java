package default_test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modele.Invite;

public class TestInvite {
public static void main(String[] args) {
EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAPersistenceProjectlesinvites");
EntityManager em ;
em = factory.createEntityManager();
Invite invite = new Invite("durand","robert");
em.getTransaction().begin();

//Opération Create
em.persist(invite);
em.remove(invite);
em.getTransaction().commit();

}
}