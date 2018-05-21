package com.app.ecoforta.service;

import java.util.List;

import com.app.ecoforta.model.SaleOrder;

public interface SaleService 
{
	SaleOrder findById(int id);
	 
    void saveSaleOrder(SaleOrder SaleOrder);
     
    void deleteProdukById(int id);
     
    List<SaleOrder> findAllSaleOrders();
    
    List<SaleOrder> findAllSaleOrderlistsByBuyer(int id);
    
    List<SaleOrder> findAllSaleOrderlistsBySeller(int id);
    
    void updateOrder(SaleOrder order);

   
}
