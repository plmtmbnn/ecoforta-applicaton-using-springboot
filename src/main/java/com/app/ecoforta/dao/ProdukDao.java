package com.app.ecoforta.dao;


import java.util.List;

import com.app.ecoforta.model.Produk;

public interface ProdukDao 
{
	Produk findById(int id);
	 
    void saveProduk(Produk produk);
     
    void deleteProdukById(int id);
     
    List<Produk> findAllProduks();
 
    Produk findProdukById(int id);
    
    List<Produk> findAllProduksByKeyword(String keyword);
   
    
    List<Produk> findAllProduksTermurah();
    
    List<Produk> findAllProduksTermahal();
    
}
