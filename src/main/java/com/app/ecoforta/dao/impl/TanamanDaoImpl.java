package com.app.ecoforta.dao.impl;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.app.ecoforta.dao.AbstractDao;
import com.app.ecoforta.dao.TanamanDao;
import com.app.ecoforta.model.Tanaman;
 
@Repository("tanamanDao")
public class TanamanDaoImpl extends AbstractDao<Integer, Tanaman> implements TanamanDao
{

	@Override
	public Tanaman findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveTanaman(Tanaman tanaman) {
		persist(tanaman);
		
	}

	@Override
	public void deleteTanamanById(int id) {
		Query query = getSession().createSQLQuery("delete from Tanaman where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tanaman> findAllTanamans() {
		Criteria criteria = createEntityCriteria();
        return (List<Tanaman>) criteria.list();
		
	}

}