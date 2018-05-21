package com.app.ecoforta.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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
public class TokoController {

	@Autowired
	UserService userService;

	@Autowired
	ProdukService produkService;

	@Autowired
	OrderService orderService;

	@Autowired
	   SaleService saleService;
	    
	
	@Autowired
	TokoService tokoService;

	@RequestMapping(value = { "/alltoko" }, method = RequestMethod.GET)
	public String tokos(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		
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
		
		
		if (request.getSession().getAttribute("user") == null) {
			return "redirect:" + "/login";
		} else {
			userz = (User) request.getSession().getAttribute("user");
		}
		List<Toko> list = tokoService.findAllTokos();

		int total = 0;

		List<Toko> tokos = new ArrayList<Toko>();

		for (Toko toko : list) {
			if (toko.getIdSeller() == userz.getId()) {
				total += 1;
				tokos.add(toko);

			}
		}

		User user = userService.findById(userz.getId());
		model.addAttribute("user", user);
		model.addAttribute("total", total);
		model.addAttribute("tokos", tokos);
		return "alltoko";
	}

	@RequestMapping(value = { "/allproduk-{idToko}" }, method = RequestMethod.GET)
	public String listProdukss(ModelMap model, @PathVariable int idToko, HttpServletRequest request, HttpServletResponse response) {

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
		
		
		List<Produk> list = produkService.findAllProduks();
		List<Produk> produks = new ArrayList<Produk>();
		for (Produk produk : list) {
			if (produk.getIdToko() == idToko) {
				produks.add(produk);
			}

		}
		model.addAttribute("idToko", idToko);
		model.addAttribute("produks", produks);
		return "toko";
	}

	/*
	 * This method will provide the medium to add a new toko.
	 */
	@RequestMapping(value = { "/newtoko" }, method = RequestMethod.GET)
	public String newToko(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		
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
		
		Toko toko = new Toko();
		model.addAttribute("toko", toko);
		model.addAttribute("edit", false);
		return "tambah_toko";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/newtoko" }, method = RequestMethod.POST)
	public String saveToko(@Valid Toko toko, BindingResult result, HttpServletRequest request, ModelMap model,
			@RequestParam("foto") MultipartFile foto) throws IllegalStateException, IOException {

		String saveDirectory = "D:/12S14026_POLMA/SEMESTER 5/PABWEB/Probes/Ecoforta/src/main/webapp/images/";
		String nama = foto.getOriginalFilename();
		foto.transferTo(new File(saveDirectory + nama));

		User userz = (User) request.getSession().getAttribute("user");
		toko.setIdSeller(userz.getId());
		System.out.println(toko.getIdSeller());
		toko.setFoto(foto.getOriginalFilename());
		System.out.println("Sebelum");
		tokoService.saveToko(toko);
		System.out.println("Sesudah");

		return "redirect:" + "/alltoko";
	}

	/*
	 * This method will provide the medium to update an existing toko.
	 */
	@RequestMapping(value = { "/edit-{id}-toko" }, method = RequestMethod.GET)
	public String editToko(@PathVariable int id, ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		
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
		
		Toko toko = tokoService.findTokoById(id);
		model.addAttribute("toko", toko);
		model.addAttribute("edit", true);
		return "tambah_toko";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * updating employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-{id}-toko" }, method = RequestMethod.POST)
	public String updateToko(@Valid Toko toko, BindingResult result, ModelMap model, @PathVariable int id, HttpServletRequest request, HttpServletResponse response) {

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
		
		
		tokoService.updateToko(toko);

		model.addAttribute("success", "Toko " + toko.getNamaToko() + " updated successfully");
		return "success";
	}

	/*
	 * This method will delete an employee by it's SSN value.
	 */
	@RequestMapping(value = { "/delete-{id}-toko" }, method = RequestMethod.GET)
	public String deleteToko(@PathVariable int id) {
		tokoService.deleteTokoById(id);
		return "redirect:/list";
	}

}