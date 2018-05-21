package com.app.ecoforta.dao;

import java.util.List;
import com.app.ecoforta.model.Tanaman;

public interface TanamanDao {

	Tanaman findById(int id);
	 
    void saveTanaman(Tanaman tanaman);
     
    void deleteTanamanById(int id);
     
    List<Tanaman> findAllTanamans();
 
}

	

