package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.LigneCommande;
import sn.niit.gestiondestock.repository.LigneCommandeRepositorie;

@Service
public class LigneCommandeServiceIpml implements LigneCommandeService {

	@Autowired
	LigneCommandeRepositorie commandeRepositorie;
	
	@Override
	public List<LigneCommande> listeLigneCommande()
	{
		return commandeRepositorie.findAll();
	}

	@Override
	public void ajouterLigneCommande(LigneCommande ligneCommande)
	{
		commandeRepositorie.save(ligneCommande);

	}

	@Override
	public Optional<LigneCommande> getLigneCommandeById(Long id)
	{
		return commandeRepositorie.findById(id);
	}

	@Override
	public void supprimerLigneCommande(LigneCommande ligneCommande) 
	{
		commandeRepositorie.delete(ligneCommande);
	}

}
