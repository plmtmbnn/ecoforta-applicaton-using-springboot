package com.app.ecoforta.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ecoforta.dao.OrderDao;
import com.app.ecoforta.model.Orderlist;

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService
{
	@Autowired
    private OrderDao dao;
	
	
	@Override
	public Orderlist findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void saveEmployee(Orderlist order) {
		dao.saveEmployee(order);
		
	}

	@Override
	public void deleteOrderlistBySsn(int id) {
		dao.deleteOrderlistBySsn(id);
	}

	@Override
	public List<Orderlist> findAllOrderlists() {
		return dao.findAllOrderlists();
	}

	@Override
	public List<Orderlist> findAllOrderlistsByBuyers(int id) {
		return dao.findAllOrderlistsByBuyers(id);
	}

	@Override
	public int getTotalOrder(int id) {
		return dao.getTotalOrder(id);
	}

	@Override
	public void updateOrder(Orderlist order) 
	{
		Orderlist entity = dao.findById(order.getId());
		if(entity != null)
		{
			entity.setFotoProduk(order.getFotoProduk());
			entity.setHarga(order.getHarga());
			entity.setId(order.getId());
			entity.setIdPembeli(order.getIdPembeli());
			entity.setJumlah(order.getJumlah());
			entity.setNamaProduk(order.getNamaProduk());	
			entity.setIdToko(order.getIdToko());
			entity.setIdProduk(order.getIdProduk());
		}
		
		
	}

}
