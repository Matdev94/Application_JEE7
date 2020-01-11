package modele;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Invite
 *
 */
@Entity
@Table(name="invite")

public class Invite implements Serializable {

	   
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String prenom;
	private Date date;
	private static final long serialVersionUID = 1L;
	private EntityManager em;
	

	public Invite() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public Invite(String nom, String prenom) {
		super();
		this.nom = nom ;
		this.prenom = prenom ;
		date = Date.valueOf(LocalDate.now());
   
}
	public String toString(){
		return nom+" "+" "+prenom + " " +
		date.toLocalDate().format(DateTimeFormatter.ofPattern(
		"dd-MM-yyyy"));
		}
	
	public Invite majPrenom(String prenom, long key) {
		
		Invite i ;
		em.getTransaction().begin();
		i = em.find(Invite.class, key);
		i.setPrenom(prenom) ;
		em.getTransaction().commit();
		return i ;
		}
	
	public Invite recherche(long key) {

		Invite i ;
		em.getTransaction().begin();
		i = em.find(Invite.class, key);
		em.getTransaction().commit();
		return i ;
		}
}
