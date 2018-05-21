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
@Table(name="TANAMAN")
public class Tanaman 
{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 
    @NotNull
    @Size(min=3, max=255)
    @Column(name = "NAMA_TANAMAN", nullable = false)
    private String nama_tanaman;
    
    @Size(min=3, max=255)
    @Column(name = "DESKRIPSI", nullable = false)
    private String deskripsi;

    @Size(min=3, max=255)
    @Column(name = "GAMBAR", nullable = false)
    private String gambar;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama_tanaman() {
		return nama_tanaman;
	}

	public void setNama_tanaman(String nama_tanaman) {
		this.nama_tanaman = nama_tanaman;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}

	public String getGambar() {
		return gambar;
	}

	public void setGambar(String gambar) {
		this.gambar = gambar;
	}

    
}
