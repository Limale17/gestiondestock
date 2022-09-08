package sn.niit.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.niit.gestiondestock.model.Commande;

@Repository
public interface CommandeRepositorie extends JpaRepository<Commande, Long>{

}
