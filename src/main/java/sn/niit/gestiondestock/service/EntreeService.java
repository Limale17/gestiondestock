package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import sn.niit.gestiondestock.model.EntreeStock;

public interface EntreeService 
{
	List<EntreeStock>  listeEntree();
	void ajouterEntree(EntreeStock entreeStock);
	Optional<EntreeStock> getEntreeById(Long id);
	void supprimerEntree(EntreeStock entreeStock);	
	
}
