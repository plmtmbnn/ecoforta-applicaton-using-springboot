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
@Table(name = "PRODUK")
public class Produk {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@Size(min = 3, max = 50)
	@Column(name = "NAMA_PRODUK", nullable = false)
	private String namaProduk;

	@Size(min = 3, max = 50)
	@Column(name = "NAMA_TOKO", nullable = false)
	private String namaToko;

	@Column(name = "HARGA")
	private int harga;

	@Column(name = "JUMLAH")
	private int jumlah;

	@Column(name = "idToko")
	private int idToko;

	@NotNull
	@Size(min = 3, max = 50)
	@Column(name = "JENIS_PRODUK", nullable = false)
	private String jenisProduk;

	@Size(min = 3, max = 50)
	@Column(name = "TIPE_PENGIRIMAN", nullable = false)
	private String tipePengiriman;

	@NotNull
	@Size(min = 3, max = 50)
	@Column(name = "DESKRIPSI", nullable = false)
	private String deskripsi;

	@NotNull
	@Size(min = 3, max = 50)
	@Column(name = "FOTO_PRODUK", nullable = false)
	private String fotoProduk;

	public int getId() {
		return id;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public int getIdToko() {
		return idToko;
	}

	public void setIdToko(int idToko) {
		this.idToko = idToko;
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

	public String getNamaToko() {
		return namaToko;
	}

	public void setNamaToko(String namaToko) {
		this.namaToko = namaToko;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public String getJenisProduk() {
		return jenisProduk;
	}

	public void setJenisProduk(String jenisProduk) {
		this.jenisProduk = jenisProduk;
	}

	public String getTipePengiriman() {
		return tipePengiriman;
	}

	public void setTipePengiriman(String tipePengiriman) {
		this.tipePengiriman = tipePengiriman;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}

	public String getFotoProduk() {
		return fotoProduk;
	}

	public void setFotoProduk(String fotoProduk) {
		this.fotoProduk = fotoProduk;
	}

}
