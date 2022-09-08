package sn.niit.gestiondestock.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Arrivage 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateArrivage;
	
	@OneToMany
	private List<Commande> commandes;
	private int nombreDeLot;
	
	public Arrivage() {}

	public Arrivage(LocalDate dateArrivage, int nombreDeLot) {
		super();
		this.dateArrivage = dateArrivage;
		this.nombreDeLot = nombreDeLot;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDateArrivage() {
		return dateArrivage;
	}

	public void setDateArrivage(LocalDate dateArrivage) {
		this.dateArrivage = dateArrivage;
	}
	

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public int getNombreDeLot() {
		return nombreDeLot;
	}

	public void setNombreDeLot(int nombreDeLot) {
		this.nombreDeLot = nombreDeLot;
	}

	@Override
	public String toString() {
		return "Arrivage [dateArrivage=" + dateArrivage +  ", nombreDeLot=" + nombreDeLot
				+ "]";
	}
	
}
