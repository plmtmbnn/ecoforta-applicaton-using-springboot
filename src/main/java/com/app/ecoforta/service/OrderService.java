package com.app.ecoforta.service;

import java.util.List;

import com.app.ecoforta.model.Orderlist;

public interface OrderService 
{
	Orderlist findById(int id);
	 
    void saveEmployee(Orderlist order);
     
    void deleteOrderlistBySsn(int id);
     
    List<Orderlist> findAllOrderlists();
    
    List<Orderlist> findAllOrderlistsByBuyers(int id);
 
    void updateOrder(Orderlist order);
    
    int getTotalOrder(int id);

}
