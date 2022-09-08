package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import sn.niit.gestiondestock.model.LigneCommande;

public interface LigneCommandeService 
{
	List<LigneCommande>  listeLigneCommande();
	void ajouterLigneCommande(LigneCommande ligneCommande);
	Optional<LigneCommande> getLigneCommandeById(Long id);
	void supprimerLigneCommande(LigneCommande ligneCommande);	
	
}
