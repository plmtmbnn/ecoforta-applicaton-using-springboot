package com.app.ecoforta.dao;


import java.util.List;

import com.app.ecoforta.model.Toko;

public interface TokoDao 
{
	Toko findById(int id);
	 
    void saveToko(Toko toko);
     
    void deleteTokoById(int id);
     
    List<Toko> findAllTokos();
 
    Toko findTokoById(int id);
}
