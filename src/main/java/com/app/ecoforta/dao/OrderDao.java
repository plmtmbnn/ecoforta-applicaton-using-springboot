package com.app.ecoforta.dao;

import java.util.List;

import com.app.ecoforta.model.Orderlist;

public interface OrderDao 
{
	Orderlist findById(int id);
	 
    void saveEmployee(Orderlist order);
     
    void deleteOrderlistBySsn(int id);
     
    List<Orderlist> findAllOrderlists();
    
    List<Orderlist> findAllOrderlistsByBuyers(int id);
 
    
    int getTotalOrder(int id);
    
}
