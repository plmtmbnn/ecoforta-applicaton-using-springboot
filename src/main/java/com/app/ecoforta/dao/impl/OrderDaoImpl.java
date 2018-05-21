package com.app.ecoforta.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.app.ecoforta.dao.AbstractDao;
import com.app.ecoforta.dao.OrderDao;
import com.app.ecoforta.model.Orderlist;
 
@Repository("orderDao")
public class OrderDaoImpl extends AbstractDao<Integer, Orderlist> implements OrderDao{

	@Override
	public Orderlist findById(int id) {
		 return getByKey(id);
	}

	@Override
	public void saveEmployee(Orderlist order) {
		persist(order);
		
	}

	@Override
	public void deleteOrderlistBySsn(int id) {
		 Query query = getSession().createSQLQuery("delete from Orderlist where id = :id");
	        query.setInteger("id", id);
	        query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Orderlist> findAllOrderlists() {
		Criteria criteria = createEntityCriteria();
        return (List<Orderlist>) criteria.list();
	}

	@Override
	public List<Orderlist> findAllOrderlistsByBuyers(int id) {
		List<Orderlist> list = new ArrayList<>();
		for (Orderlist order : findAllOrderlists()) {
			if(order.getIdPembeli() == id)
			{
				list.add(order);
			}
		}
		return list;
		
	}
	

	@Override
	public int getTotalOrder(int id) 
	{
		int total = 0;
		for (Orderlist order : findAllOrderlists()) {
			if(order.getIdPembeli() == id)
			{
				total+=1;
			}
		}
		return total;
	}
}
