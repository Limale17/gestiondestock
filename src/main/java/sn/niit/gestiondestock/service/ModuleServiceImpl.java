package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.Module;
import sn.niit.gestiondestock.repository.ModuleRepositorie;

@Service
public class ModuleServiceImpl implements ModuleService{

	@Autowired
	ModuleRepositorie moduleRepositorie;

	@Override
	public List<Module> listeModule() {
		
		return moduleRepositorie.findAll();
	}

	@Override
	public Optional<Module> getModuleById(Long id) {
		return moduleRepositorie.findById(id);
	}

	
	
	

}
