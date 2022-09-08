package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.Etudiant;
import sn.niit.gestiondestock.repository.EtudiantRepositorie;

@Service
public class EtudiantServiceImpl implements EtudiantService {

	
	@Autowired
	EtudiantRepositorie etudiantRepositorie;
	
	@Override
	public List<Etudiant> listeEtudiant() {
		
		return etudiantRepositorie.findAll();
	}

	@Override
	public void ajouterEtudiant(Etudiant etudiant) {
		etudiantRepositorie.save(etudiant);

	}

	@Override
	public Optional<Etudiant> getEtudiantById(Long id) 
	{
		return etudiantRepositorie.findById(id);
	}

	@Override
	public void supprimerEtudiant(Etudiant etudiant) {
		etudiantRepositorie.delete(etudiant);
	}

}
