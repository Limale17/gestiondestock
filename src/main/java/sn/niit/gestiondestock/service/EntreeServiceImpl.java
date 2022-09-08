package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.EntreeStock;
import sn.niit.gestiondestock.repository.EntreeRepositorie;

@Service
public class EntreeServiceImpl implements EntreeService{

	@Autowired
	EntreeRepositorie entreeRepositorie;
	
	@Override
	public List<EntreeStock> listeEntree() {
		return entreeRepositorie.findAll();
	}

	@Override
	public void ajouterEntree(EntreeStock entreeStock) {
		entreeRepositorie.save(entreeStock);		
	}

	@Override
	public Optional<EntreeStock> getEntreeById(Long id) {
		return entreeRepositorie.findById(id);
	}

	@Override
	public void supprimerEntree(EntreeStock entreeStock) {
		entreeRepositorie.delete(entreeStock);
		
	}

	
	
	

}
