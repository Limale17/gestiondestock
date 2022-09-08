package sn.niit.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import sn.niit.gestiondestock.model.SortieStock;

public interface SortieService 
{
	List<SortieStock>  listeSortieStock();
	void ajouterSortieStock(SortieStock sortieStock);
	Optional<SortieStock> getSortieStockById(Long id);
	void supprimerSortieStock(SortieStock sortieStock);	
	
}
