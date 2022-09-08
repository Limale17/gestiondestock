package sn.niit.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.niit.gestiondestock.model.Module;

@Repository
public interface ModuleRepositorie extends JpaRepository<Module, Long>{

}
