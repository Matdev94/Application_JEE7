package model;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.persistence.*;


/**
 * The persistent class for the clients database table.
 * 
 */
@Entity
@Table(name="clients")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(nullable=false, length=255)
	private String age;

	@Column(nullable=false, length=255)
	private Integer bons;

	@Column(nullable=false, length=255)
	private String motdepasse;

	@Column(nullable=false, length=255)
	private String nom;

	@Column(nullable=false, length=255)
	private String prenom;

	public Client(){
		
	}
	public Client(String nom, String motdepasse, String prenom, String age) {

	
	this.motdepasse = md5(motdepasse);
	this.age = age ;
	this.prenom=prenom;
	this.nom=nom;
	}
	public String md5(String input) {
	MessageDigest md;
	StringBuffer sb = new StringBuffer();

	try {
	md = MessageDigest.getInstance("MD5");
	
	String source=null;
	byte[] bytes = md.digest(source.getBytes("UTF-8"));
	for (int i = 0; i < bytes.length; i++) {
	byte b = bytes[i];
	String hex = Integer.toHexString((int) 0x00FF & b);
	if (hex.length() == 1) {
	sb.append("0");
	}
	sb.append(hex);
	}
	} catch (NoSuchAlgorithmException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	return sb.toString();
	}
	public void setMotdepasse(String motdepasse) {
	this.motdepasse = md5(motdepasse);
	}
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getBons() {
		return this.bons;
	}

	public void setBons(int bons) {
		this.bons = bons;
	}

	public String getMotdepasse() {
		return this.motdepasse;
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

}