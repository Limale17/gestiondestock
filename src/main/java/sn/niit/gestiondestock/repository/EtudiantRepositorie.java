package sn.niit.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.niit.gestiondestock.model.Etudiant;

@Repository
public interface EtudiantRepositorie extends JpaRepository<Etudiant, Long>{

}
