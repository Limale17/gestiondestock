package sn.niit.gestiondestock;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sn.niit.gestiondestock.model.Livre;
import sn.niit.gestiondestock.model.Lot;
import sn.niit.gestiondestock.service.LivreService;
import sn.niit.gestiondestock.service.LotService;

@SpringBootTest
public class LivreTest 
{
	@Autowired
	LotService lotService;
	@Autowired 
	LivreService livreService;
	
	
	@Test
	public void saveLivre() {
		Lot lot1 = lotService.getLotById(2l).get();
		Lot lot2 = lotService.getLotById(3l).get();
		
		Livre livre1 = new Livre("L001", "livre du module13", lot1);
		Livre livre2 = new Livre("L002", "livre du module 2", lot2);
		livreService.ajouterLivre(livre1);
		livreService.ajouterLivre(livre2);
		
		Assertions.assertThat(livre1.getId()).isGreaterThan(0);

		Assertions.assertThat(livre2.getId()).isGreaterThan(0);
		
	}
	
	@Test
	public void listeLivre() {
		List<Livre> listLivre = livreService.listeLivreParLot(lotService.getLotById(3l).get());
		System.out.println("la taille est : " + listLivre.size());
		Assertions.assertThat(listLivre.size()).isGreaterThan(0);
		
		
	}
	
	@Test
	public void getLotById() {
		Lot lot = lotService.getLotById(2l).get();
		Assertions.assertThat(lot.getId()).isEqualTo(2l);
	}
	
	
	
}
