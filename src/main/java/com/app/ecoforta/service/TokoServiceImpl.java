package com.app.ecoforta.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ecoforta.dao.TokoDao;
import com.app.ecoforta.model.Toko;

@Service("tokoService")
@Transactional
public class TokoServiceImpl implements TokoService
{
	@Autowired
    private TokoDao dao;

	
	@Override
	public Toko findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void saveToko(Toko toko) {
		 dao.saveToko(toko);
	}

	@Override
	public void updateToko(Toko toko) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTokoById(int id) {
		dao.deleteTokoById(id);
	}

	@Override
	public List<Toko> findAllTokos() {
		return dao.findAllTokos();
	}

	@Override
	public Toko findTokoById(int id) {
		return dao.findTokoById(id);
	}

	

	
}
