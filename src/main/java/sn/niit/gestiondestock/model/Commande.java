package sn.niit.gestiondestock.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commande 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numeroComande;
	private LocalDate dateComande;
	private String status;
	
	@OneToMany
	private List<LigneCommande> ligneCommandes;
	
	public Commande() {}

	
	public Commande(String numeroComande, LocalDate dateComande, String status, List<LigneCommande> ligneCommandes) {
		super();
		this.numeroComande = numeroComande;
		this.dateComande = dateComande;
		this.status = status;
		this.ligneCommandes = ligneCommandes;
	}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNumeroComande() {
		return numeroComande;
	}

	public void setNumeroComande(String numeroComande) {
		this.numeroComande = numeroComande;
	}

	public LocalDate getDateComande() {
		dateComande = LocalDate.now();
		return dateComande;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}


	@Override
	public String toString() {
		return "Commande [numeroComande=" + numeroComande + ", dateComande=" + dateComande + ", status=" + status + "]";
	}
	
}
