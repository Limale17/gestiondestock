package sn.niit.gestiondestock.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class SortieStock 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateSortie;
	
	@OneToOne
	@JoinColumn(name = "demande_etudiant_id")
	private DemandeEtudiant demandeEtudiant;
	
	public SortieStock() {}

	public SortieStock(LocalDate dateSortie, DemandeEtudiant demandeEtudiant) {
		super();
		this.dateSortie = dateSortie;
		this.demandeEtudiant = demandeEtudiant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	public DemandeEtudiant getDemandeEtudiant() {
		return demandeEtudiant;
	}

	public void setDemandeEtudiant(DemandeEtudiant demandeEtudiant) {
		this.demandeEtudiant = demandeEtudiant;
	}

	@Override
	public String toString() {
		return "SortieStock [dateSortie=" + dateSortie + ", demandeEtudiant=" + demandeEtudiant + "]";
	}
	
}
