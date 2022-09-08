package sn.niit.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.niit.gestiondestock.model.Lot;

@Repository
public interface LotRepositorie extends JpaRepository<Lot, Long>{

}
