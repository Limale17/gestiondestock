package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import sn.niit.gestiondestock.model.Niveau;

public interface NiveauService 
{
	List<Niveau>  listeNiveau();
	Optional<Niveau> getNiveauById(Long id);
	
}
