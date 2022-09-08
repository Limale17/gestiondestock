package sn.niit.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Niveau 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	@ManyToOne
	@JoinColumn(name = "filiere_id")
	private Filiere fIliere;

	public Niveau() {}

	public Niveau(String nom, Filiere fIliere) {
		super();
		this.nom = nom;
		this.fIliere = fIliere;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Filiere getfIliere() {
		return fIliere;
	}

	public void setfIliere(Filiere fIliere) {
		this.fIliere = fIliere;
	}
	

	@Override
	public String toString() {
		return "Niveau [ nom=" + nom + ", fIliere=" + fIliere + "]";
	}
	
}
