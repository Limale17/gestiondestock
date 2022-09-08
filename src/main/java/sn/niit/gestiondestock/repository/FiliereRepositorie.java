package sn.niit.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.niit.gestiondestock.model.Filiere;

@Repository
public interface FiliereRepositorie extends JpaRepository<Filiere, Long>{

}
