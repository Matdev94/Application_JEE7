package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.*;
import java.util.Date;


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
	private long id;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String nom;

	private String prenom;

	public Invite() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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
	public Invite(String nom, String prenom) {
		super();
		this.nom = nom ;
		this.prenom = prenom ;
		date = new Date();
		}
		
		public String toString(){
		return nom+" "+" "+prenom + " " +
		LocalDate.ofEpochDay(date.getTime()/(1000*3600*24))
		.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		}

}