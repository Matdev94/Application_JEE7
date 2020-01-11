package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the invite database table.
 * 
 */
@Entity
@NamedQuery(name="Invite.findAll", query="SELECT i FROM Invite i")
public class Invite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idinvite;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String nom;

	private String prenom;

	//bi-directional many-to-one association to Invitation
	@OneToMany(mappedBy="invite")
	private List<Invitation> invitations;

	public Invite() {
	}
	public Invite(String nom,String prenom){
		
	}

	public int getIdinvite() {
		return this.idinvite;
	}

	public void setIdinvite(int idinvite) {
		this.idinvite = idinvite;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public List<Invitation> getInvitations() {
		return this.invitations;
	}

	public void setInvitations(List<Invitation> invitations) {
		this.invitations = invitations;
	}

	public Invitation addInvitation(Invitation invitation) {
		getInvitations().add(invitation);
		invitation.setInvite(this);

		return invitation;
	}

	public Invitation removeInvitation(Invitation invitation) {
		getInvitations().remove(invitation);
		invitation.setInvite(null);

		return invitation;
	}

}