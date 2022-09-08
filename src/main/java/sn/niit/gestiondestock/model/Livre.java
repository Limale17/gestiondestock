package sn.niit.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Livre 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String codeLivre;
	private String description;
	
	@ManyToOne()
	@JoinColumn(name = "lot_id")
	private Lot lot;
	
	public Livre() {}

	public Livre(String codeLivre, String description, Lot lot) {
		this.codeLivre = codeLivre;
		this.description = description;
		this.lot = lot;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeLivre() {
		return codeLivre;
	}

	public void setCodeLivre(String codeLivre) {
		this.codeLivre = codeLivre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}

	@Override
	public String toString() {
		return "Livre [ codeLivre=" + codeLivre + ", description=" + description + "]";
	}
	
}
