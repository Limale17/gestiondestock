package sn.niit.gestiondestock.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EntreeStock 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateEntree;
	
	@OneToOne
	@JoinColumn(name = "lot_id")
	private Lot lot;
	private int quantite;
	
	public EntreeStock() {}

	public EntreeStock(LocalDate dateEntree, Lot lot, int quantite) {
		this.dateEntree = dateEntree;
		this.lot = lot;
		this.quantite = quantite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(LocalDate dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "EntreeStock [dateEntree=" + dateEntree + ", lot=" + lot + ", quantite=" + quantite + "]";
	}
	
}
