package com.app.ecoforta.service;


import java.util.List;

import com.app.ecoforta.model.Produk;

public interface ProdukService 
{
	Produk findById(int id);
    
    void saveProduk(Produk produk);
     
    void updateProduk(Produk produk);
     
    void deleteProdukById(int id);
 
    List<Produk> findAllProduks(); 
     
    Produk findProdukById(int id);

    List<Produk> findAllProduksByTipe(String tipe);
    
    public List<Produk> findAllProduksByJenisPengiriman(String jenisPengiriman); 
    
    List<Produk> findAllProduksByKeyword(String keyword);
    
    
    List<Produk> findAllProduksTermurah();
    
    List<Produk> findAllProduksTermahal();

}
