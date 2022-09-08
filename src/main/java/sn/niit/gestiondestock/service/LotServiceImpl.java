package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.Lot;
import sn.niit.gestiondestock.repository.LotRepositorie;

@Service
public class LotServiceImpl implements LotService {

	@Autowired
	LotRepositorie lotRepositorie;
	
	@Override
	public List<Lot> listeLot() {
		
		return lotRepositorie.findAll();
	}

	@Override
	public void ajouterLot(Lot lot) {
		lotRepositorie.save(lot);

	}

	@Override
	public Optional<Lot> getLotById(Long id) {
		
		return lotRepositorie.findById(id);
	}

	@Override
	public void supprimerLot(Lot lot) {
		lotRepositorie.delete(lot);

	}

}
