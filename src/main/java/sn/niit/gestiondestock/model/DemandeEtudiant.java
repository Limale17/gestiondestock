package sn.niit.gestiondestock.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class DemandeEtudiant 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numeroDemande;
	private LocalDate dateDemande;
	
	@OneToOne
	@JoinColumn(name = "lot_id")
	private Lot lot;
	
	@ManyToOne
	@JoinColumn(name = "etudiant_id")
	private Etudiant etudiant;
	
	public DemandeEtudiant() {}

	public DemandeEtudiant(String numeroDemande, LocalDate dateDemande, Lot lot, Etudiant etudiant) {
		super();
		this.numeroDemande = numeroDemande;
		this.dateDemande = dateDemande;
		this.lot = lot;
		this.etudiant = etudiant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroDemande() {
		return numeroDemande;
	}

	public void setNumeroDemande(String numeroDemande) {
		this.numeroDemande = numeroDemande;
	}

	public LocalDate getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(LocalDate dateDemande) {
		this.dateDemande = dateDemande;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	@Override
	public String toString() {
		return "DemandeEtudiant [numeroDemande=" + numeroDemande + ", dateDemande=" + dateDemande
				+ ", lot=" + lot + ", etudiant=" + etudiant + "]";
	}
	
	
}
