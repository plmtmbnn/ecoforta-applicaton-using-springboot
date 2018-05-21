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
import com.app.ecoforta.model.Orderlist;
import com.app.ecoforta.model.Produk;
import com.app.ecoforta.model.Toko;
import com.app.ecoforta.model.User;
import com.app.ecoforta.service.OrderService;
import com.app.ecoforta.service.ProdukService;
import com.app.ecoforta.service.TokoService;
import com.app.ecoforta.service.UserService;

@Controller
@RequestMapping("/")
@SessionAttributes({ "jenisProduks" })
public class ProductController {

	@Autowired
	ProdukService produkService;

	@Autowired
	OrderService orderService;

	@Autowired
	TokoService tokoService;

	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/allproduk" }, method = RequestMethod.GET)
	public String listProduks(ModelMap model, HttpServletRequest request, HttpServletResponse response) 
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
		List<Produk> produks = produkService.findAllProduks();
		model.addAttribute("produks", produks);
		return "allproduk";
	}
	
	
	@RequestMapping(value = { "/allproduk" }, method = RequestMethod.POST)
	public String listProdukSearch(ModelMap model, HttpServletRequest request, HttpServletResponse response
			,@RequestParam("keyword") String keyword) 
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
		System.out.println(keyword +"lohhhh");
		List<Produk> produks = produkService.findAllProduksByKeyword(keyword);
		for (Produk produk : produks) 
		{
			System.out.println(produk.getNamaProduk() +" heheh");
		}
		
		model.addAttribute("produks", produks);
		return "allproduk";
	}
	
	
	@RequestMapping(value = { "/allproduk-Pupuk" }, method = RequestMethod.GET)
	public String listProduksby(ModelMap model, HttpServletRequest request, HttpServletResponse response
			) 
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
		List<Produk> produks = produkService.findAllProduksByTipe("Pupuk");
		model.addAttribute("produks", produks);
		return "allproduk";
	}
	
	
	@RequestMapping(value = { "/allproduk-Bibit" }, method = RequestMethod.GET)
	public String listProduksbys(ModelMap model, HttpServletRequest request, HttpServletResponse response
	) 
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
		List<Produk> produks = produkService.findAllProduksByTipe("Bibit");
		model.addAttribute("produks", produks);
		return "allproduk";
	}
	
	
	@RequestMapping(value = { "/allproduk-tipe1" }, method = RequestMethod.GET)
	public String listProduksbyss(ModelMap model, HttpServletRequest request, HttpServletResponse response
	) 
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
		List<Produk> produks = produkService.findAllProduksByJenisPengiriman("tipe1");
		model.addAttribute("produks", produks);
		return "allproduk";
	}
	
	@RequestMapping(value = { "/allproduk-tipe2" }, method = RequestMethod.GET)
	public String listProduksbysss(ModelMap model, HttpServletRequest request, HttpServletResponse response
	) 
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
		List<Produk> produks = produkService.findAllProduksByJenisPengiriman("tipe2");
		model.addAttribute("produks", produks);
		return "allproduk";
	}
	
	@RequestMapping(value = { "/allproduk-tipe3" }, method = RequestMethod.GET)
	public String listProduksbyssss(ModelMap model, HttpServletRequest request, HttpServletResponse response
	) 
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
		List<Produk> produks = produkService.findAllProduksByJenisPengiriman("tipe3");
		model.addAttribute("produks", produks);
		return "allproduk";
	}
	

	@RequestMapping(value = { "/allprodukss" }, method = RequestMethod.GET)
	public String beliProduks(ModelMap model, @PathVariable int idPembeli, HttpServletRequest request,
			HttpServletResponse response) {

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

		orderService.saveEmployee(order);
		List<Orderlist> list = orderService.findAllOrderlistsByBuyers(idPembeli);

		int total = orderService.getTotalOrder(idPembeli);
		model.addAttribute("list", list);
		model.addAttribute("order", order);
		model.addAttribute("total", total);
		System.out.println(orderService.getTotalOrder(idPembeli));
		return "redirect:" + "/keranjang";
	}

	@ModelAttribute("jenisProduks")
	List<String> getProdukList() {
		List<String> optionsJenisProduk = new ArrayList<String>();
		optionsJenisProduk.add("Bibit");
		optionsJenisProduk.add("Pupuk");
		return optionsJenisProduk;
	}

	@RequestMapping(value = { "/newproduk-{idToko}" }, method = RequestMethod.GET)
	public String newProduk(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			@PathVariable int idToko) {
		
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
		
		Produk produk = new Produk();

		if (request.getSession().getAttribute("user") == null) {
			return "redirect:" + "/login";
		} else {
			User user = (User) request.getSession().getAttribute("user");

		}
		model.addAttribute("produk", produk);
		model.addAttribute("edit", false);
		return "add_produk";
	}

	@RequestMapping(value = { "/newproduk-{idToko}" }, method = RequestMethod.POST)
	public String saveProduk(@Valid Produk produk, BindingResult result, ModelMap model, HttpServletRequest request,
			@RequestParam("fotoProduk") MultipartFile fotoProduk, @PathVariable int idToko)
			throws IllegalStateException, IOException {

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
		
		produk.setIdToko(idToko);
		produk.setNamaToko(tokoService.findById(idToko).getNamaToko());

		produk.setFotoProduk(fotoProduk.getOriginalFilename());

		if (produk.getTipePengiriman().equalsIgnoreCase("COD")) {
			produk.setTipePengiriman("tipe1");
		}
		if (produk.getTipePengiriman().equalsIgnoreCase("Transfer")) {
			produk.setTipePengiriman("tipe2");
		}
		if (produk.getTipePengiriman().equalsIgnoreCase("COD,Transfer")) {
			produk.setTipePengiriman("tipe3");
		}

		String saveDirectory = "D:/12S14026_POLMA/SEMESTER 5/PABWEB/Probes/Ecoforta/src/main/webapp/images/";

		String nama = fotoProduk.getOriginalFilename();
		fotoProduk.transferTo(new File(saveDirectory + nama));

		produkService.saveProduk(produk);

		return "redirect:" + "/allproduk";
	}

	// KERANJANG================================

	@RequestMapping(value = { "/keranjang" }, method = RequestMethod.GET)
	public String kerjang(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		Orderlist order = new Orderlist();

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
		
		if (request.getSession().getAttribute("user") == null) {
			return "redirect:" + "/login";
		} else {
			User user = (User) request.getSession().getAttribute("user");
			List<Orderlist> list = orderService.findAllOrderlistsByBuyers(user.getId());
			int totalPembayaran = 0;
			for (Orderlist orderlist : list) 
			{
				totalPembayaran += orderlist.getHarga() * orderlist.getJumlah();
			}

			int total = orderService.getTotalOrder(user.getId());

			model.addAttribute("list", list);
			model.addAttribute("order", order);
			model.addAttribute("total", total);
			model.addAttribute("totalPembayaran", totalPembayaran);
			return "keranjang";
		}
	}

	@RequestMapping(value = { "/beli-{idProduk}" }, method = RequestMethod.GET)
	public String beli(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			@PathVariable int idProduk) {
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
		
		
		if (request.getSession().getAttribute("user") == null) {
			return "redirect:" + "/login";
		} else {
			User user = (User) request.getSession().getAttribute("user");

			produkService.findById(idProduk);
			Orderlist ordernew = new Orderlist();
			ordernew.setId(0);
			ordernew.setIdProduk(idProduk);
			ordernew.setIdToko(produkService.findById(idProduk).getIdToko());
			ordernew.setIdPembeli(user.getId());
			ordernew.setFotoProduk(produkService.findById(idProduk).getFotoProduk());
			ordernew.setHarga(produkService.findById(idProduk).getHarga());
			ordernew.setNamaProduk(produkService.findById(idProduk).getNamaProduk());
			ordernew.setJumlah(1);

			List<Orderlist> list = orderService.findAllOrderlistsByBuyers(user.getId());

			boolean flag = false;

			for (Orderlist orderlist : list) {
				if (orderlist.getNamaProduk().equals(ordernew.getNamaProduk())) {
					int jumlah = orderlist.getJumlah();
					orderlist.setJumlah(jumlah + 1);

					flag = true;
					orderService.updateOrder(orderlist);
				}
			}

			if (flag == false) {
				orderService.saveEmployee(ordernew);
			}

			return "redirect:" + "/keranjang";
		}
	}

	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable int id) {
		orderService.deleteOrderlistBySsn(id);
		return "redirect:" + "/keranjang";
	}

	@RequestMapping(value = { "/tambah-{id}" }, method = RequestMethod.GET)
	public String tambah(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) {
		Orderlist ordernew = orderService.findById(id);
		int jumlah = ordernew.getJumlah();
		ordernew.setJumlah(jumlah + 1);
		orderService.updateOrder(ordernew);

		return "redirect:" + "/keranjang";
	}

	@RequestMapping(value = { "/kurang-{id}" }, method = RequestMethod.GET)
	public String kurang(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) {

		Orderlist ordernew = orderService.findById(id);
		if (ordernew.getJumlah() == 1) {
			return "redirect:" + "/delete-" + id + "";
		} else {
			int jumlah = ordernew.getJumlah();
			ordernew.setJumlah(jumlah - 1);
			orderService.updateOrder(ordernew);
			return "redirect:" + "/keranjang";
		}
	}

	
	
	@RequestMapping(value = { "/termahal" }, method = RequestMethod.GET)
	public String listProduksMahal(ModelMap model, HttpServletRequest request, HttpServletResponse response
	) 
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
		List<Produk> produks = produkService.findAllProduksTermahal();
		model.addAttribute("produks", produks);
		return "allproduk";
	}
	
	
	@RequestMapping(value = { "/termurah" }, method = RequestMethod.GET)
	public String listProduksMurah(ModelMap model, HttpServletRequest request, HttpServletResponse response
	) 
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
		List<Produk> produks = produkService.findAllProduksTermurah();
		model.addAttribute("produks", produks);
		return "allproduk";
	}
}