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
@Table(name="PRODUKTERJUAL")
public class SaleOrder 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "idBuyer")
    private int idBuyer;
	
	@Column(name = "idSeller")
    private int idSeller;
	
	@Column(name = "idProduk")
    private int idProduk;
	
	@NotNull
    @Size(min=3, max=255)
    @Column(name = "namaProduk", nullable = false)
    private String namaProduk;
	
	@Column(name = "HARGA")
    private int harga;
	
	@Column(name = "JUMLAH")
    private int jumlah;
	
	@NotNull
    @Size(min=1, max=255)
    @Column(name = "STATUS", nullable = false)
    private String status;

	@NotNull
    @Size(min=3, max=255)
    @Column(name = "keterangan", nullable = false)
    private String keterangan;
	
    
    @NotNull
    @Size(min=3, max=255)
    @Column(name = "alamat", nullable = false)
    private String alamat;
    
    @NotNull
    @Size(min=3, max=255)
    @Column(name = "namaPenerima", nullable = false)
    private String namaPenerima;

    @NotNull
    @Size(min=3, max=255)
    @Column(name = "lokasi", nullable = false)
    private String lokasi;
    
    @NotNull
    @Size(min=3, max=255)
    @Column(name = "rekeningBank", nullable = false)
    private String rekeningBank;
    
    
	public String getLokasi() {
		return lokasi;
	}

	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}

	public String getRekeningBank() {
		return rekeningBank;
	}

	public void setRekeningBank(String rekeningBank) {
		this.rekeningBank = rekeningBank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdBuyer() {
		return idBuyer;
	}

	public void setIdBuyer(int idBuyer) {
		this.idBuyer = idBuyer;
	}

	public int getIdSeller() {
		return idSeller;
	}

	public void setIdSeller(int idSeller) {
		this.idSeller = idSeller;
	}

	public int getIdProduk() {
		return idProduk;
	}

	public void setIdProduk(int idProduk) {
		this.idProduk = idProduk;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNamaPenerima() {
		return namaPenerima;
	}

	public void setNamaPenerima(String namaPenerima) {
		this.namaPenerima = namaPenerima;
	}
    
}
