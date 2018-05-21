package com.app.ecoforta.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ecoforta.dao.ProdukDao;
import com.app.ecoforta.model.Produk;

@Service("produkService")
@Transactional
public class ProdukServiceImpl implements ProdukService
{
	@Autowired
    private ProdukDao dao;
	
	@Override
	public Produk findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void saveProduk(Produk produk) {
		dao.saveProduk(produk);
	}

	@Override
	public void updateProduk(Produk produk) 
	{
		Produk entity = findById(produk.getId());
		if(entity != null)
		{
			entity.setDeskripsi(produk.getDeskripsi());
			entity.setFotoProduk(produk.getFotoProduk());
			entity.setHarga(produk.getHarga());
			entity.setId(produk.getId());
			entity.setIdToko(produk.getIdToko());
			entity.setJenisProduk(produk.getJenisProduk());
			entity.setJumlah(produk.getJumlah());
			entity.setNamaProduk(produk.getNamaProduk());
			entity.setNamaToko(produk.getNamaToko());
			entity.setTipePengiriman(produk.getTipePengiriman());
		}
	}

	@Override
	public void deleteProdukById(int id) {
		dao.deleteProdukById(id);
	}

	@Override
	public List<Produk> findAllProduks() {
		return dao.findAllProduks();
	}

	@Override
	public Produk findProdukById(int id) {
		return dao.findProdukById(id);
	}

	@Override
	public List<Produk> findAllProduksByTipe(String tipe) 
	{
		List<Produk> list = new ArrayList<Produk>();
		
		for (Produk produk : findAllProduks()) 
		{
			if(produk.getJenisProduk().equalsIgnoreCase(tipe))
			{
				list.add(produk);
			}
		}
		return list;
	}
	
	@Override
	public List<Produk> findAllProduksByJenisPengiriman(String jenisPengiriman) 
	{
		List<Produk> list = new ArrayList<Produk>();
		
		for (Produk produk : findAllProduks()) 
		{
			if(produk.getTipePengiriman().equalsIgnoreCase(jenisPengiriman))
			{
				list.add(produk);
			}
		}
		return list;
	}

	@Override
	public List<Produk> findAllProduksByKeyword(String keyword) 
	{
		return dao.findAllProduksByKeyword(keyword);
	}

	@Override
	public List<Produk> findAllProduksTermurah() 
	{
		return dao.findAllProduksTermurah();
	}

	@Override
	public List<Produk> findAllProduksTermahal() 
	{
		return dao.findAllProduksTermahal();
	}
	
}
