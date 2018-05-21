package com.app.ecoforta.dao;

import java.util.List;

import com.app.ecoforta.model.Berita;

public interface BeritaDao 
{
	Berita findById(int id);
	 
    void saveBerita(Berita berita);
     
    void deletBeritaBySsn(int id);
     
    List<Berita> findAllBeritas();
}
