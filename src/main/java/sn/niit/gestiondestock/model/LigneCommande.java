package sn.niit.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LigneCommande 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int quantite;
	
	@OneToOne
	@JoinColumn(name = "lot_id")
	private Lot lot;
	
	public LigneCommande() {}

	public LigneCommande(int quantite, Lot lot) {
		this.quantite = quantite;
		this.lot = lot;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}

	@Override
	public String toString() {
		return "LigneCommande [quantite=" + quantite + ", lot=" + lot + "]";
	}
	
}
