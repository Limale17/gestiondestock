package sn.niit.gestiondestock.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Lot 
{
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	private String codeLot;
	private String description;
	private int quantiteStock;
	
	@OneToMany(mappedBy = "lot")
	private List<Livre> livres;
	
	@OneToOne
	private Module module;
	
	public Lot() {};
	
	public Lot(String codeLivre, String description, int quantiteStock, Module module) {
		this.codeLot = codeLivre;
		this.description = description;
		this.quantiteStock = quantiteStock;
		this.module = module;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeLot() {
		return codeLot;
	}

	public void setCodeLot(String codeLivre) {
		this.codeLot = codeLivre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	@Override
	public String toString() {
		return "Lot [codeLot=" + codeLot + ", description=" + description + ", quantiteStock=" + quantiteStock
				+ "]";
	}
	
	

}
