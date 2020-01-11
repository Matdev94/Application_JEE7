package javamodeles;

public class Client {
	private String nom ;
	private String prenom ;
	private String motdepasse;
	private int bons ;
	private Integer age ;
	public Client() {
	}
	public Client(String nom, String prenom, String motdepasse, int bons) {
	this.nom = nom ;
	this.prenom = prenom ;
	this.motdepasse = motdepasse ;
	this. bons = bons;
	}
	public String getNom() {
	return nom;
	}
	public void setNom(String nom) {
	this.nom = nom;
	}
	public String getPrenom() {
	return prenom;
	}
	public void setPrenom(String prenom) {
	this.prenom = prenom;
	}
	public String getMotdepasse() {
	return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
	this.motdepasse = motdepasse;
	}
	public int getBons() {
	return bons;
	}
	public void setBons(int bons) {
	this.bons = bons;
	}
	public Integer getAge() {
	return age;
	}
	public void setAge(Integer age) {
	this.age = age;
	}
	}