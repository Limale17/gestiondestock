package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import sn.niit.gestiondestock.model.Arrivage;

public interface ArrivageService 
{
	List<Arrivage>  listeArrivage();
	void ajouterArrivage(Arrivage arrivage);
	Optional<Arrivage> getArrivageById(Long id);
	void supprimerArrivage(Arrivage arrivage);	
	
}
