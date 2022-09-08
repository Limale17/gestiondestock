package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.DemandeEtudiant;
import sn.niit.gestiondestock.repository.DemandeRepositorie;

@Service
public class DemandeServiceImpl implements DemandeService {

	@Autowired
	DemandeRepositorie demandeRepositorie;
	
	@Override
	public List<DemandeEtudiant> listeDemande() 
	{
		return demandeRepositorie.findAll();
	}

	@Override
	public void ajouterDemande(DemandeEtudiant demandeEtudiant) 
	{
		demandeRepositorie.save(demandeEtudiant);
	}

	@Override
	public Optional<DemandeEtudiant> getDemandeById(Long id) 
	{
		return demandeRepositorie.findById(id);
	}

	@Override
	public void supprimerDemande(DemandeEtudiant demandeEtudiant)
	{
		demandeRepositorie.delete(demandeEtudiant);

	}

}
