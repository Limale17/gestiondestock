package sn.niit.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.niit.gestiondestock.model.Niveau;

@Repository
public interface NiveauRepositorie extends JpaRepository<Niveau, Long>{

}
