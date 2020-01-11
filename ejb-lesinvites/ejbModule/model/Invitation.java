package model;

import java.io.Serializable;

import javax.ejb.Local;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the invitation database table.
 * 
 */
@Entity
@NamedQuery(name="Invitation.findAll", query="SELECT i FROM Invitation i")
public class Invitation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String lieu;

	private String nom;

	//bi-directional many-to-one association to Invite
	@ManyToOne
	@JoinColumn(name="idinvite")
	private Invite invite;

	public Invitation (String lieu, String nom){
		this.lieu=lieu;
		this.nom=nom;
		
	}
	public Invitation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Invite getInvite() {
		return this.invite;
	}

	public void setInvite(Invite invite) {
		this.invite = invite;
	}

}