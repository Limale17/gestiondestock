package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.Filiere;
import sn.niit.gestiondestock.repository.FiliereRepositorie;

@Service
public class FiliereServiceImpl implements FiliereService{

	@Autowired
	FiliereRepositorie filiereRepositorie;
	
	@Override
	public List<Filiere> listeFiliere() {
	
		return filiereRepositorie.findAll();
	}

	@Override
	public Optional<Filiere> getFiliereById(Long id) {
		
		return filiereRepositorie.findById(id);
	}

}
