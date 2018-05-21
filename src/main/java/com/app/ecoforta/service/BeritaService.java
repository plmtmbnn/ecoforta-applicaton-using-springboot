package com.app.ecoforta.service;

import java.util.List;

import com.app.ecoforta.model.Berita;

public interface BeritaService 
{
	Berita findById(int id);
	 
    void saveBerita(Berita berita);
     
    void deletBeritaBySsn(int id);
     
    List<Berita> findAllBeritas();
}
