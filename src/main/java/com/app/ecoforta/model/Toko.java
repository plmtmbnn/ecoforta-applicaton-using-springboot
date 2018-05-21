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
@Table(name="TOKO")
public class Toko 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 
	@NotNull
    @Size(min=3, max=255)
    @Column(name = "NAMA_TOKO", nullable = false)
    private String namaToko;
 
    @NotNull
    @Size(min=3, max=255)
    @Column(name = "DOMAIN_TOKO", nullable = false)
    private String domainToko;
    
    @Size(min=3, max=255)
    @Column(name = "ALAMAT", nullable = false)
    private String alamat;

    @Size(min=3, max=255)
    @Column(name = "KONTAK", nullable = false)
    private String kontak;

    
    @Size(min=3, max=255)
    @Column(name = "FOTO", nullable = false)
    private String foto;
    
    @Column(name = "idSeller")
    private int idSeller;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamaToko() {
		return namaToko;
	}

	public void setNamaToko(String namaToko) {
		this.namaToko = namaToko;
	}

	public String getDomainToko() {
		return domainToko;
	}

	public void setDomainToko(String domainToko) {
		this.domainToko = domainToko;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getKontak() {
		return kontak;
	}

	public void setKontak(String kontak) {
		this.kontak = kontak;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getIdSeller() {
		return idSeller;
	}

	public void setIdSeller(int idSeller) {
		this.idSeller = idSeller;
	}
    
    
    
    
    
}
