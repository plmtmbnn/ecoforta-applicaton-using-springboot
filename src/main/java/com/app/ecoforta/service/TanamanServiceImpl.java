package com.app.ecoforta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ecoforta.dao.TanamanDao;
import com.app.ecoforta.model.Tanaman;

@Service("tanamanService")
@Transactional

public class TanamanServiceImpl implements TanamanService
{
	@Autowired
    private TanamanDao dao;

	
	@Override
	public Tanaman findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void saveTanaman(Tanaman tanaman) {
		 dao.saveTanaman(tanaman);
	}

	@Override
	public void updateTanaman(Tanaman tanaman) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTanamanById(int id) {
		dao.deleteTanamanById(id);
	}

	@Override
	public List<Tanaman> findAllTanamans() {
		return dao.findAllTanamans();
	}


	@Override
	public boolean isTanamanDomainUnique(Integer id, String domain) {
		 Tanaman tanaman = findById(id);
	        return ( tanaman == null || ((id != null) && (tanaman.getId() == id)));
	}

	
}
