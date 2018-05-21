package com.app.ecoforta.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="ORDERLIST")
public class Orderlist 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@NotNull
    @Size(min=3, max=255)
    @Column(name = "NAMA_PRODUK", nullable = false)
    private String namaProduk;
	
	@Column(name = "HARGA")
    private int harga;
	
	@Column(name = "JUMLAH")
    private int jumlah;
	
	@Column(name = "ID_PEMBELI")
    private int idPembeli;
	
	@Column(name = "idToko")
    private int idToko;
	
	@Column(name = "idProduk")
    private int idProduk;
	
	@NotNull
    @Size(min=3, max=250)
    @Column(name = "FOTO_PRODUK", nullable = false)
    private String fotoProduk;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNamaProduk() {
		return namaProduk;
	}


	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}


	public int getHarga() {
		return harga;
	}


	public void setHarga(int harga) {
		this.harga = harga;
	}


	public int getJumlah() {
		return jumlah;
	}


	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}


	public int getIdPembeli() {
		return idPembeli;
	}


	public void setIdPembeli(int idPembeli) {
		this.idPembeli = idPembeli;
	}


	public String getFotoProduk() {
		return fotoProduk;
	}


	public void setFotoProduk(String fotoProduk) {
		this.fotoProduk = fotoProduk;
	}


	public int getIdToko() {
		return idToko;
	}


	public void setIdToko(int idToko) {
		this.idToko = idToko;
	}


	public int getIdProduk() {
		return idProduk;
	}


	public void setIdProduk(int idProduk) {
		this.idProduk = idProduk;
	}	
	
	
}
