package com.app.ecoforta.dao.impl;


import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.app.ecoforta.dao.AbstractDao;
import com.app.ecoforta.dao.TokoDao;
import com.app.ecoforta.model.Toko;
 
@Repository("tokoDao")
public class TokoDaoImpl extends AbstractDao<Integer, Toko> implements TokoDao
{

	@Override
	public Toko findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveToko(Toko toko) {
		persist(toko);
	}

	@Override
	public void deleteTokoById(int id) {
		 Query query = getSession().createSQLQuery("delete from Toko where id = :id");
	        query.setInteger("id", id);
	        query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Toko> findAllTokos() {
		Criteria criteria = createEntityCriteria();
        return (List<Toko>) criteria.list();
	}

	@Override
	public Toko findTokoById(int id) {
		Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        return (Toko) criteria.uniqueResult();
	}
}
