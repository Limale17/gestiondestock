package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import sn.niit.gestiondestock.model.Etudiant;

public interface EtudiantService 
{
	List<Etudiant>  listeEtudiant();
	void ajouterEtudiant(Etudiant etudiant);
	Optional<Etudiant> getEtudiantById(Long id);
	void supprimerEtudiant(Etudiant etudiant);	
	
}
