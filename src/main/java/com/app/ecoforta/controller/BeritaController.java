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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.app.ecoforta.model.Berita;
import com.app.ecoforta.model.Orderlist;
import com.app.ecoforta.model.Produk;
import com.app.ecoforta.model.Toko;
import com.app.ecoforta.model.User;
import com.app.ecoforta.service.BeritaService;
import com.app.ecoforta.service.OrderService;
import com.app.ecoforta.service.ProdukService;
import com.app.ecoforta.service.SaleService;
import com.app.ecoforta.service.TokoService;
import com.app.ecoforta.service.UserService;

@Controller
@RequestMapping("/")
public class BeritaController 
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
	BeritaService beritaService;

	
	@RequestMapping(value = { "/berita" }, method = RequestMethod.GET)
	public String berita(ModelMap model, HttpServletRequest request, HttpServletResponse response) 
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
		List<Berita> beritas = beritaService.findAllBeritas();
		model.addAttribute("beritas", beritas);
		return "berita";
	}

	
	@RequestMapping(value = { "/bacaberita-{id}" }, method = RequestMethod.GET)
	public String bacaberita(ModelMap model,@PathVariable int id
			, HttpServletRequest request, HttpServletResponse response) 
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
		User user = (User) request.getSession().getAttribute("user");
		Berita berita = beritaService.findById(id);
		System.out.println(berita.getFoto());
		model.addAttribute("berita", berita);
		model.addAttribute("user", user);
		return "beritadetail";
	}
	
	
	@RequestMapping(value = { "/newberita" }, method = RequestMethod.GET)
	public String newBerita(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		
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
		Berita berita = new Berita();
		model.addAttribute("berita", berita);
		model.addAttribute("edit", false);
		return "tambah_berita";
	}
	
	
	@RequestMapping(value = { "/newberita" }, method = RequestMethod.POST)
	public String saveBerita(@Valid Berita berita, BindingResult result, HttpServletRequest request, ModelMap model,
			@RequestParam("foto") MultipartFile foto) throws IllegalStateException, IOException {

		String saveDirectory = "D:/12S14026_POLMA/SEMESTER 5/PABWEB/Probes/Ecoforta/src/main/webapp/images/";
		String nama = foto.getOriginalFilename();
		foto.transferTo(new File(saveDirectory + nama));

		User userz = (User) request.getSession().getAttribute("user");
		berita.setIdAuthor(userz.getId());
		berita.setFoto(foto.getOriginalFilename());
		beritaService.saveBerita(berita);

		return "redirect:" + "/berita";
	}
	

}
