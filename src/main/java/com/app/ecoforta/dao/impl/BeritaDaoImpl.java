package com.app.ecoforta.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.app.ecoforta.dao.AbstractDao;
import com.app.ecoforta.dao.BeritaDao;
import com.app.ecoforta.dao.OrderDao;
import com.app.ecoforta.model.Berita;
import com.app.ecoforta.model.Orderlist;
 
@Repository("beritaDao")
public class BeritaDaoImpl extends AbstractDao<Integer, Berita> implements BeritaDao
{

	@Override
	public Berita findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveBerita(Berita berita) {
		persist(berita);
		
	}

	@Override
	public void deletBeritaBySsn(int id) {
		 Query query = getSession().createSQLQuery("delete from berita where id = :id");
	        query.setInteger("id", id);
	        query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Berita> findAllBeritas() {
		Criteria criteria = createEntityCriteria();
        return (List<Berita>) criteria.list();
	}

}
