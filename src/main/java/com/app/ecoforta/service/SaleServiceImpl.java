package com.app.ecoforta.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ecoforta.dao.SalesDao;
import com.app.ecoforta.model.SaleOrder;

@Service("saleService")
@Transactional
public class SaleServiceImpl implements SaleService
{
	@Autowired
    private SalesDao dao;

	@Override
	public SaleOrder findById(int id) 
	{
		return dao.findById(id);
	}

	@Override
	public void saveSaleOrder(SaleOrder SaleOrder) 
	{
		dao.saveSaleOrder(SaleOrder);
	}

	@Override
	public void deleteProdukById(int id) 
	{
		dao.deleteProdukById(id);
	}

	@Override
	public List<SaleOrder> findAllSaleOrders() 
	{
		return dao.findAllSaleOrders();
	}

	@Override
	public List<SaleOrder> findAllSaleOrderlistsByBuyer(int id) 
	{
		List<SaleOrder> sales = new ArrayList<SaleOrder>();
		List<SaleOrder> alllist= findAllSaleOrders();
		for (SaleOrder saleOrder : alllist) 
		{
			if(saleOrder.getIdBuyer() == id)
			{
				sales.add(saleOrder);
			}
		}
		
		return sales;
	}

	@Override
	public List<SaleOrder> findAllSaleOrderlistsBySeller(int id) 
	{
		List<SaleOrder> sales = new ArrayList<SaleOrder>();
		List<SaleOrder> alllist= findAllSaleOrders();
		for (SaleOrder saleOrder : alllist) 
		{
			if(saleOrder.getIdSeller() == id)
			{
				sales.add(saleOrder);
			}
		}
		
		return sales;
	}

	@Override
	public void updateOrder(SaleOrder order) 
	{
		SaleOrder entity = dao.findById(order.getId());
		if(entity != null)
		{
			entity.setAlamat(order.getAlamat());
			entity.setHarga(order.getHarga());
			entity.setId(order.getId());
			entity.setIdBuyer(order.getIdBuyer());
			entity.setIdProduk(order.getIdProduk());
			entity.setIdSeller(order.getIdSeller());
			entity.setJumlah(order.getJumlah());
			entity.setKeterangan(order.getKeterangan());
			entity.setNamaPenerima(order.getNamaPenerima());
			entity.setNamaProduk(order.getNamaProduk());
			entity.setStatus(order.getStatus());			
			entity.setLokasi(order.getLokasi());
			entity.setRekeningBank(order.getRekeningBank());
		}		
	}


	
}
