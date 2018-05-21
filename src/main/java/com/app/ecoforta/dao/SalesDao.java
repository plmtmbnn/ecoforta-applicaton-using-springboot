package com.app.ecoforta.dao;

import java.util.List;

import com.app.ecoforta.model.SaleOrder;

public interface SalesDao 
{
	SaleOrder findById(int id);
	 
    void saveSaleOrder(SaleOrder SaleOrder);
     
    void deleteProdukById(int id);
     
    List<SaleOrder> findAllSaleOrders();
}
