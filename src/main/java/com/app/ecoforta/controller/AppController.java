package com.app.ecoforta.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import javax.servlet.ServletContext;
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

import com.app.ecoforta.model.Toko;
import com.app.ecoforta.model.User;
import com.app.ecoforta.model.Berita;
import com.app.ecoforta.model.Orderlist;
import com.app.ecoforta.model.Produk;
import com.app.ecoforta.model.SaleOrder;
import com.app.ecoforta.service.BeritaService;
import com.app.ecoforta.service.OrderService;
import com.app.ecoforta.service.ProdukService;
import com.app.ecoforta.service.SaleService;
import com.app.ecoforta.service.TokoService;
import com.app.ecoforta.service.UserService;

@Controller
@RequestMapping("/")
@SessionAttributes({ "jenisProduks" })
public class AppController {

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

	@Autowired
	MessageSource messageSource;

	

	@RequestMapping(value = { "/forum"}, method = RequestMethod.GET)
	public String forum(ModelMap model, HttpServletRequest request, HttpServletResponse response) 
	{
		
		return "forum";
	}
	
	@RequestMapping(value = { "/beranda","/"  }, method = RequestMethod.GET)
	public String home(ModelMap model, HttpServletRequest request, HttpServletResponse response) 
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
		return "beranda";
	}
	
	

	
	
	@RequestMapping(value = { "/suksescheckout" }, method = RequestMethod.GET)
	public String suksess(ModelMap model, HttpServletRequest request, HttpServletResponse response) 
	{
		User user;
		String  sesi = "no";
		if(request.getSession().getAttribute("user") == null)
        {
			sesi="no";        	
        }
        else
        {
        	user = (User) request.getSession().getAttribute("user");
        	sesi = "yes";        
        	int total = 0;
        	List<SaleOrder> list = saleService.findAllSaleOrderlistsByBuyer(user.getId());
        	
        	for (SaleOrder saleOrder : list) 
        	{
				if(saleOrder.getStatus().equalsIgnoreCase("A"))
				{
					total+=saleOrder.getHarga();
				}
			}
        	
        	model.addAttribute("total",total);
    	}
		
		
				
		
		
		model.addAttribute("sesi",sesi);
		return "suksescheckout";
	}

	@RequestMapping(value = { "/infotanaman" }, method = RequestMethod.GET)
	public String infotanaman(ModelMap model, HttpServletRequest request, HttpServletResponse response) 
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
		return "infotanaman";
	}

	@RequestMapping(value = { "/checkout" }, method = RequestMethod.GET)
	public String checkout(ModelMap model, HttpServletRequest request, HttpServletResponse response) 
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
		
		
		Orderlist order = new Orderlist();

		if (request.getSession().getAttribute("user") == null) {
			return "redirect:" + "/login";
		} else {
			User user = (User) request.getSession().getAttribute("user");
			List<Orderlist> list = orderService.findAllOrderlistsByBuyers(user.getId());
			int totalPembayaran = 0;
			for (Orderlist orderlist : list) {
				totalPembayaran += orderlist.getHarga() * orderlist.getJumlah();
			}

			model.addAttribute("list", list);
			model.addAttribute("order", order);
			model.addAttribute("totalPembayaran", totalPembayaran);
			return "checkout";
		}
	}

	@RequestMapping(value = { "/checkout" }, method = RequestMethod.POST)
	public String checkouts(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			@RequestParam("namaPenerima") String namaPenerima, @RequestParam("rekeningBank") String rekeningBank,
			@RequestParam("lokasi") String lokasi, @RequestParam("alamat") String alamat,
			@RequestParam("keterangan") String keterangan) {

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
		

		Orderlist order = new Orderlist();

		if (request.getSession().getAttribute("user") == null) 
		{
			return "redirect:" + "/login";
		} 
		else 
		{
		
			SaleOrder saleOrder = new SaleOrder();

			User user = (User) request.getSession().getAttribute("user");
			List<Orderlist> list = orderService.findAllOrderlistsByBuyers(user.getId());
			
			for (Orderlist orderlist : list) 
			{
					 
				saleOrder.setAlamat(alamat);
				saleOrder.setHarga(orderlist.getHarga() * orderlist.getJumlah());
				saleOrder.setId(0);
				saleOrder.setIdBuyer(user.getId());
				saleOrder.setIdProduk(orderlist.getIdProduk());
				saleOrder.setIdSeller(tokoService.findById(orderlist.getIdToko()).getIdSeller());
				saleOrder.setJumlah(orderlist.getJumlah());
				saleOrder.setKeterangan(keterangan);
				saleOrder.setLokasi(lokasi);
				saleOrder.setNamaPenerima(namaPenerima);
				saleOrder.setNamaProduk(orderlist.getNamaProduk());
				saleOrder.setRekeningBank(rekeningBank);
				saleOrder.setStatus("A");
		
				saleService.saveSaleOrder(saleOrder);
				orderService.deleteOrderlistBySsn(orderlist.getId());
		
			}

			model.addAttribute("list", list);
			model.addAttribute("order", order);

			return "redirect:" + "/suksescheckout";
		}
	}
	
	
	@RequestMapping(value = { "/prosespesanan-{id}" }, method = RequestMethod.GET)
	public String prosesOrder(@PathVariable int id) 
	{
		SaleOrder sale  = saleService.findById(id);
		sale.setStatus("B");
		
		saleService.updateOrder(sale);
		return "redirect:" + "/penjualan";
	}
	
	@RequestMapping(value = { "/kirimpesanan-{id}" }, method = RequestMethod.GET)
	public String kirimOrder(@PathVariable int id) {
		SaleOrder sale  = saleService.findById(id);
		sale.setStatus("C");
		
		saleService.updateOrder(sale);
		return "redirect:" + "/penjualan";
	}
	
	
	@RequestMapping(value = { "/terimapesanan-{id}" }, method = RequestMethod.GET)
	public String terimaOrder(@PathVariable int id) {
		SaleOrder sale  = saleService.findById(id);
		sale.setStatus("D");
		
		saleService.updateOrder(sale);
		Produk produk  = produkService.findById(sale.getIdProduk());
		produk.setJumlah(produk.getJumlah()-1);
		produkService.updateProduk(produk) ;
		return "redirect:" + "/pembelian";
	}
	
	@RequestMapping(value = { "/batalpesanan-{id}" }, method = RequestMethod.GET)
	public String batalOrder(@PathVariable int id) {
		SaleOrder sale  = saleService.findById(id);
		sale.setStatus("E");
		
		saleService.updateOrder(sale);		
		return "redirect:" + "/penjualan";
	}
	
	@RequestMapping(value = { "/tambahjumlah-{id}" }, method = RequestMethod.GET)
	public String tambahjumlah(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) {
		Produk produk = produkService.findById(id);
		int jumlah = produk.getJumlah();
		produk.setJumlah(jumlah + 1);
		produkService.updateProduk(produk);

		return "redirect:" + "/allproduk-"+		tokoService.findById(produk.getIdToko()).getId();
	}
	
	@RequestMapping(value = { "/kurangjumlah-{id}" }, method = RequestMethod.GET)
	public String kurangjumlah(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) {
		Produk produk = produkService.findById(id);
		int jumlah = produk.getJumlah();
		produk.setJumlah(jumlah - 1);
		produkService.updateProduk(produk);

		return "redirect:" + "/allproduk-"+		tokoService.findById(produk.getIdToko()).getId();
	}
	
}