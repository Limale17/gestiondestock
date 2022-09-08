package sn.niit.gestiondestock.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Etudiant 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numeroEtudiant;
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private String email;
	
	@OneToMany
	private List<DemandeEtudiant> listDemande;
	
	public Etudiant() {}

	public Etudiant(String numeroEtudiant, String nom, String prenom, String adresse, String telephone, String email) {
		super();
		this.numeroEtudiant = numeroEtudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public void setNumeroEtudiant(String numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<DemandeEtudiant> getListDemande() {
		return listDemande;
	}

	public void setListDemande(List<DemandeEtudiant> listDemande) {
		this.listDemande = listDemande;
	}

	@Override
	public String toString() {
		return "Etudiant [numeroEtudiant=" + numeroEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", telephone=" + telephone + ", email=" + email + "]";
	}
	
}
