package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import sn.niit.gestiondestock.model.Commande;

public interface CommandeService 
{
	List<Commande>  listeCommande();
	void ajouterCommande(Commande commande);
	Optional<Commande> getCommandeById(Long id);
	void supprimerCommande(Commande commande);	
	
}
