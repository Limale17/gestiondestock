package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.niit.gestiondestock.model.SortieStock;
import sn.niit.gestiondestock.repository.SortieRepositorie;

@Service
public class SortieServiceImpl implements SortieService{
	
	@Autowired
	SortieRepositorie sortieRepositorie;
	@Override
	public List<SortieStock> listeSortieStock() {
		return sortieRepositorie.findAll();
	}

	@Override
	public void ajouterSortieStock(SortieStock sortieStock) {
		sortieRepositorie.save(sortieStock);		
	}

	@Override
	public Optional<SortieStock> getSortieStockById(Long id) {
		return sortieRepositorie.findById(id);
	}

	@Override
	public void supprimerSortieStock(SortieStock sortieStock) {
		sortieRepositorie.delete(sortieStock);		
	}

}
