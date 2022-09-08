package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.niit.gestiondestock.model.Commande;
import sn.niit.gestiondestock.repository.CommandeRepositorie;

@Service
public class CommandeServiceImpl implements CommandeService {

	@Autowired
	CommandeRepositorie commandeRepositorie;
	
	@Override
	public List<Commande> listeCommande()
	{
		return commandeRepositorie.findAll();
	}

	@Override
	public void ajouterCommande(Commande commande) {
		commandeRepositorie.save(commande);
	}

	@Override
	public Optional<Commande> getCommandeById(Long id) 
	{
		return commandeRepositorie.findById(id);
	}

	@Override
	public void supprimerCommande(Commande commande) {
		commandeRepositorie.delete(commande);

	}

}
