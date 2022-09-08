package sn.niit.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.niit.gestiondestock.model.EntreeStock;

@Repository
public interface EntreeRepositorie extends JpaRepository<EntreeStock, Long>{

}
