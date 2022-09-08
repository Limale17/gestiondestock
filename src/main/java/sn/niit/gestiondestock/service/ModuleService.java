package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import sn.niit.gestiondestock.model.Module;

public interface ModuleService 
{
	List<Module>  listeModule();
	Optional<Module> getModuleById(Long id);
	
}
