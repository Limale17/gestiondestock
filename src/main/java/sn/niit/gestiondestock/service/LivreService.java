package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import sn.niit.gestiondestock.model.Livre;
import sn.niit.gestiondestock.model.Lot;


public interface LivreService 
{
	List<Livre>  listeLivreParLot(Lot lot);
	void ajouterLivre(Livre livre);
	Optional<Livre> getLivreById(Long id);
	void supprimerLivre(Livre livre);	
	
}
