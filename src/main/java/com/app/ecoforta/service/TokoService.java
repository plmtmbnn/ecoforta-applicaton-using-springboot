package com.app.ecoforta.service;


import java.util.List;

import com.app.ecoforta.model.Toko;


public interface TokoService 
{
	Toko findById(int id);
    
    void saveToko(Toko toko);
     
    void updateToko(Toko toko);
     
    void deleteTokoById(int id);
 
    List<Toko> findAllTokos(); 
     
    Toko findTokoById(int id);
     
}
