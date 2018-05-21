package com.app.ecoforta.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.ecoforta.model.Toko;
import com.app.ecoforta.model.User;
import com.app.ecoforta.model.Orderlist;
import com.app.ecoforta.model.Produk;
import com.app.ecoforta.model.SaleOrder;
import com.app.ecoforta.service.OrderService;
import com.app.ecoforta.service.ProdukService;
import com.app.ecoforta.service.SaleService;
import com.app.ecoforta.service.TokoService;
import com.app.ecoforta.service.UserService;
 
@Controller
@RequestMapping("/")
public class OrderController {
 
	
	@Autowired
	 TokoService tokoService;
	 
   @Autowired
   UserService userService;

   @Autowired
   ProdukService produkService;

   @Autowired
   OrderService orderService;

   @Autowired
   SaleService saleService;
    
    @Autowired
    MessageSource messageSource;
 
    /*
     * This method will list all existing employees.
     */
    @RequestMapping(value = { "/penjualan"}, method = RequestMethod.GET)
    public String asfasa(ModelMap model
     		 ,HttpServletRequest request, HttpServletResponse response) 
    {
    	String  sesi = "no";
		if(request.getSession().getAttribute("user") == null)
        {
			sesi="no";        	
        }
        else
        {
        	sesi = "yes";        	
    	}
		model.addAttribute("sesi",sesi);
    	User userz = new User();    	
        if(request.getSession().getAttribute("user") == null)
        {        	
        	return "redirect:" +"/login";
        }
        else
        {
        	userz = (User) request.getSession().getAttribute("user");        	
    	}
        List<SaleOrder> list = saleService.findAllSaleOrderlistsBySeller(userz.getId());
        
        int total = 0;
        
        List<Toko> tokos = new ArrayList<Toko>();
        
        for (Toko toko : tokoService.findAllTokos()) 
        {
        	if(toko.getIdSeller() == userz.getId())
        	{
        		total += 1;
        		tokos.add(toko);
        	}
		}
        
        
        
List<SaleOrder> listz = saleService.findAllSaleOrderlistsByBuyer(userz.getId());
        
        int totalOrderBeli = 0;
        for (SaleOrder saleOrder : listz) 
        {
        	if(saleOrder.getStatus().equalsIgnoreCase("A") ||saleOrder.getStatus().equalsIgnoreCase("B")||saleOrder.getStatus().equalsIgnoreCase("C") )
        	{
        		totalOrderBeli += 1;
        	}
		}
        model.addAttribute("totalOrderBeli",totalOrderBeli);
        
        
        List<SaleOrder> lists = saleService.findAllSaleOrderlistsBySeller(userz.getId());
        
        int totalOrderJual = 0;
        for (SaleOrder saleOrder : lists) 
        {
        	if(saleOrder.getStatus().equalsIgnoreCase("A") ||saleOrder.getStatus().equalsIgnoreCase("B")||saleOrder.getStatus().equalsIgnoreCase("C") )
        	{
        		totalOrderJual += 1;
        	}
		}
        model.addAttribute("totalOrderJual",totalOrderJual);
        
        model.addAttribute("total", total);
        model.addAttribute("list",list);
        return "penjualan";
    }
 
    

    @RequestMapping(value = { "/pembelian" }, method = RequestMethod.GET)
    public String asgawg(ModelMap model
      		 ,HttpServletRequest request, HttpServletResponse response) 
    {
    	String  sesi = "no";
		if(request.getSession().getAttribute("user") == null)
        {
			sesi="no";        	
        }
        else
        {
        	sesi = "yes";        	
    	}
		model.addAttribute("sesi",sesi);
    	User userz = new User();    	
        if(request.getSession().getAttribute("user") == null)
        {        	
        	return "redirect:" +"/login";
        }
        else
        {
        	userz = (User) request.getSession().getAttribute("user");        	
    	}
        
        List<SaleOrder> list = saleService.findAllSaleOrderlistsByBuyer(userz.getId());
        
        int totalOrderBeli = 0;
        for (SaleOrder saleOrder : list) 
        {
        	if(saleOrder.getStatus().equalsIgnoreCase("A") ||saleOrder.getStatus().equalsIgnoreCase("B")||saleOrder.getStatus().equalsIgnoreCase("C") )
        	{
        		totalOrderBeli += 1;
        	}
		}
        model.addAttribute("totalOrderBeli",totalOrderBeli);
        
        
        List<SaleOrder> lists = saleService.findAllSaleOrderlistsBySeller(userz.getId());
        
        int totalOrderJual = 0;
        for (SaleOrder saleOrder : lists) 
        {
        	if(saleOrder.getStatus().equalsIgnoreCase("A") ||saleOrder.getStatus().equalsIgnoreCase("B")||saleOrder.getStatus().equalsIgnoreCase("C") )
        	{
        		totalOrderJual += 1;
        	}
		}
        model.addAttribute("totalOrderJual",totalOrderJual);
        
        int total = 0;
        
        List<Toko> tokos = new ArrayList<Toko>();
        
        for (Toko toko : tokoService.findAllTokos()) 
        {
        	if(toko.getIdSeller() == userz.getId())
        	{
        		total += 1;
        		tokos.add(toko);
        	}
		}
        model.addAttribute("total", total);
        
        model.addAttribute("list",list);
        return "pembelian";
    }

}	