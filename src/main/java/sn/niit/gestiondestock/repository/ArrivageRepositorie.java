package sn.niit.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.niit.gestiondestock.model.Arrivage;

@Repository
public interface ArrivageRepositorie extends JpaRepository<Arrivage, Long>{

}
