package com.app.ecoforta.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.ecoforta.model.Produk;
import com.app.ecoforta.model.SaleOrder;
import com.app.ecoforta.model.Toko;
import com.app.ecoforta.model.User;
import com.app.ecoforta.service.OrderService;
import com.app.ecoforta.service.ProdukService;
import com.app.ecoforta.service.SaleService;
import com.app.ecoforta.service.TokoService;
import com.app.ecoforta.service.UserService;
 
@Controller
@RequestMapping("/")
public class LoginController 
{
 
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
 
    @RequestMapping(value = { "/profile" }, method = RequestMethod.GET)
    public String profile(ModelMap model
   		 ,HttpServletRequest request, HttpServletResponse response) 
    {
    	
    	User userz = new User();    
    	String  sesi = "no";
		if(request.getSession().getAttribute("user") == null)
        {
			sesi="no";        	
        }
        else
        {
        	sesi = "yes";
        	userz = (User) request.getSession().getAttribute("user");
    	}
		model.addAttribute("sesi",sesi);
    	
        
        
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
    	
    		
        if(request.getSession().getAttribute("user") == null)
        {        	
        	return "redirect:" +"/login";
        }
        else
        {
        	userz = (User) request.getSession().getAttribute("user");        	
    	}
        
        
        List<Toko> list = tokoService.findAllTokos();
        
        int total = 0;
        
        List<Toko> tokos = new ArrayList<Toko>();
        
        for (Toko toko : list) 
        {
        	if(toko.getIdSeller() == userz.getId())
        	{
        		total += 1;
        		tokos.add(toko);
        	}
		}        
        User user = userService.findById(userz.getId()); 
        model.addAttribute("user", user);
        model.addAttribute("total", total);
        model.addAttribute("tokos",tokos);
        return "profile";
    }

    
    @RequestMapping(value = { "/editprofile" }, method = RequestMethod.GET)
    public String editprofile(ModelMap model
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
        List<Toko> list = tokoService.findAllTokos();
        
        int total = 0;
        
        List<Toko> tokos = new ArrayList<Toko>();
        
        for (Toko toko : list) 
        {
        	if(toko.getIdSeller() == userz.getId())
        	{
        		total += 1;
        		tokos.add(toko);
        	}
		}
        model.addAttribute("total", total);
        
        
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
        
        User user = userService.findById(userz.getId()); 
        model.addAttribute("user", user);
        
        model.addAttribute("tokos",tokos);
        return "editprofile";
    }

    
    @RequestMapping(value = { "/editprofile" }, method = RequestMethod.POST)
    public String editprofiles(@Valid User user, ModelMap model
   		 ,HttpServletRequest request, HttpServletResponse response) 
    {
    	User userz = new User();    
    	String  sesi = "no";
		if(request.getSession().getAttribute("user") == null)
        {
			sesi="no";        	
        }
        else
        {
        	sesi = "yes";
        	userz = (User) request.getSession().getAttribute("user");
    	}
		model.addAttribute("sesi",sesi);
    	userService.updateUser(user);
        model.addAttribute("user", user);
        
        
        
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
        
        return "redirect:" +"/profile";
    }
    
    
    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public String login(ModelMap model ,HttpServletRequest request, HttpServletResponse response) 
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
        return "login";
    }

    @RequestMapping(value = { "/login" }, method = RequestMethod.POST)
    public String masuk(ModelMap model, @RequestParam("username") String username, @RequestParam("password") String password
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
    	
    	if(userService.login(username, password) != null)
    	{
    		
    		request.getSession().setAttribute("user", userService.login(username, password));  		
    		
    		return "redirect:" +"/beranda";
    	}
    	else
    	{
    		return "login";
    	}
    }
    
    @RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
    public String logout(ModelMap model ,HttpServletRequest request, HttpServletResponse response) 
    {
    	request.getSession().removeAttribute("user");
        return "redirect:" +"/login";
    }
    

    @RequestMapping(value = { "/register" }, method = RequestMethod.GET)
    public String register(ModelMap model ,HttpServletRequest request, HttpServletResponse response) {
    	
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
    	
    	User user = new User();
    	System.out.println(userService.findById(2).getTanggalLahir());

        model.addAttribute("user", user);
    	return "register";
    }
    
    
    
    @RequestMapping(value = { "/register" }, method = RequestMethod.POST)
    public String registers(@Valid User user, BindingResult result,
            ModelMap model,@RequestParam("avatar") MultipartFile avatar)  throws IllegalStateException, IOException 
    {
    	String saveDirectory = "D:/12S14026_POLMA/SEMESTER 5/PABWEB/Probes/Ecoforta/src/main/webapp/images/";  	
    	String nama = avatar.getOriginalFilename();
    	avatar.transferTo(new File(saveDirectory+nama));   	    			
    	user.setAvatar(avatar.getOriginalFilename());
    	user.setRole("user");
    	
	    userService.registerUser(user);
	    return "redirect:" +"/login";
    }
    

    
    
}	