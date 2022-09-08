package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import sn.niit.gestiondestock.model.Filiere;

public interface FiliereService 
{
	List<Filiere>  listeFiliere();
	Optional<Filiere> getFiliereById(Long id);
	
}
