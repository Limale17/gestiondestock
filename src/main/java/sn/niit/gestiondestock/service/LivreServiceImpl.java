package sn.niit.gestiondestock.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.Livre;
import sn.niit.gestiondestock.model.Lot;
import sn.niit.gestiondestock.repository.LivreRepositorie;

@Service
public class LivreServiceImpl implements LivreService {

	@Autowired
	LivreRepositorie livreRepositorie;
	
	

	@Override
	public void ajouterLivre(Livre livre) {
		livreRepositorie.save(livre);

	}

	@Override
	public Optional<Livre> getLivreById(Long id) {
		
		return livreRepositorie.findById(id);
	}

	@Override
	public void supprimerLivre(Livre livre) {
		livreRepositorie.delete(livre);

	}

	@Override
	public List<Livre> listeLivreParLot(Lot lot) {
		List<Livre> listeLivre = new ArrayList<>();
		for(Livre livre : livreRepositorie.findAll()) {
			if(livre.getLot().equals(lot)) {
				listeLivre.add(livre);
				return listeLivre;
			}
			
		}
		
		return null;
	}

}
