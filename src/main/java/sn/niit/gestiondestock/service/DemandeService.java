package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import sn.niit.gestiondestock.model.DemandeEtudiant;

public interface DemandeService 
{
	List<DemandeEtudiant>  listeDemande();
	void ajouterDemande(DemandeEtudiant demandeEtudiant);
	Optional<DemandeEtudiant> getDemandeById(Long id);
	void supprimerDemande(DemandeEtudiant demandeEtudiant);	
	
}
