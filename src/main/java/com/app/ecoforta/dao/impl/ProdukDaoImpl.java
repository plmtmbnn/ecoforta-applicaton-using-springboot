package com.app.ecoforta.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.app.ecoforta.dao.AbstractDao;
import com.app.ecoforta.dao.ProdukDao;
import com.app.ecoforta.model.Produk;
 
@Repository("produkDao")
public class ProdukDaoImpl extends AbstractDao<Integer, Produk> implements ProdukDao
{

	@Override
	public Produk findById(int id) 
	{
		return getByKey(id);
	}

	@Override
	public void saveProduk(Produk produk) 
	{
		persist(produk);
	}

	@Override
	public void deleteProdukById(int id) 
	{
		 Query query = getSession().createSQLQuery("delete from Produk where id = :id");
	        query.setInteger("id", id);
	        query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Produk> findAllProduks() 
	{
		Criteria criteria = createEntityCriteria();
        return (List<Produk>) criteria.list();
	}

	@Override
	public Produk findProdukById(int id) 
	{
		Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        return (Produk) criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<Produk> findAllProduksByKeyword(String keyword) 
	{
		
		String text = "%" + keyword + "%";
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.like("namaProduk", text));
        return (List<Produk>) criteria.list();
		
        
//		
//		String hql = "FROM Produk P WHERE P.nama_produk like '%"+keyword+"%'";
//		Query query = getSession().createSQLQuery(hql);
//		 
//		return (List<Produk>) query.list();
	}

	@SuppressWarnings("unchecked")
	public List<Produk> findAllProduksTermurah() 
	{
		Criteria criteria = createEntityCriteria();
        criteria.addOrder(Order.asc("harga"));
        return (List<Produk>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<Produk> findAllProduksTermahal() 
	{
		Criteria criteria = createEntityCriteria();
        criteria.addOrder(Order.desc("harga"));
        return (List<Produk>) criteria.list();
	}

	

}
