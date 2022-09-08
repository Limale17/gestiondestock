package sn.niit.gestiondestock;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.niit.gestiondestock.model.Lot;
import sn.niit.gestiondestock.model.Module;
import sn.niit.gestiondestock.service.LotService;
import sn.niit.gestiondestock.service.ModuleService;

@SpringBootTest
public class LotTest 
{
	@Autowired
	LotService lotService;
	@Autowired 
	ModuleService moduleService;
	
	
	@Test
	public void saveLot() {
		Module module1 = moduleService.getModuleById(1l).get();
		Module module2 = moduleService.getModuleById(2l).get();
		
		Lot lot1 = new Lot("L001", "lot du module 1", 5, module1);
		Lot lot2 = new Lot("L002", "lot du module 2", 5, module2);
		lotService.ajouterLot(lot1);
		lotService.ajouterLot(lot2);
		
		Assertions.assertThat(lot1.getId()).isGreaterThan(0);

		Assertions.assertThat(lot2.getId()).isGreaterThan(0);
		
	}
	
	@Test
	public void listeLot() {
		List<Lot> listLot = lotService.listeLot();
		System.out.println("la taille est : " + listLot.size());
		Assertions.assertThat(listLot.size()).isGreaterThan(0);
		
		
	}
	
	@Test
	public void getLotById() {
		Lot lot = lotService.getLotById(2l).get();
		Assertions.assertThat(lot.getId()).isEqualTo(2l);
	}
	
	
	
}
