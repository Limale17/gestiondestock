package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.Niveau;
import sn.niit.gestiondestock.repository.NiveauRepositorie;

@Service
public class NiveauServiceImpl implements NiveauService{

	@Autowired
	NiveauRepositorie niveauRepositorie;

	@Override
	public List<Niveau> listeNiveau() {
		return niveauRepositorie.findAll();
	}

	@Override
	public Optional<Niveau> getNiveauById(Long id) {
	
		return niveauRepositorie.findById(id);
	}
	
	

}
