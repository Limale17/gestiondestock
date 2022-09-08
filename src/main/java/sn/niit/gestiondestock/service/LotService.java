package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import sn.niit.gestiondestock.model.Lot;

public interface LotService 
{
	List<Lot>  listeLot();
	void ajouterLot(Lot lot);
	Optional<Lot> getLotById(Long id);
	void supprimerLot(Lot lot);	
	
}
