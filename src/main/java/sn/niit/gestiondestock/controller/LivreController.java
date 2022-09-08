package sn.niit.gestiondestock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.niit.gestiondestock.model.Livre;
import sn.niit.gestiondestock.model.Lot;
import sn.niit.gestiondestock.service.LivreService;
import sn.niit.gestiondestock.service.LotService;

@RestController
@RequestMapping("api/livres")
public class LivreController {
	
	@Autowired
	LivreService livreService;
	
	@Autowired
	LotService lotService;
	
	@GetMapping("/liste")
	public List<Livre> listeLivre(){
		Lot lot = lotService.getLotById(3l).get();
		
		return livreService.listeLivreParLot(lot);
	}

}
