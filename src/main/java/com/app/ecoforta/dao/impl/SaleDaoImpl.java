package com.app.ecoforta.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.app.ecoforta.dao.AbstractDao;
import com.app.ecoforta.dao.SalesDao;
import com.app.ecoforta.model.SaleOrder;

@Repository("salesDao")
public class SaleDaoImpl extends AbstractDao<Integer, SaleOrder> implements SalesDao
{

	@Override
	public SaleOrder findById(int id) 
	{
		return getByKey(id);
	}

	@Override
	public void saveSaleOrder(SaleOrder SaleOrder) 
	{
		persist(SaleOrder);
	}

	@Override
	public void deleteProdukById(int id) 
	{
		Query query = getSession().createSQLQuery("delete from produkterjual where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<SaleOrder> findAllSaleOrders() 
	{
		Criteria criteria = createEntityCriteria();
        return (List<SaleOrder>) criteria.list();
	}

}
