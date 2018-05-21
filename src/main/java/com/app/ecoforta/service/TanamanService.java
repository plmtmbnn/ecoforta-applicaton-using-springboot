package com.app.ecoforta.service;

import java.util.List;

import com.app.ecoforta.model.Tanaman;



public interface TanamanService {

	Tanaman findById(int id);
    
	void saveTanaman(Tanaman tanaman);

	void updateTanaman(Tanaman tanaman);

	void deleteTanamanById(int id);
 
    List<Tanaman> findAllTanamans(); 

	boolean isTanamanDomainUnique(Integer id, String domain);	
	
}
