package sn.niit.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Module 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	@ManyToOne
	@JoinColumn(name = "niveau_id")
	private Niveau niveau;
	
	public Module() {}

	public Module(String nom, Niveau niveau) {
		super();
		this.nom = nom;
		this.niveau = niveau;
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

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Module [nom=" + nom + ", niveau=" + niveau + "]";
	}
	
}
