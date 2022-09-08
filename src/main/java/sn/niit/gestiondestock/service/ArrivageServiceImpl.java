package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.Arrivage;
import sn.niit.gestiondestock.repository.ArrivageRepositorie;

@Service
public class ArrivageServiceImpl implements ArrivageService{

	@Autowired
	ArrivageRepositorie arrivageRepositorie;
	
	@Override
	public List<Arrivage> listeArrivage() {
		return arrivageRepositorie.findAll();
	}

	@Override
	public void ajouterArrivage(Arrivage arrivage) {
		arrivageRepositorie.save(arrivage);		
	}

	@Override
	public Optional<Arrivage> getArrivageById(Long id) {
		return arrivageRepositorie.findById(id);
	}

	@Override
	public void supprimerArrivage(Arrivage arrivage) {
		arrivageRepositorie.delete(arrivage);		
	}

}
