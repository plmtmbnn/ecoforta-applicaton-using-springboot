package com.app.ecoforta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ecoforta.dao.BeritaDao;
import com.app.ecoforta.model.Berita;

@Service("beritaService")
@Transactional
public class BeritaServiceImpl implements BeritaService
{

	@Autowired
    private BeritaDao dao;
	
	@Override
	public Berita findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void saveBerita(Berita berita) {
		dao.saveBerita(berita);
		
	}

	@Override
	public void deletBeritaBySsn(int id) {
		dao.deletBeritaBySsn(id);
	}

	@Override
	public List<Berita> findAllBeritas() 
	{		
		return dao.findAllBeritas();
	}

}
